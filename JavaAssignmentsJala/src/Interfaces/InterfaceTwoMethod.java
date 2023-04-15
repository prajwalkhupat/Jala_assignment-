package Interfaces;

interface P {
    void methodOne();

    void methodTwo();
}

public class InterfaceTwoMethod implements P {

	 public void methodOne() {
	        System.out.println("First Method");
	    }

	    @Override
	    public void methodTwo() {
	        System.out.println("Second Method");
	    }
	public static void main(String[] args) {
		// 02. Create an interface with two methods, but implement only one in a class. Call the
		// method implemented.
		 InterfaceTwoMethod if2 = new InterfaceTwoMethod();
	        //Calling the methods implemented
	        if2.methodOne();
	        if2.methodTwo();

	}

}
