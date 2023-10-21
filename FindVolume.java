public class FindVolume {
	   double width, height, depth;
	   
	    // Notice this constructor. It takes an
	    // object of type Box. This constructor use
	    // one object to initialize another
	   FindVolume(FindVolume ob)
	    {
	        width = ob.width;
	        height = ob.height;
	        depth = ob.depth;
	    }
	 
	    // constructor used when all dimensions
	    // specified
	   FindVolume(double w, double h, double d)
	    {
	        width = w;
	        height = h;
	        depth = d;
	    }
	 
	    // compute and return volume
	    double volume() { return width * height * depth; }
	 
	// MAin class
	
	    // Main driver method
	    public static void main(String args[])
	    {
	        // Creating a box with all dimensions specified
	    	FindVolume mybox = new FindVolume(10, 20, 15);
	 
	        //  Creating a copy of mybox
	    	FindVolume myclone = new FindVolume(mybox);
	 
	        double vol;
	 
	        // Get volume of mybox
	        vol = mybox.volume();
	        System.out.println("Volume of mybox is " + vol);
	 
	        // Get volume of myclone
	        vol = myclone.volume();
	        System.out.println("Volume of myclone is " + vol);
	    }
	}