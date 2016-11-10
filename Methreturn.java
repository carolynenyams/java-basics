class 	Harish2{
double height;
double width;
double depth;

double volume(){

	return height*width*depth;

}	
}

class Methreturn {
	public static void main(String[] args) {
	 double vol;
	Harish2 h1= new Harish2();
	Harish2 h2= new Harish2();

	h1.height=23;
	h1.width=20;
	h1.depth=10;

	h2.height=23;
	h2.width=15;
	h2.depth=10;


	vol=h1.volume();
	System.out.println("the volume is "+vol);


	vol = h2.volume();

	System.out.println("The New Volume is"+vol); 	
	

	}
	
}