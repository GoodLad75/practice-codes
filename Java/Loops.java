//LOOPS JAVA//

public class Loops {
    public static void main(String[] args) {

        int col, row;
    	
    	//Nested Loop 1
    	for (row = 1; row < 3; row++)
    	{
    		for (col = 1; col < 3; col++)      //innerloop
    			System.out.print("@");         //@@@@@
    		System.out.println();
        }
        
        //Nested Loop 2
    	for (row = 1; row < 6; row++)
    	{
            int num=5;
            for (col = 1; col < 6; col++)      //innerloop
    			System.out.print(num );         //@@@@@
    		System.out.println();
        }
        
        //Nested Loop 2 Sample Output
    	for (row = 5; row > 0; row--)
    	{
    		for (col = 1; col < 6; col++)      //innerloop
    			System.out.print(row+"  ");         
    		System.out.println();
        }
        
        System.out.println();
    	//Nested Loop 3 Sample Output
    	for (row = 1; row < 6; row++)
    	{
    		for (col = 1; col < 6; col++)       //innerloop
    			System.out.print(row+"  ");         
    		System.out.println();
    	}
    	
    	System.out.println();
    	//Nested Loop 4 Sample Output
    	for (row = 1; row < 6; row++)
    	{
    		for (col = 1; col < 6; col++)       //innerloop
    			System.out.print(col+"  ");         
    		System.out.println();
    	}
    	
    	System.out.println();
    	//Nested Loop 4 Sample Output
    	for (row = 1; row < 6; row++)
    	{
    		for (col = 5; col > 0; col--)       //innerloop
    			System.out.print(col+"  ");         
    		System.out.println();
    	}



    }
}
