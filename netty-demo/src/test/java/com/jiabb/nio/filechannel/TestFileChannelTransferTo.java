package com.jiabb.nio.filechannel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TestFileChannelTransferTo {

    public static void main(String[] args) {

        try (
                FileChannel from = new FileInputStream("./netty-demo/data.txt").getChannel();
                FileChannel to = new FileOutputStream("./netty-demo/to.txt").getChannel();
        ) {
            // 效率高 底层会使用操作系统的零拷贝进行优化  每次最大2G数据
            from.transferTo(0, from.size(), to);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
