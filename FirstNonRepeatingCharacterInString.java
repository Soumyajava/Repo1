package com.san.main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		//creating map collection
		Map<Character,Integer> map=new LinkedHashMap<>();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the word::");
        String word=scn.nextLine();
        char[] chs=word.toCharArray();
        //iterating through foreach loop
        for(char ch:chs) {
        	map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        Set<Entry<Character,Integer>> entryset=map.entrySet();
        for(Entry<Character,Integer> entry:entryset) {
        	if(entry.getValue()==1) {
        		System.out.println(entry.getKey());
        		break;
        	}
        }
	}
  }

