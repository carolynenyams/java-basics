/*

Java static block

Is used to initialize the static data member.
It is executed before main method at the time of classloading.

Output will be like this.
*************************
*  static BLOCK INVOKED *
*   This is from main   *
*************************

*/

class Staticblock {
	static {

System.out.println("static BLOCK INVOKED");

	}
	
	public static void main(String[] args) {
		System.out.println("This is from main");
	}
}