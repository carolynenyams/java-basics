/*
This program was created for understanding of use of  do while loop . Do while loop is used  whre 
we want excution of a loop of body at least once either condition true or false . Here is example 
you can undertsand of do while loop. 

*/

class Menu {
	public static void main(String[] args) 
		throws java.io.IOException {

char choice;
do{
System.out.println("Menu about me");
System.out.println("1. for my name");
System.out.println("2.for my job");
System.out.println("3. for know all about me");
System.out.println("CHoose ONe");
choice = (char) System.in.read();
} while (choice < '1' ||  choice>'3') ;
System.out.println("\n");
switch (choice) {
	case '1':
	System.out.println("hi my name is harish");
	break;
	case '2':
	System.out.println("engineer free aadmi ");
	break;
	case '3':
	System.out.println("you can contact me on 7848960004");
	break;
	
}


		}
		
	}
	
