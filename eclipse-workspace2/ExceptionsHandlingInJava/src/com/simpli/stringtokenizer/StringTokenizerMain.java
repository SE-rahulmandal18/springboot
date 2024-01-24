package com.simpli.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		
		String str = "Hello I Like Java Language";
		
		StringTokenizer stk = new StringTokenizer(str);
		
		System.out.println(stk.countTokens());
		
		while(stk.hasMoreTokens()) {
			
			System.out.println(stk.nextToken());
		}
	}

}
