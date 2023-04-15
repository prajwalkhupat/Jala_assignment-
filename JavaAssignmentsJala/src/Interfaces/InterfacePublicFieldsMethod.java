package Interfaces;

 interface Java {
    //all the fields are public, static and final by default
    int num = 111; //values assigned

    public void myMethod();
}

public class InterfacePublicFieldsMethod implements Java {
	 @Override
	public void myMethod() {
        System.out.println("This is a method");
    }
	 
	public static void main(String[] args) {
		// 08. Create a PUBLIC interface with fields and methods, fields should have values assigned.
		//Implement this interface to some class and print the values of the interface fields and
		// call the interface methods

		Java ja = new Java() {
			
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				
			}
		};
        //printing the values of the interface fields
        System.out.println(num);
        //calling the interface methods
        ja.myMethod();
	}

}
