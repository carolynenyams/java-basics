abstract class harish {
	abstract void run();
}

class Abstract extends harish {
void run(){

	System.out.println("CHild class is running");}

public static void main(String args[]) {
harish a1 = new Abstract();
a1.run();
	
}



}

	

