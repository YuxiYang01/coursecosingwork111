/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Yuxi Yanng, yy571@scarletmail.rutgers.edu, yy571
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

	    // WRITE YOUR CODE HERE
	    int w = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int z = Integer.parseInt(args[3]);
        
        boolean asce_order = (w<x)&&(x<y)&&(y<z);
        boolean desc_order = (w>x)&&(x>y)&&(y>z);

        System.out.println(asce_order || desc_order);
    }
}
