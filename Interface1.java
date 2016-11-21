interface harish {
void run();

}

class Interface1  implements harish {
 public void run(){
	System.out.println("hELLO RUNNING");
}
public static void main(String[] args) {
		Interface1 a1 = new Interface1();
		a1.run();
	}	
}
