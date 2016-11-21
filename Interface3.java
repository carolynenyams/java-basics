/*
Interface inheritance

A class implements interface but one interface extends another interface .
Here is example of interface inheritance.
*/
interface Harish {
	void abhishek();
}

interface prem extends Harish{
	void prakash();
}
class Interface3  implements prem{
public void prakash(){
	System.out.println("HAI I AM prakash");
}

 public void abhishek(){
	System.out.println("HAI I AM abhishek");
}

public static void main(String[] args) {
	Interface3 a1 = new Interface3();
	a1.prakash();
	a1.abhishek();
}
	
}