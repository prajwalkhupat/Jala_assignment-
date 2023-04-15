package Interfaces;

//interface 1
interface Demo {
  void methodOne();
}

//interface 2
interface Demo1 {
  void methodTwo();
}

public class TwoInterfaceOneMethod implements Demo,Demo1 {

	public void methodOne() {
        System.out.println("This is Method one");
    }

    @Override
    public void methodTwo() {
        System.out.println("This is Method two");
    }

	public static void main(String[] args) {
		//  04.Create two interfaces with one method each. Implement these two interfaces in one class.

		TwoInterfaceOneMethod if4 = new TwoInterfaceOneMethod();
        //Calling the methods implemented
        if4.methodOne();
        if4.methodTwo();
		
	}

}
