class This2  {


	int id;
	String name;
	This2(){
		System.out.println("Default constructor invoked");

	}
	
This2(int id, String name){
this();
this.id=id;
this.name=name;
}
 void display(){
System.out.println(id+" "+name);


 }
public static void main(String[] args) {
This2 t1 = new This2(22,"Harish");
This2 t2 = new This2(23,"Harish");
t1.display();
t2.display();


	
}


}