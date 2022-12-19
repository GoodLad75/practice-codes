import java.util.Scanner;
public class MethodsMinMax 
{
	public static Scanner input = new Scanner(System.in);    //global object
	
	public static void main(String[] args)
    {
    	int x, y, z;
		System.out.println("Enter values for x, y and z: ");
    	x = input.nextInt();
    	y = input.nextInt();
    	z = input.nextInt();
				
		System.out.println("Minimum : " + myMin(x,y,z));
		System.out.println("Maximum : " + myMax(x,y,z));
    }
    
    //returning method with parameters
    public static int myMin(int x, int y, int z)                           //method definition
    {
    	int min;
    	    	
    	if (x < y && x < z)
    	{
    		min = x;
    		
    	}
    	else if ( y < z && y < x)
    	{
    		min = y;
    	    
        }else 
            min = z;   

    	return min;  	    	
    } 
    
    //returning method with parameters
    public static int myMax(int x, int y, int z)                           //method definition
    {
    	int max;
    	    	
    	if (x > y && x > z)
    	{
    		max = x;
    		
    	}
    	else if ( y > z && y > x)
    	{
    		max = y;
    	    
        }else 
            max= z;   
             	
    	return max;  	  	
    
    } 

}
