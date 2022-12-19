import java.util.*;
public class LoopsOddEven {
    public static void main(String[] args) {
        //for (initialization;condition;update)
    	Scanner read = new Scanner(System.in);
    	int ctr, num, sum = 0;
    	
    	for (ctr=1; ctr < 11; ctr++) //initialization; condition; body; update; condition; 
    	{
    		System.out.print("Enter # " + ctr + ": "); num=read.nextInt();
            sum += num;       //sum = sum + num;
            
            if (num % 2 == 0){
                System.out.println("Even.");
            }
            else{
                System.out.println("Odd.");
            }
    	}
    	
    	int ave = sum / (ctr - 1);
        System.out.println("Average of the " + (ctr-1) +" numbers is: " + ave);
    }
    
}
