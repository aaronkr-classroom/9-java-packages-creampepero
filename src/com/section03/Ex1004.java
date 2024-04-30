package com.section03;

import com.javamaster.mypackage.*;

//object 클래스 예시
public class Ex1004 {
	public static void main(String[] args) {
		Cat cat01 = new Cat();
		Cat cat02 = new Cat();
		
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		System.out.println(cat01.equals(cat02));
		
		cat01 = cat02;
		System.out.println(cat01.equals(cat02));
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		
		//String
		
		String str01 = cat01.scratch();
		String str02 = cat02.meow();
		String str03 = cat02.scratch();
		
		System.out.println(str01.equals(str02));
		System.out.println(str01.equals(str03));

	}

}
