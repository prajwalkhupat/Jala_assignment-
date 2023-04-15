package JavaBasics;

public class CreatingClassObjectMethod {

	void isMethod() {
        //fields are used to store data
        String a = "This is a Method";
        System.out.println(a);
    }
	
	public static void main(String[] args) {
		// 1. How to create a class, object, method and its signature.

        // Created an object of Basics_01
        CreatingClassObjectMethod obj = new CreatingClassObjectMethod();
        // Calling the method
        obj.isMethod();
	}

}
