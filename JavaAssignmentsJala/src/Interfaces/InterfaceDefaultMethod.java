package Interfaces;

interface C {
    //default method
    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}

public class InterfaceDefaultMethod implements C {

	public static void main(String[] args) {
		//06. Create an interface with a default method and implement it in a class. Do not provide
		 // implementation to the default method and call the method.

		 //Didn't provide implementation to the default method
        InterfaceDefaultMethod if6 = new InterfaceDefaultMethod();
        //Calling the method
        if6.defaultMethod();
	}

}
