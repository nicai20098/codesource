package com.jiabb.nio.bytebuffer;

import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;

@Slf4j
public class TestByteBufferRead {

    public static void main(String[] args) {

        //数据准备
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(new byte[]{'a', 'b', 'c', 'd'});
        ByteBufferUtil.debugAll(buffer);
        buffer.flip();


        //rewind 从头开始读
        byte[] bytes = new byte[4];
        buffer.get(bytes);
        log.info("读取内容为 [{}]", new String(bytes));
        ByteBufferUtil.debugAll(buffer);
        buffer.rewind();
        ByteBufferUtil.debugAll(buffer);

        //mark & reset
        //mark 做一个标记 ，记录position位置 reset是将position重置到mark位置
        log.info("读取内容为 [{}]", (char)buffer.get());
        log.info("读取内容为 [{}]", (char)buffer.get());
        buffer.mark();//索引为2做标记
        log.info("读取内容为 [{}]", (char)buffer.get());
        log.info("读取内容为 [{}]", (char)buffer.get());
        buffer.reset();//将position位置重置到2处
        ByteBufferUtil.debugAll(buffer);
        buffer.rewind();

        //get(i) 直接获取索引位置 不会改变游标position
        log.info("读取内容为 [{}]", (char)buffer.get(3));
        ByteBufferUtil.debugAll(buffer);
    }

}
