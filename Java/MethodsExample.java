//LEWIS,PAOLO// //ICT 101//
import java.util.*;
public class MethodsExample {
 
    public static void main(String[] args) {
        int numberOfEggs;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter number of eggs: ");
        numberOfEggs = input.nextInt();

        dozen(numberOfEggs);
        input.close();
    }

    public static void dozen(int numberOfEggs)
    {
        int dozenEggs = numberOfEggs / 12;
        int leftOverEggs = numberOfEggs % 12;
        System.out.println("Number of Dozens: " + dozenEggs);
        System.out.println("Left Over Eggs: " + leftOverEggs);
        
    } 
}
