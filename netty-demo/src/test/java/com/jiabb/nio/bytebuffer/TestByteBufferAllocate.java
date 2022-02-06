package com.jiabb.nio.bytebuffer;

import java.nio.ByteBuffer;

public class TestByteBufferAllocate {

    public static void main(String[] args) {
        /**
         * 分配空间
         */
        System.out.println(ByteBuffer.allocate(16).getClass());
        System.out.println(ByteBuffer.allocateDirect(16).getClass());
        /**
         * class java.nio.HeapByteBuffer    -java 堆内存，读写效率较低，受到GC影响
         * class java.nio.DirectByteBuffer  -直接内存，读写效率高（少一次拷贝），不受GC影响，分配效率低 处理不当可能造成内存泄漏
         */

    }

}
