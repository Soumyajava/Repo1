package com.san.main;

public class ReverseWordInString {

	public static void main(String[] args) {
		String word="soumya";
        reverseString(word);
	}
	public static void reverseString(String input) {
		int i=0;
		int j=0;
		char[] ch=input.toCharArray();
		System.out.println("printing the word in reverse way:");
		for(i=0;i<ch.length;i++) {
			//System.out.println(ch[i]);
			for(j=ch.length-1;j>=i;j--) {
				System.out.println(ch[j]);
			}
			break;
		}			
	}

}
