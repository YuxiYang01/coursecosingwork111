/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Yuxi Yang, yuxi.yang@rutgers.edu, yy571
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {
        
        // WRITE YOUR CODE HERE
        int largest = Integer.parseInt(args[0]);
        if(largest < Integer.parseInt(args[1])){
            largest = Integer.parseInt(args[1]);
        }
        if(largest < Integer.parseInt(args[2])){
            largest = Integer.parseInt(args[2]);
        }
        if(largest < Integer.parseInt(args[3])){
            largest = Integer.parseInt(args[3]);
        }
        if(largest < Integer.parseInt(args[4])){
            largest = Integer.parseInt(args[4]);
        }

        System.out.println(largest); 
    }
}