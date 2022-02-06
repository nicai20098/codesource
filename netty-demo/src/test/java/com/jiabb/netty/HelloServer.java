package com.jiabb.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloServer {

    public static void main(String[] args) {
        //1. 启动器，负责组装netty组件，启动服务器
        new ServerBootstrap()
            //2. BossEventLoop, WorkerEventLoop(selector,thread),group组
            .group(new NioEventLoopGroup())
            //3. 选择服务器ServerSocketChannel 实现
            .channel(NioServerSocketChannel.class)
            //4. boss负责处理连接 worker(child)负责处理读写，决定了worker(child)能执行哪些操作
            .childHandler(
                //5. 代表和客户端进行数据读写的通道 Initializer 初始化，负责添加别的handler
                new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                       // 6. 添加具体handler
                       nioSocketChannel.pipeline().addLast(new StringDecoder()); //将byteBuf 转为字符串
                       nioSocketChannel.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                           @Override //读事件
                           public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                               log.info("channelRead --> {}", msg);
                           }
                       });
                    }
                }
                //7. 监听端口
            ).bind(8080);


    }

}
