package com;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Aditya";
		String s2 = "Aditya";
		System.out.println(s1 == s2); // true (both refer to same string in string pool)
		s1 = s1 + "Teja";
		System.out.println(s1 == s2); // false (s1 now refers to a new object)
		String s3 = "Tejaditya";
		System.out.println(s1==s3);
		}
		}



