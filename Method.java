class Harish {
double width;
	double height;
	double depth;

	void volume(){

System.out.print("The volume is");
System.out.println(width*height*depth);

	}
	
}
 class Method  {
 	public static void main(String[] args) {

Harish my1= new Harish();
Harish my2=new Harish();
my1.height=20;
my1.width=12;
my1.depth=23;

my2.height=23;
my2.width=20;
my2.depth=10;
my1.volume();
my2.volume();





 		
 	}
 	
 }

