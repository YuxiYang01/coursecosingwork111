/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:Yuxi Yang, yy571@rutgers.edu, yy571
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {
	
    public static void main(String[] args) {
		

		//WRITE YOUR CODE HERE
		if(args.length>0){
            int sum = 0, n = args.length;

            for(int i = 0;i<n;i++){
                sum += Integer.parseInt(args[i]);
            }

            int actualSum = (n*(n+1))/2;
            if(actualSum==sum){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
        }
        else{
            System.out.println("Error: PLease pass command line arguments");
        }
    }
}
	

