/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Yuxi Yang, yy571@rutgers.edu, yy571
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
	    // WRITE YOUR CODE HERE
        double[] array2 = new double[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
	    // WRITE YOUR CODE HERE
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        // WRITE YOUR CODE HERE
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] + dx;
            y[i] = y[i] + dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        // WRITE YOUR CODE HERE
        for(int i = 0; i < x.length; i++){
            x[i] = x[i] * Math.cos(theta) - y[i] * Math.sin(theta);
            y[i] = y[i] * Math.cos(theta) + x[i] * Math.sin(theta);
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        StdDraw.setScale(-5.0, +5.0);
        double[] x = {0, 1, 1, 0};
        double[] y = {0, 0, 2, 1};
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        //test 1: copy
        double[] y2 = copy(y);
        y2[0] = 20;
        System.out.println(y[0]);//should print out 0

        //test 2: scale
        double alpha = 2.0;
        scale(x, y, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);

        //test 3: translate
        double dx = 2.0, dy = 1.0;
        translate(x, y, dx, dy); 
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.polygon(x, y);

        //test 4: rotate
        double theta = 45.0; 
        rotate(x, y, theta); 
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.polygon(x, y);
    }
}
