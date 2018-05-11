package com.skilldistillery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMvcVideoStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcVideoStoreApplication.class, args);
		String base = "Hello";
		System.out.println(base.length());
		StringBuilder sb = new StringBuilder(base);
		base.tol
	}

	public String withoutString(String base, String remove) {

int removeLength = remove.length();
StringBuilder baseSB = new StringBuilder(base);

for (int i = 0; i < base.length(); i++) {
	if (base.toLowerCase().charAt(i) == remove.toLowerCase().charAt(0)) {
		if (base.length() > removeLength
				&& base.substring(i, i + removeLength).equalsIgnoreCase(remove.substring(0, removeLength))) {
			baseSB.delete(i, i + removeLength);
			base = baseSB.toString();
			i = 0;
		}
	}
}
if (base.equalsIgnoreCase(remove)) {
	base = "";
}
return base;
	}
}
