
/*
This program is created to exception information on the console. So there are total three Method to do this . Look at the code you will get how 
to do it.

*/

/* 
########################################################
#    code  written by optimist2309                     #
# follow me on github.com @ github.com/optimist2309    #
#                                                      #
########################################################

 */


class Method  extends Throwable{
public static void main(String args[]){
    try {
System.out.println(10/0);

    } catch (ArithmeticException e){
  e.printStackTrace(); /* This  is first Method this will print all information of exception including name ,description, and stacktrace.  */
  System.out.println(e); /* This  is seconf  Method this will print name and description of exception */
  System.out.println(e.getMessage());/* This  is last  Method this  will print will description of exception*/
    }
}
}