package JavaLoop;

import java.util.Scanner;

public class PalindromeNumber {

	 static boolean palindromeNumber(int num) {
	        int r, sum = 0, temp;
	        //Copy number into a temporary variable and reverse it.
	        temp = num;
	        while (num > 0) {
	            r = num % 10; //getting remainder
	            sum = (sum * 10) + r;
	            num = num / 10;
	        }
	        //Compare the temporary number with reversed number
	        // Returns if temp and sum are equal
	        return temp == sum;
	    }
	 
	public static void main(String[] args) {
		//  10. Write a program to palindrome or not
		int num;
        System.out.print("Enter a value : ");
        num = new Scanner(System.in).nextInt();
        //if(true)
        if (palindromeNumber(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }

	}

}
