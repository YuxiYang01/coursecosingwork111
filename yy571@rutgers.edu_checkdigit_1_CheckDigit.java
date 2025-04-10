/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Yuxi Yang, yuxi.yang@rutgers.edu, yy571
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        int len = args[0].length();
        long number = Long.parseLong(args[0]);
        int digit1 = 0, digit2 = 0;
        for(int i = 0; i < len; i++){
            int d = (int)(number%10);
            if(i%2==0)
                digit1 += d;
            else
                digit2 += d;
            number /= 10;
        }
        digit1 %= 10;
        digit2 = (digit2%10)*3%10;
        int result = (digit1+digit2)%10;

        System.out.println(result); 

    }
}