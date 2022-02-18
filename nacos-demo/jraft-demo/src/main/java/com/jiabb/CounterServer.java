package com.jiabb;

import com.alipay.sofa.jraft.RaftGroupService;
import com.alipay.sofa.jraft.entity.PeerId;
import com.alipay.sofa.jraft.option.NodeOptions;
import com.alipay.sofa.jraft.rpc.RaftRpcServerFactory;
import com.alipay.sofa.jraft.rpc.RpcServer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CounterServer {

	public CounterServer(final String dataPath, final String groupId, final PeerId serverId,
	                     final NodeOptions nodeOptions) throws IOException {
		// 初始化路径
		FileUtils.forceMkdir(new File(dataPath));

		// 这里让 raft RPC 和业务 RPC 使用同一个 RPC server, 通常也可以分开
		final RpcServer rpcServer = new RpcServer(serverId.getPort());
		RaftRpcServerFactory.addRaftRequestProcessors(rpcServer);
		// 注册业务处理器
		rpcServer.registerUserProcessor(new GetValueRequestProcessor(this));
		rpcServer.registerUserProcessor(new IncrementAndGetRequestProcessor(this));
		// 初始化状态机
		this.fsm = new CounterStateMachine();
		// 设置状态机到启动参数
		nodeOptions.setFsm(this.fsm);
		// 设置存储路径
		// 日志, 必须
		nodeOptions.setLogUri(dataPath + File.separator + "log");
		// 元信息, 必须
		nodeOptions.setRaftMetaUri(dataPath + File.separator + "raft_meta");
		// snapshot, 可选, 一般都推荐
		nodeOptions.setSnapshotUri(dataPath + File.separator + "snapshot");
		// 初始化 raft group 服务框架
		this.raftGroupService = new RaftGroupService(groupId, serverId, nodeOptions, rpcServer);
		// 启动
		this.node = this.raftGroupService.start();
	}

}
