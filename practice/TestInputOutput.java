package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInputOutput {
public static void main(String args[]) throws FileNotFoundException,IOException {
	File f = new File("anu.txt");
	f.createNewFile();
	FileInputStream fis = new FileInputStream("anu.txt");
	FileOutputStream fos = new FileOutputStream("sonam.txt");
	int c;
	while((c=fis.read())!=-1) {
		System.out.println((char)c);
		fos.write(c);
	}
	System.out.println("read() & write operation are completed");
	fis.close();
	fos.close();
}
}
