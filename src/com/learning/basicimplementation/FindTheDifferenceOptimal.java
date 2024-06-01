package com.learning.basicimplementation;

public class FindTheDifferenceOptimal {

	public char findTheDifference(String s, String t) {

		/* Contant Time and Space
		 */
		int frequency[] = new int[26];
		for(int i = 0;i<s.length();i++)
			frequency[s.charAt(i) - 'a'] += 1;
		for(int i = 0;i<t.length();i++)
			frequency[t.charAt(i) - 'a'] -= 1;
		int charIndex = 0;
		for(int i = 0;i<frequency.length;i++){
			if(frequency[i] != 0)
				charIndex = i;
		}
		return (char) (charIndex + 'a');


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheDifferenceOptimal object = new FindTheDifferenceOptimal();
		System.out.println(object.findTheDifference("abcd", "abcde"));
	}

}
