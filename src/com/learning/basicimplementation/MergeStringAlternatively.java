package com.learning.basicimplementation;

public class MergeStringAlternatively {

	public String mergeAlternately(String word1, String word2) {

		/*
           Time  Complexity : O(Max(p1,p2))
           Space Complexity : O(N) where N stands for number of Characters in word1 + word2;
		 */
		int p1 = 0;
		int p2 = 0;
		StringBuilder result = new StringBuilder();
		while( p1 < word1.length() || p2 < word2.length() ) {
			if( p1 < word1.length() ){
				result.append(word1.charAt(p1));
				p1++;
			}
			if(p2 < word2.length()){
				result.append(word2.charAt(p2));
				p2++;
			}
		} 
		return result.toString();


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeStringAlternatively obj = new MergeStringAlternatively();
		System.out.println(obj.mergeAlternately("abc", "pqr"));
		
	}

}
