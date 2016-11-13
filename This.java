/*

There can be a lot of usage of java this keyword. In java, this is a reference variable that refers to the current object.
In  this program "this" keyword refer current class instance variable.




*/



class This  {

	int id;
	String name;

	This(int id,String name){
/*		
//id=id;
//name=name;
 in this condition object will give the null value

*/

 this.id=id;
 this.name=name;
	}
	
	void display(){
System.out.println(id+" "+name);


	}
public static void main(String[] args) {
	This t1 =new This(05,"Akash");
    This t2 =new This(17,"Ashish");
	This t3 =new This(23,"Harish");
    This t4=new This(31,"Manish");
    This t5 =new This(39,"Navin");
t1.display();
t2.display();
t3.display();
t4.display();
t5.display();



}


}

