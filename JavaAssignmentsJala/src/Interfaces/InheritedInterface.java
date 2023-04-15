package Interfaces;

	interface A {
	    void methodOne();
	}
	
	//inherited interface
	interface B extends A {
	    void methodTwo();
	}

public class InheritedInterface implements A {

	public void methodOne() {
        System.out.println("This is first method");
    }
    
    public void methodTwo() {
        System.out.println("This is second method");
    }
    
	public static void main(String[] args) {
		//  07. Create an interface and inherit it from the other interface.

		InheritedInterface if7 = new InheritedInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
	}

}
