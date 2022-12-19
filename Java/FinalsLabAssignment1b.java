public class FinalsLabAssignment1b {
    public static void main(String[] args) {
        int row, col;     
      
        for (row= 1; row < 3; row++)
        {
        	for (col= 1;col < 5; col++)
                System.out.printf("01");
            System.out.println(" ");
            
            for (col= 1;col < 5; col++)
                System.out.printf("10");
            System.out.println(" ");          
        }
    }
}
