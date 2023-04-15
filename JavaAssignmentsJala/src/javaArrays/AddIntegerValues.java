package javaArrays;

public class AddIntegerValues {

	static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }
	public static void main(String[] args) {
		//1. Write a function to add integer values of an array
		 
		int[] arr = {10, 20, 30, 40, 50};
	        //The Java for-each loop prints the array elements one by one.
	        // It holds an array element in a variable, then executes the body of the loop
	        for (int i : arr)
	            System.out.print(i + " + ");
	        //passing array to method
	        System.out.print(" =  " + arrSum(arr));
	}

}