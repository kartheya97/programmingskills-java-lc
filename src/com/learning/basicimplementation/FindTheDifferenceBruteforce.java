package com.learning.basicimplementation;

import java.util.Arrays;

public class FindTheDifferenceBruteforce {

	public char findTheDifference(String s, String t) {

		/*
		 *  Brute Force
		 * Time  Complexity : O(NLogN)
		 * Space Complexity : O(N)
		 */
		char sArray[] = s.toCharArray();
		char tArray[] = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		int start     = 0;
		while(start < sArray.length){
			if(sArray[start] != tArray[start])
				break;
			else
				start++;
		}
		return tArray[start];


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheDifferenceBruteforce object = new FindTheDifferenceBruteforce();
		System.out.println(object.findTheDifference("abcd", "abcde"));
	}

}
