package sortsearch.bubble;

public class Search {

  static int[] arr = { 4, 5, 12, 0, -4, 3, 82, -30, 6, 8, 13, -10, 15, 11 };   // Creating a random array
	
  public static String findNumberInArray(int[] ar,int ourValue){//Creating our method with parameters - our array & searching value
	        
	        for (int i = 0; i < ar.length; i++) { // We will go through the array
	            
	            if (ourValue == ar[i]) {  //When we will found our value - return it's index
	                return "Our values index is "+i;
	            }
	        }
	        
	        return "There is no our value";  //When there is no our value return zero
}

	public static void main(String[] args) {		    
	     
	        System.out.println(findNumberInArray(arr, 4));  // Call our method
	 
	    }
	 
	    
	   
}




