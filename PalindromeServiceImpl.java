package hello.service;

public class PalindromeServiceImpl  implements PalindromeService{

	@Override
	public String checkPalindromeOrNot(String words) {
		String  reverse="";
		// logic to check coming string is palindrome or not 
		 int length = words.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + words.charAt(i);
	         
	      if (words.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
		
		return null;
	}

}
