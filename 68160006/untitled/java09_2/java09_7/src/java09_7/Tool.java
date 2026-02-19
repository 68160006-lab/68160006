package java09_7;

public class Tool {
	public static int add(int x, int y) { 
		return x + y;
	}
	public static int mul(int x, int y) { 
		return x * y;
	}
	public static int sub(int x, int y) { 
		return x - y;
	}
    public static int max(int x, int y) {
    	if (x >= y)
    		return x;
    	else
    		return y;
    }
    public static int max(int x, int y, int z) {
    	int  m = x;
    	if (m < y) 
                              m = y;
    	if (m < z) 
    	  m = z;
   
    	return m;
    }
    public static int min(int x, int y) {
    	if (x <= y)
    		return x;
    	else
    		return y;
    }
    public static int min(int x, int y, int z) {
    	int m = x;
    	if (m > y) 
                               m = y;
    	if (m > z) 
            m = z;
   
    	return m;
    }
}