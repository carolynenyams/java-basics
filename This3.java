/*

Where to use this() constructor call?

The this() constructor call should be used to reuse the constructor in the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. 




*/
class This3 
 {
int id;
String name;
String city ;

This3(int id ,String name){
this.id=id;
this.name=name;
}
 This3(int id, String name, String city){
this(id,name); //Rule: Call to this() must be the first statement in constructor.
this.city=city;
 }

void display(){

System.out.println(id+" "+name+" "+city);
 
}
public static void main(String[] args) {
	This3 t1= new This3(22, "harish");
	This3 t3 =new This3(22, "harish","BALLIA");
	t1.display();
	t3.display();

}

	
}