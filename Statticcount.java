class Statticcount {


	static  int count=0;
Statticcount(){


	count++;
	System.out.println(count);
}

public static void main(String[] args) {
	
Statticcount s1 =new Statticcount();
Statticcount s2 =new Statticcount();
Statticcount s3 =new Statticcount();
Statticcount s4 =new Statticcount();
Statticcount s5 =new Statticcount();
/*
 output will be like this 
 1
 2
 3
 4
 5


 not like this 1
 1
 1
 1
 1
 1


*/





}
	
}

