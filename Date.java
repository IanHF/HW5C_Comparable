/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    public static int compareTo(Date input){
    	int y = this.y;
    	int m = this.m;
    	int d = this.d;
    	if(this.equals(input)){
    		return 0;
    	}else{
    		if (this.y > input.y){
    			return 1;
    		}
    		if (this.y < input.y){
    			return -1;
    		}else{
    			if (this.m > input.m){
    				return 1;
    			}
    			if (this.m < input.m){
    				return -1;
    			}else{
    				if (this.d > input.d){
    					return 1;
    				}
    				if (this.d < input.d){
    					return -1;
    				}
    			}
    		}
    	}
    } 
    /**
      @return a string representation of this instance
     */
/*    public boolean isDayGreater(Date a, Date b){
    	if (a.d > b.d){
    		return true;
    	}else{
    		return false;
    	}
    }*/

    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }

}