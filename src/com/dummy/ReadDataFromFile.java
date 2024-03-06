package com.dummy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadDataFromFile {
	public static void main(String[] args) {
		String fileName = "E:\\Programming\\Workspace for Eclipse\\Dummy\\hello.txt";
		
		try {
			Stream<String> stream = Files.lines(Paths.get(fileName));
			stream.forEach(System.out::println);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
