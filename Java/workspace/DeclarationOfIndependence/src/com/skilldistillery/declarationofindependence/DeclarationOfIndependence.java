package com.skilldistillery.declarationofindependence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeclarationOfIndependence {

	public static void main(String[] args) throws IOException {
		File f = new File("declaration.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		int lineCounter = 0;
		int wordCount = 0;
		int charCount = 0;
		String[] stringArr;
		while ((s = br.readLine()) != null) {
			lineCounter++;
			charCount += s.length();
			stringArr = s.split(" ");
			wordCount += stringArr.length;
		}
		
		System.out.println("The number of lines is " + lineCounter + ": The total word count is " + wordCount + ": The total character count is " + charCount);

	}

}
