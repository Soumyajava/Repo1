package com.san.main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonrepeatativeCharacter {

	public static void main(String[] args) {
		//craeting map collecton object
		Map<Character,Integer> map1=new LinkedHashMap<>();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter input:");
		String input=scn.nextLine();
        char[] chs=input.toCharArray();
        for(char ch:chs) {
        	map1.put(ch,map1.containsKey(ch) ? map1.get(ch)+1:1);
        }
        Set<Entry<Character,Integer>>	entryset=map1.entrySet();
        for(Entry<Character, Integer> entry:entryset) {
        	if(entry.getValue()==1) {
        		System.out.println(entry.getKey());
        		break;
        	}
        }
	}

}
