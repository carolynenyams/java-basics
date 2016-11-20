class runtime2  {
	void runt(){

		System.out.println("runtime is running");
	}
	
}



class runtime extends runtime2 
 {
void runt(){

	System.out.println("runtime2 is running");
}

public static void main(String[] args) {
	runtime2 a = new runtime();
	a.runt();
	
}


	
}