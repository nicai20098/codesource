package com.jiabb.disruptor;

import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LongEventProducer {

    private RingBuffer<LongEvent> ringBuffer;

    public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void onData(ByteBuffer byteBuffer) {
        //获取事件队列的下标位置
        long next = ringBuffer.next();
        //取出空队列
        LongEvent longEvent = ringBuffer.get(next);
        //给空队列赋值
        longEvent.setValue(byteBuffer.getLong(0));
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产者发送数据 --> " + longEvent.getValue());
        ringBuffer.publish(next);

    }

}
