package com.section03;

import java.util.Scanner;

public class Ex1008 {
	public static void main(String[] args) {
		
		String str = " ";
		Scanner in = new Scanner(System.in);
		
		System.out.println("입력 문자열: ");
		str = in.nextLine(); // Hello
		
		int len = str.length(); // 5
		
		String revStr1 = "";
		
		for (int i = len - 1; i >=0; i--) {
			revStr1 = revStr1 + str.charAt(i); // o + l +l + e + h
			
		}
		
		System.out.println("String 클래스의 역순 문자열: " + revStr1);
		
		StringBuilder revStr2 = new StringBuilder(str);
		revStr2.reverse();
		
		System.out.println("StringBuilder 클래스의 역순 문자열: " + revStr2);
		
	}
	
}
