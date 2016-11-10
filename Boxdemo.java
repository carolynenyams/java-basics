class Box {
	double width;
	double height;
	double depth;
}

class Boxdemo {
	
public static void main(String[] args) {

Box mybox = new Box();
Box mynox = new Box(); 
double vol;
mybox.height=20;
mybox.width=10;
mybox.depth=20;
vol= mybox.height*mybox.width*mybox.depth;



System.out.println("Volume is "+vol);

mynox.height=24;
mynox.width=10;
mynox.depth=5;


vol=mynox.height*mynox.width*mynox.depth;

System.out.println("New Volume is " +vol);
}

}