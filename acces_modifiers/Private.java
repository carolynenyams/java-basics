/*


The private access modifier is accessible only within class.

Simple example of private access modifier:- we have created two classes Harish and Private. Harish class contains private data member and private method. We are accessing these private members from outside the class, so there is compile time error.
*/


class harish{

	private  int data=300;
private  void show(){
	System.out.println("hello from Private section");
}
}


class Private {
public static void main(String[] args) {
		harish h1 = new harish();
		System.out.println(h1.data);
		h1.show();
	}	
}