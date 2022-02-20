package com.jiabb.disruptor;

import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import junit.framework.TestCase;

import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class LongEventTest extends TestCase {

    public void testMain(){
        // 1. 创建线程池
        ThreadFactory threadFactory = Executors.defaultThreadFactory();

        // 2. 创建工厂
        LongEventFactory longEventFactory = new LongEventFactory();

        // 3.创建ringbuffer 大小
        int ringbuffer = 1024 * 1024; // 2的N次方

        // 4. 创建disruptor
        Disruptor<LongEvent> longEventDisruptor = new Disruptor<>(
                longEventFactory, ringbuffer, threadFactory,
                ProducerType.MULTI, new YieldingWaitStrategy()
        );

        // 5. 连接消费者
        longEventDisruptor.handleEventsWith(new LongEventHandler());
        // 6. 启动
        longEventDisruptor.start();

        // 7.创建ringbuffer容器
        RingBuffer<LongEvent> ringBuffer = longEventDisruptor.getRingBuffer();

        // 8.创建生产者
        LongEventProducer longEventProducer = new LongEventProducer(ringBuffer);

        // 9. 指定缓冲区的大小
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        for (int i = 0; i < 10; i++) {
            byteBuffer.putLong(0,i);
            longEventProducer.onData(byteBuffer);
        }
        longEventDisruptor.shutdown();

    }

}
