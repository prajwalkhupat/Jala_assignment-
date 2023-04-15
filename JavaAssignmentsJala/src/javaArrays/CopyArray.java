package javaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	 static void copyingArray(int[] arr) {
	        //copies given arr array to copy array
	        int[] copy = arr;
	        //prints the copied array
	        System.out.println("Array after copying to c = " + Arrays.toString(copy));
	    }
	 
	public static void main(String[] args) {
		// 6. Write a function to copy an array to another array
		 
		    int n;
	        Scanner sc = new Scanner(System.in);
	        //user input
	        System.out.print("Enter the number of elements you want to store : ");
	        n = sc.nextInt();
	        //no of elements to store
	        System.out.println("Enter the Elements of the array ");
	        ///new array
	        int[] my_arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.printf("my_arr[%d] = ", i);
	            //Elements input
	            my_arr[i] = sc.nextInt();
	        }
	        System.out.println("my_arr = " + Arrays.toString(my_arr));
	        //passing Array to copy to another array
	        copyingArray(my_arr);

	}

}