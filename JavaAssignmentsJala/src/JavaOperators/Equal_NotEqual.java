package JavaOperators;

import java.util.Scanner;

public class Equal_NotEqual {

	public static void main(String[] args) {
		// 3. Program to equal operator and not equal operators
		// 4. Write a program to find the two numbers equal or not.
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        //equal operator (==)
        if (a == b) {
            System.out.println("Both are numbers equal");
        }
        //not equal operator (!=)
        else if (a != b) {
            System.out.println("Both are numbers different");
        }
	}

}
