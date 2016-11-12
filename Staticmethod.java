

/*


Java static method

If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.

*/


class Staticmethod  {
	int id;
	String name;
	static  String college="RGGI";
static  void change(){
	college="IIT"; //static method can access static data member and can change the value of it.
}

Staticmethod(int i, String s){
id=i;
name=s;

}

void display(){
System.out.println(id+" "+name+" "+college);


}

public static void main(String[] args) {

	

	Staticmethod s1= new Staticmethod(22,"HARISH");
	Staticmethod s2= new Staticmethod(23,"Priyanka");
	Staticmethod.change();//A static method can be invoked without the need for creating an instance of a class. 
	s1.display();
	s2.display();




}



	
}