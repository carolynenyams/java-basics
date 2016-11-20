class bhai {
	
void run(){
	System.out.println("NAVINWA SIDE HEROHAI");
	}
}
class harish extends bhai{
	void run(){
		System.out.println("harish hero hai");
	}
}

class akash extends harish{

void run(){

	System.out.println("AKASHWA CHOTKA HERO ");
}


public static void main(String[] args) {
	bhai a1, a2,a3;
a1 =new bhai();
a2=new harish();
a3= new akash();
a1.run();
a2.run();
a3.run();

}

}