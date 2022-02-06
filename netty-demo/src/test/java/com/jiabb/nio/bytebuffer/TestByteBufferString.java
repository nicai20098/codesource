package com.jiabb.nio.bytebuffer;

import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/**
 * 字符串转ByteBuffer
 */
@Slf4j
public class TestByteBufferString {

    private static final String STR = "hello";

    public static void main(String[] args) {
        //1. getBytes
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put(STR.getBytes());
        ByteBufferUtil.debugAll(buffer);
        //2. charset
        ByteBuffer buffer1 = StandardCharsets.UTF_8.encode(STR);
        ByteBufferUtil.debugAll(buffer1);
        //3. wrap
        ByteBuffer buffer2 = ByteBuffer.wrap(STR.getBytes());
        ByteBufferUtil.debugAll(buffer2);


    }

}
