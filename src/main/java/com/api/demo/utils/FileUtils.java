package com.api.demo.utils;

import java.io.File;
import java.util.List;

/**
 * 
 * 
 * @author Sowjanya
 * 
 */
public class FileUtils {
	
	private List<String> fileList;
	
	/**
	 * 
	 * @param filePath
	 * @author Sowjanya
	 * 
	 */
	public static boolean fileExists(String filePath)
	{
		File f = new File(filePath);
		if(f.exists()) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param filePath
	 * @author Sowjanya
	 * 
	 */
}
