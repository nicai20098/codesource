package com.jiabb.commons.io;

import junit.framework.TestCase;
import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.PathFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.PathVisitorFileFilter;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class FiltersTest extends TestCase {

	String fileName = "D:/soft/jdk1.8/src.zip";
	String unExistFileName = "D:";

	public void testFileFileFilter() throws IOException {
		IOFileFilter ioFileFilter = FileFileFilter.INSTANCE;
//		boolean b = ioFileFilter.accept(Paths.get(fileName).toFile());
//		Assert.assertTrue(b);
//		boolean unExist = ioFileFilter.accept(Paths.get(unExistFileName).toFile(), "errorMsg");
//		Assert.assertFalse(unExist);

//		File f = new File(".");
//		String[] files = f.list(FileFileFilter.INSTANCE);
//		for (String file : files) {
//			System.out.println(file);
//		}

		final Path dir = Paths.get("D:\\soft");
		IOFileFilter directoryFilter = DirectoryFileFilter.INSTANCE;
		directoryFilter.accept(Paths.get("D:/soft/jdk1.8/").toFile());
		final AccumulatorPathVisitor visitor = AccumulatorPathVisitor.withLongCounters(ioFileFilter, directoryFilter);



		//
		// Walk one dir
		Files.walkFileTree(dir, Collections.emptySet(), 2, visitor);
		System.out.println(visitor.getPathCounters());
		System.out.println(visitor.getFileList());
		//
		visitor.getPathCounters().reset();
		//
		// Walk dir tree
//		Files.walkFileTree(dir, visitor);
//		System.out.println(visitor.getPathCounters());
//		System.out.println(visitor.getDirList());
//		System.out.println(visitor.getFileList());
	}


}
