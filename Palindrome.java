package com.hello.entity;

public class Palindrome {

	public String word;
	public boolean palindrome;
	public boolean anagramOfPalindrom;
	
	public Palindrome() {
		
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public boolean isPalindrome() {
		return palindrome;
	}

	public void setPalindrome(boolean palindrome) {
		this.palindrome = palindrome;
	}

	public boolean isAnagramOfPalindrom() {
		return anagramOfPalindrom;
	}

	public void setAnagramOfPalindrom(boolean anagramOfPalindrom) {
		this.anagramOfPalindrom = anagramOfPalindrom;
	}
	
}
