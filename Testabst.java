abstract  class shape{
	abstract void display();
}

class   ractangle extends shape {
void display(){
System.out.println("ractangle");
}
}	

class sqaure extends shape{

	void display(){
		System.out.println("sqaure");
	}
}
class Testabst{
	public static void main(String args[]) {
	
shape s = new ractangle();
s.display();	
	
	
}
}