package com.skilldistillery.io.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployees {

	public static void main(String[] args) throws IOException {

		File employee = new File("employee.txt");
		FileReader fr = new FileReader(employee);
		BufferedReader br = new BufferedReader(fr);

		String line;
		try {
			while ((line = br.readLine()) != null) {
				if (line.contains("manager")) {
					System.out.println(line);
				}
			}
		}
		catch (IOException e) {
			System.out.println("IOException");;
		}

	}

}
