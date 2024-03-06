package com.dummy;

import java.io.FileNotFoundException;
import java.io.IOException;

class First 
{ 
	void method() throws IOException 
	{ } 
} 

class Second extends First 
{ 
	void method() throws FileNotFoundException
	{ } 
}

public class ExceptionOverriding {

}
