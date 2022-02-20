package com.jiabb.disruptor;

import com.lmax.disruptor.EventHandler;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class LongEventHandler implements EventHandler<LongEvent> {

    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者获得数据：" + longEvent.getValue());
    }

}
