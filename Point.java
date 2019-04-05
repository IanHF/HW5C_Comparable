/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    
    public static int compareTo(Point input){
        int x = Math.abs(this.xcor);
        int y = Math.abs(this.ycor);
        if ((x + y) > (Math.abs(input.xcor) + Math.abs(input.ycor))){
            return 1;
        }else{
            if((x + y) = (Math.abs(input.xcor) + Math.abs(input.ycor))){
                return 0;
            }else{
                return -1;
            }
        }
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor){
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}