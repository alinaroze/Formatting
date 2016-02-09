import java.util.Arrays;
public class Exercise11{

	
	public static void main( String [] args )
    {  	
    	
    	int [] c = { 24, 2, 2, 3, 4, 5, 7};
    	int x = 10;
    	
    	guess(c, x);
   
    }
	
	
    public static int guess(int[] c, int x){
         if(c.length==1){
              System.out.printf("z(%d) = %d\n", c.length-1, c[0]);
              return c[0];
         }
        else{
              System.out.printf("z(%d) = %d * z(%d) + %d\n", c.length-1, x, c.length-2, c[0]);
              return x*guess(Arrays.copyOfRange(c, 1, c.length), x) + c[0];
        } //end if
     } //end guess
}