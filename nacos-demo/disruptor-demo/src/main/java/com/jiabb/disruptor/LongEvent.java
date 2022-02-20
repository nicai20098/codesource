package com.jiabb.disruptor;

//定义事件event 通过disruptor 进行交换的数据类型
public class LongEvent {

    private Long Value;

    public Long getValue() {
        return Value;
    }

    public void setValue(Long value) {
        Value = value;
    }
}
