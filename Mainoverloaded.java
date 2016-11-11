class Mainoverloaded  {

public static void main(int a) {
	System.out.println(a);
	System.out.println("This is From frm 2nd main ");
	
}


	public static void main(String[] args) {
		System.out.println("Main method With Original Signature");
		main(10);
	}
	
}