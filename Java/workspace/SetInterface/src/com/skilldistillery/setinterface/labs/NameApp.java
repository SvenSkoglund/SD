package com.skilldistillery.setinterface.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameApp {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("names.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		List<String> stringList = new ArrayList<>();
		for (int i = 0 ; i < 26 ; i++) {
			stringList.add(i,"");
		}
		Set<String> stringSet = new HashSet<>();
		int lines =0;
		try {
			String s;
			while ((s = br.readLine()) != null) {
				switch(s.charAt(0)) {
				case 65:
					stringList.set(0,stringList.get(0) + " " + s);
					break;
				case 66:
					stringList.set(1,stringList.get(1) + " " + s);
					break;
				case 67:
					stringList.set(2,stringList.get(2) + " " + s);
					break;
				case 68:
					stringList.set(3,stringList.get(3) + " " + s);
					break;
				case 69:
					stringList.set(4,stringList.get(4) + " " + s);
					break;
				case 70:
					stringList.set(5,stringList.get(5) + " " + s);
					break;
				case 71:
					stringList.set(6,stringList.get(6) + " " + s);
					break;
				case 72:
					stringList.set(7,stringList.get(7) + " " + s);
					break;
				case 73:
					stringList.set(8,stringList.get(8) + " " + s);
					break;
				case 74:
					stringList.set(9,stringList.get(9) + " " + s);
					break;
				case 75:
					stringList.set(10,stringList.get(10) + " " + s);
					break;
				case 76:
					stringList.set(11,stringList.get(11) + " " + s);
					break;
				case 77:
					stringList.set(12,stringList.get(12) + " " + s);
					break;
				case 78:
					stringList.set(13,stringList.get(13) + " " + s);
					break;
				case 79:
					stringList.set(14,stringList.get(14) + " " + s);
					break;
				case 80:
					stringList.set(15,stringList.get(15) + " " + s);
					break;
				case 81:
					stringList.set(16,stringList.get(16) + " " + s);
					break;
				case 82:
					stringList.set(17,stringList.get(17) + " " + s);
					break;
				case 83:
					stringList.set(18,stringList.get(18) + " " + s);
					break;
				case 84:
					stringList.set(19,stringList.get(19) + " " + s);
					break;
				case 85:
					stringList.set(20,stringList.get(20) + " " + s);
					break;
				case 86:
					stringList.set(21,stringList.get(21) + " " + s);
					break;
				case 87:
					stringList.set(22,stringList.get(22) + " " + s);
					break;
				case 88:
					stringList.set(23,stringList.get(23) + " " + s);
					break;
				case 89:
					stringList.set(24,stringList.get(24) + " " + s);
					break;
				case 90:
					stringList.set(25,stringList.get(25) + " " + s);
					break;
				}
				lines++;
				stringList.add(s);
				stringSet.add(s);
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(stringList);
//		System.out.println("names.txt lines: " + lines);
//		System.out.println("stringList Lines: "+ stringList.size());
//		System.out.println("stringSet Lines: " + stringSet.size());
	}

}
