package AccessModifiers;

public class PrivateFieldsMethods {

	 private String name = "Sharan";
	    private int age = 21;

	    //private method
	    private void pvtMethod() {
	        System.out.println("My Name is " + name + " and my age is " + age);
	    }
	    
	public static void main(String[] args) {
		//  1. Create a class with PRIVATE fields, private method and a main method. Print the fields
		// in main method. Call the private method in main method.
		// - Create a subclass and try to access the private fields and methods from subclass

		
		  PrivateFieldsMethods obj = new PrivateFieldsMethods();
	        //Printing the fields in main method
	        System.out.println(obj.age);
	        System.out.println(obj.name);
	        //Calling the private method in main method
	        obj.pvtMethod();
	}

}
