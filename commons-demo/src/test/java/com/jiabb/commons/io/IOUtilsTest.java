package com.jiabb.commons.io;

import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOUtilsTest extends TestCase {


	/**
	 IOUtils.copy(InputStream input, OutputStream output) // 此方法有多个重载方法，满足不同的输入输出流
	 IOUtils.copy(InputStream input, OutputStream output, int bufferSize)
	 IOUtils.copy(InputStream input, Writer output, String inputEncoding)
	 IOUtils.copy(Reader input, Writer output)
	 IOUtils.copy(Reader input, OutputStream output, String outputEncoding)
	 // 这个方法适合拷贝较大的数据流，比如2G以上
	 IOUtils.copyLarge(Reader input, Writer output) // 默认会用1024*4的buffer来读取
	 IOUtils.copyLarge(Reader input, Writer output, char[] buffer)
	 */
	public void testCopy() throws IOException {
		long start = System.currentTimeMillis();
		FileInputStream inputStream = new FileInputStream(Paths.get("D:/强哥/360驱动大师目录.rar").toFile());
		FileOutputStream outputStream = new FileOutputStream(Paths.get("D:/强哥/360驱动大师目录.rar_bak").toFile());
		long copyLarge = IOUtils.copyLarge(inputStream, outputStream);
		System.out.println("cost -> " + (System.currentTimeMillis() - start));
		System.out.println(copyLarge);

	}

}
