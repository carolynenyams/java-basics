/*
This is a example of parameterised constructor of java. 

*/

class Parameterconst  {
	int id;
	String name;

Parameterconst(int i, String s){
id=i;
name=s;
}

void display()  {
	
	System.out.println("id is :"+id +" "+"Name is  :" +name );
}

public static void main(String[] args) {
	Parameterconst p1= new Parameterconst(23,"Harish");
	Parameterconst p2= new Parameterconst(24,"Abhishek");

	p1.display();
	p2.display();
	
}


}