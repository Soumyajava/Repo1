package com.san.main;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		Set<String> set1=new HashSet<>();
		Set<String> set2=new HashSet<>();
		String words="success1 success2 success3 success1 success2";
		String[] splitedwords=words.split(" ");
		for(String getwords:splitedwords) {
			System.out.println(getwords);
			Boolean isAdded=set1.add(getwords);
			if(!isAdded) {
				set2.add(getwords);
			}
		}
		System.out.println(set2);

	}

}
