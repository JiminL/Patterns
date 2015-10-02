/**
 * Created by painter on 9/9/15.
 */
public class Countdown {

    public static String pattern( int n) {
        //Happy Coding ^_^
    	String sting = "";
    	for(int j=n; j>0; j--){
    		
    		for(int i=j; i>0; i-=1){
    			System.out.print(i);
    			
    			
        }
    	System.out.println("");
    
    }
        return sting;
        	
    }
        	 
    

    public static void main(String[] args){

      
        System.out.print(pattern(10));
   
        
    }
}
