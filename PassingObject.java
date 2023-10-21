public class PassingObject {
	  int a, b;
	  
	    // Constructor
	  PassingObject(int i, int j)
	    {
	        a = i;
	        b = j;
	    }
	 
	    // Method
	    boolean equalTo(PassingObject o)
	    {
	        // Returns true if o is equal to the invoking
	        // object notice an object is passed as an
	        // argument to method
	        return (o.a == a && o.b == b);
	    }
	
	 
	// Main class
	
	    // MAin driver method
	    public static void main(String args[])
	    {
	        // Creating object of above class inside main()
	    	PassingObject ob1 = new PassingObject(100, 22);
	    	PassingObject ob2 = new PassingObject(100, 22);
	    	PassingObject ob3 = new PassingObject(-1, -1);
	 
	        // Checking whether object are equal as custom
	        // values
	        // above passed and printing corresponding boolean
	        // value
	        System.out.println("ob1 == ob2: "
	                           + ob1.equalTo(ob2));
	        System.out.println("ob1 == ob3: "
	                           + ob1.equalTo(ob3));
	    }
	}
