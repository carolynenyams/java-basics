class Multileval1  {
	void display(){
System.out.println("papa class");

	}
	
class Multileval2 extends Multileval1{
	void display(){

System.out.println("CHACHA CLASS");

	}

	
}

class Multileval extends Multileval2 {
void display(){
	System.out.println("BHai CLASS");
}	

}
public static void main(String[] args) {
	Multileval1 a1, a2 ,a3;
	a1 = new Multileval1();
	a2 = new Multileval2();
	a3= new Multileval();
	a1.display();
	a2.display();
	a3.display();

}


}
