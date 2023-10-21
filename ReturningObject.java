public class ReturningObject {
	  int a;
	  
	    // Constructor
	  ReturningObject(int i) { a = i; }
	 
	    // Method returns an object
	  ReturningObject incrByTen()
	    {
		  ReturningObject temp
	            = new ReturningObject(a + 10);
	        return temp;
	    }
	 
	// Class 2
	// Main class
	 
	    // Main driver method
	    public static void main(String args[]) {
	 
	        // Creating object of class1 inside main() method
	    	ReturningObject ob1 = new ReturningObject(2);
	    	ReturningObject ob2;
	 
	        ob2 = ob1.incrByTen();
	 
	        System.out.println("ob1.a: " + ob1.a);
	        System.out.println("ob2.a: " + ob2.a);
	    
	}
}