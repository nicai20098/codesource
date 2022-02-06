package com.jiabb.nio.bytebuffer;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;

@Slf4j
public class TestByteBuffer {

  public static void main(String[] args) {

    //FileChannel
    //1.输入输出流 2.RandomAccessFile
    try (FileChannel channel = new FileInputStream("./netty-demo/data.txt").getChannel()) {
      //准备缓冲区
      ByteBuffer buffer = ByteBuffer.allocate(10);
      while (!Objects.equals(-1, channel.read(buffer))) {
        //从channel中读取数据， 向buffer中写入
        //打印buffer内容
        buffer.flip();//切换至读取模式
        while (buffer.hasRemaining()) {// 是否还有剩余数据
          log.info("读取到的内容 [{}]", (char) buffer.get());
        }
        buffer.clear();//切换至写模式
        //compact是把未读完的部分向前压缩，然后切换成写模式
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
