package com.zs.mergeSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.zs.stdin.StdInNew;

public class TestDemo {
	private static Scanner scanner = null;
	private static String inputFilePath = "C:\\Users\\joshuai\\Desktop\\";
	private static String inputFileName = "VenusPrinter.h";

	public static void main(String args[]) {
		try {
			scanner = new Scanner(new File(inputFilePath + inputFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}

		StdInNew stdInNew = new StdInNew(scanner);
		String[] a = stdInNew.readAllStrings();

		
		Merge merge = new Merge();
		String aa=new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(new Date());
		merge.sort(a);
		String bb=new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(new Date());
		merge.show(a);
		System.out.println(aa);
		System.out.println(bb);

	}

}
