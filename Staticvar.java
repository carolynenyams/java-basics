/*

Java static variable

If you declare any variable as static, it is known static variable.

The static variable can be used to refer the common property of all objects (that is not unique for each object) e.g. company name of employees,college name of students etc.
The static variable gets memory only once in class area at the time of class loading.

Suppose there are 500 students in my college, 
now all instance data members will get memory 
each time when object is created.All student have its unique rollno and name so instance data member is good.
Here, college refers to the common property of all objects.If we make it static,
this field will get memory only once.

Java static property is shared to all objects.

*/

class Staticvar  {

	int rollno;
	String name;
	static  String college="SCRIET";
Staticvar(int i , String s){
rollno=i;
name=s;
}
void display()   {
System.out.println(rollno+" "+name+" "+college);	
}
public static void main(String[] args) {
Staticvar s1 = new Staticvar(22,"HArish");
Staticvar s2 = new Staticvar(23,"Priyanka");

s1.display();
s2.display();	
}
}