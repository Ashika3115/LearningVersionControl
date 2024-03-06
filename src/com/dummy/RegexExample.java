package com.dummy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RegexExample{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
            String[] s =line.split("<"+".*"+">");
            System.out.println(s.length);
            String[] e = line.split("</"+".*"+">");
            System.out.println(e);
           // System.out.println(line.substring
            //(Integer.valueOf(s)+1, Integer.valueOf(e)));
			testCases--;
		}
	}
}



