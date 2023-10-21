public class ObjectAllocateDynamically {

	void show() 
	{
	    System.out.println("Test::show() called");
	}
	    
	    // Driver Code
	    public static void main(String[] args)
	    {
	    	//Test t; 
	        // Error here because t 
	        // is not initialized so there will be error
	        // all objects are dynamically 
	        // allocated
	    	ObjectAllocateDynamically object = new ObjectAllocateDynamically(); 
	    	object.show(); // No error 
	  }
}
	