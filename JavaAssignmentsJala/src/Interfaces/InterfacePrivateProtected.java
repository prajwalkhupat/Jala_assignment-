package Interfaces;

interface X {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
    // private int num4 = 44;  - error
    // protected int num5 = 55; - error
}
public class InterfacePrivateProtected implements X {

	public static void main(String[] args) {
		// 09. Create a PRIVATE or PROTECTED interface and print the values as above scenario
		// 10. Create an interface with private, public and protected fields
		// 11.  Create an interface with static final variable

		 InterfacePrivateProtected if9 = new InterfacePrivateProtected();
	        System.out.println(if9.num1 + " " + if9.num2);
	}

}
