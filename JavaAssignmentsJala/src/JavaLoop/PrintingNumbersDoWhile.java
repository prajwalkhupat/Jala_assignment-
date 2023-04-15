package JavaLoop;

public class PrintingNumbersDoWhile {

	public static void main(String[] args) {
		// 7. Write a program to print 1 to 10 using the do-while loop statement.
		
		int i = 1;
        /* The Java do-while loop is executed at least once because
        condition is checked after loop body. */
        do {
            System.out.print(i + " ");
            i++;
        }
        /* Therefore, unlike while loop and for loop, the do-while
        checks the condition at the end of loop body */
        while (i <= 10);
	}

}
