package com.skilldistillery.regex.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {

	public static void main(String[] args) throws IOException {
		
		Pattern regex = Pattern.compile((args[0]));

//		try {
//			if (args[2] == "-i") {
//				regex = Pattern.compile(args[0], Pattern.CASE_INSENSITIVE);
//			}
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		BufferedReader br = new BufferedReader(new FileReader(args[1]));
		Matcher m = regex.matcher(br.readLine());

		String s;
		while ((s = br.readLine()) != null) {
			m.reset(s);
			if (m.find()) {
				System.out.println(s.substring(m.start(), m.end()));
			}

		}
	}
}
