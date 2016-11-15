package org.datasays.util;

import java.io.File;
import java.util.Iterator;

import jodd.io.findfile.FindFile;
import jodd.io.findfile.WildcardFindFile;

public class FindFileUtil {
	public static Iterator<File> search(boolean recursive, boolean includeDirs, String dir){
		FindFile<WildcardFindFile> ff = create(recursive, includeDirs).searchPath(dir);
		Iterator<File> iterator = ff.iterator();
		return iterator;
	}
	
	public static Iterator<File> search(boolean recursive, boolean includeDirs, File dir){
		FindFile<WildcardFindFile> ff = create(recursive, includeDirs).searchPath(dir);
		Iterator<File> iterator = ff.iterator();
		return iterator;		
	}
	
	public static FindFile<WildcardFindFile> create(boolean recursive, boolean includeDirs){
		return new WildcardFindFile().setRecursive(recursive).setIncludeDirs(includeDirs).setIncludeFiles(true);		
	}
}
