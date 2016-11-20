abstract  class box {
	box(){
System.out.println("bike created");
	}
abstract void run();
void changegear(){
	System.out.println("Gear changing");
}
}

class honda extends box{
void  run(){
	System.out.println("BIKE NAME IS CIVIC AND RUNNING SAFELY");
}


}
class Testabst2  {
	public static void main(String[] args) {
		box a1 =new honda();
		a1.run();
		a1.changegear();
	}
	
}