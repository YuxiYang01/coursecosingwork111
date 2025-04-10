/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:Yuxi Yang, yy571@rutgers.edu, yy571
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int r,c,i,j;
        int k=2;
        // r means number of rows
        // c means number of columns
        r = Integer.parseInt(args[0]);
        c = Integer.parseInt(args[1]);
        
        int arr[][]=new int[r][c];

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=Integer.parseInt(args[k]);
                k++;
            }
        }

        int highest_index = 0;
        int highest_rate_sum = 0;
        for(i=0;i<c;i++){
            int rate_sum = 0;
            for(j=0;j<r;j++){
                rate_sum += arr[j][i];
            }
            if(rate_sum > highest_rate_sum){
                highest_rate_sum = rate_sum;
                highest_index = i;
            }
        }
        System.out.println(highest_index);

    }
}