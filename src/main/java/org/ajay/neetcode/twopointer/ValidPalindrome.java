package org.ajay.neetcode.twopointer;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
 * "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
 * palindrome.
 * 
 * 
 * Example 3:
 * 
 * Input: s = " " Output: true Explanation: s is an empty string "" after
 * removing non-alphanumeric characters. Since an empty string reads the same
 * forward and backward, it is a palindrome.
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 2 * 100000
 * s consists only of printable ASCII characters.
 * 
 * @author ajnayak
 *
 */

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		
		//Validate input string with null value.
		if(null == s) {
			System.out.println("Input string is false");
			return false;
		}
		
		//Validate input string with max and min length
		if(1 > s.length() || s.length() > 200000) {
			System.out.println("Input string is very small OR big" + s);
			return false;
		}
		
		//remove all non-alphanumeric chars from the input string and convert into all lower case.
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if(s.isEmpty()) {
			return true;
		}
		
		//Iterate through each chars of the String and compare each chars from front rear end of the string.
		char[] chArray = s.toCharArray();
		for(int i=0, j=chArray.length-1; i<=j; i++, j--) {
			if(chArray[i] != chArray[j]){
				return false;
			}
		}
		return  true;
	}

}
