class Harish  {
double height; 
double width;
double depth;

double volume(){

	return height*width*depth;

}

void setdim(double h, double d, double w){

height=h;
width=w;
depth=d;
}
}
class Paramethod  {
	public static void main(String[] args) {
	Harish h1 = new Harish();
	Harish h2 = new Harish();
	double vol;
   h1.setdim(10,20,30);
   h2.setdim(12,32,32);

   vol=h1.volume();
   System.out.println("The volume is " + ":"+vol);
   vol=h2.volume();
   System.out.println("The new volume is " +":"+vol);
	}	
}