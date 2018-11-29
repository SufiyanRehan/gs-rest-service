package hello;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.hello.entity.Palindrome;

import hello.service.PalindromeService;
import net.bytebuddy.implementation.bytecode.Throw;

@RestController
public class WordController {

	// TODO Implement the /words/{word} endpoint
	 static final int NO_OF_CHARS = 256; 
	 public PalindromeService palindromeService;

	@RequestMapping(value = "/words/{word}", method = RequestMethod.PUT)
	public Palindrome checkPalindrom(@PathVariable("word") String word, UriComponentsBuilder ucBuilder) {

		
		
		Palindrome palindrome= new Palindrome();
		String reverse="";
		String temp = "";
		temp = word;
		if (temp != null) {
			reverse = checkPalindromeOrNot(temp);
			boolean checkAnagramString= canFormPalindrome(word);
			
			//if given word is palindrome 
			if(reverse.equals(word)) {
				palindrome.setWord(word);
				palindrome.setPalindrome(true);
				palindrome.setAnagramOfPalindrom(false);
			}
			//if given word is anagramOfPalindrome
			else if(checkAnagramString) {
				palindrome.setWord(word);
				palindrome.setPalindrome(false);
				palindrome.setAnagramOfPalindrom(true);
			}
			//if given word is nither palindrome or anagram.
			else {
				palindrome.setWord(word);
				palindrome.setPalindrome(false);
				 palindrome.setAnagramOfPalindrom(false);
					
			}
			
		}
		
		return palindrome;

	}

	public String checkPalindromeOrNot(String words) {
		String reverse = "";
		// logic to check coming string is palindrome or not
		int length = words.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + words.charAt(i);

		if (words.equals(reverse))
			System.out.println("The string is a palindrome.");
		
		
		else
			System.out.println("The string isn't a palindrome.");

		return reverse;
	}

	
	static boolean canFormPalindrome(String word) 
    { 
	   

        // Create a count array and initialize 
        // all values as 0 
        int[] count = new int[NO_OF_CHARS]; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (int i = 0; i < word.length(); i++) 
            count[word.charAt(i)]++; 
  
        // Count odd occurring characters 
        int odd = 0; 
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if ((count[i] & 1) != 0) 
                odd++; 
  
            if (odd > 1) 
                return false; 
        } 
        // Return true if odd count is 0 or 1, 
        return true; 
    } 
}
