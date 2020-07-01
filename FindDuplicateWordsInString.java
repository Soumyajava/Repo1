package com.san.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateWordsInString {

	public static void main(String[] args) {
		//create set collection
		Set<String> set1=new HashSet<>();
		Set<String> set2=new HashSet<>();
	   //craete scanner object
		Scanner scn=new Scanner(System.in);
		System.out.println("enter inputs:");
		String inputs=scn.nextLine();
		String[] words=inputs.split(" ");
		//iterating through for each loop
		for(String word:words) {
			
        boolean isadded=set1.add(word);
        if(!isadded) {
        	set2.add(word);
        }
	}
		System.out.println(set2);
	}
}
