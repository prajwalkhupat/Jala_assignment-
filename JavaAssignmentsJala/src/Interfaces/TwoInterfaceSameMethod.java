package Interfaces;

//interface 1
interface S {
  void sameMethod();
}

//interface 2
interface S1 {
  void sameMethod();
}

public class TwoInterfaceSameMethod implements S,S1{

	public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }
	
	public static void main(String[] args) {
		//  05. Create two interfaces with the same method (same signature) in both the interfaces.
		//  Implement these two interfaces in one class. Call the method.

		 TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
	        if5.sameMethod();
	}

}
