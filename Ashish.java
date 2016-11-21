/*
Multileval inheritance is not possible in java directly but we can achive by using interface.


Multiple inheritance in Java by interface

If a class implements multiple interfaces, or an interface extends multiple interfaces i.e. known as multiple inheritance.

Below is example of multi leval interface dedicated to my special friends .
*/



interface harish {
void navin();
}
interface akash {
	void manish();
}

class Ashish implements harish,akash{
	 public void navin(){
		System.out.println("ANURAG HERO HAI");
	}
	
	 public void manish(){
		System.out.println("Ankit HERO HAI");
	}

public static void main(String[] args) {
	Ashish Ravibaba= new Ashish();
	Ravibaba.navin();
	Ravibaba.manish();

}
}
