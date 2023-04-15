package Interfaces;

//An interface is declared by using the interface keyword.
interface Z {
  //An abstract method doesn't have its body, and they are public and abstract
  void oneMethod();
}
public class InterfaceOneMethod implements Z {

	 public void oneMethod() {
	        System.out.println("This is a method");
	    }
	public static void main(String[] args) {
		// 01. Create an interface with only one method and implement it in a class. Call the method
		// implemented.

		 InterfaceOneMethod if1 = new InterfaceOneMethod();
	        //Calling the method implemented
	        if1.oneMethod();
	}

}
