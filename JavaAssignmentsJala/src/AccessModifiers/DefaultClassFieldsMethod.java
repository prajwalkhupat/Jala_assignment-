package AccessModifiers;

class DefaultClass {
    //Default fields
    int myAge;
    String myName;

    //Default method
    void defaultMethod() {
        System.out.println("My name is " + myName + " and my age is " + myAge);
    }
}


public class DefaultClassFieldsMethod {
	public static void main(String[] args) {
		// 2. Create a class with DEFAULT fields and methods. Access these fields and methods
		// from any other class in the same package
		
		   //Creating object of DefaultClass_02.
        DefaultClass obj = new DefaultClass();
        //Accessing default fields
        obj.myAge = 21;
        obj.myName = "Sharan";
        //calling default method
        obj.defaultMethod();
	}

}
