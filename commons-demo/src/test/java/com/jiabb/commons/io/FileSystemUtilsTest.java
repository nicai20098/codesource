package com.jiabb.commons.io;

import junit.framework.TestCase;
import org.apache.commons.io.input.TeeInputStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemUtilsTest extends TestCase {

	public void testFreeSpaceKb() throws IOException {

		//磁盘可用空间
		long usableSpace = Files.getFileStore(Paths.get("D:/强哥/360驱动大师目录.rar")).getUsableSpace();
		System.out.println(usableSpace);

	}


}
