package Exceptions;

public class MethodThrowsException {

	static void throwException() {
        //throw keyword is used to invoke an exception explicitly.
        throw new RuntimeException("Throwing exception");
    }

	public static void main(String[] args) {
		// 3.Write a method which throws exception, Call that method in main class without try block

		
		throwException();
	}

}
