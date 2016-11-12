/*Q) Can we execute a program without main() method?

Ans) Yes, one of the way is static block but in previous version of JDK not in JDK 1.7.

In JDK7 and above, output will be:

Output:Error: Main method not found in class A3, please define the main method as:
public static void main(String[] args)

Output:static block is invoked (if not JDK7)
*/
class Imp{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}  