import java.util.*;
public class DecisionsOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        for (int ctr = 1; ctr < 6; ++ctr){
            System.out.print("Enter Number " + ctr + ":");
            int num = input.nextInt();

            if (num == 0)
            continue;

            if (num % 2 == 0)
            System.out.print(" " + num + " is even and is ");

            else
            System.out.print(" " + num + " is odd and is ");

            if (num < 0 )
            System.out.print("Negative. \n");

            else
            System.out.print("Positive. \n");

        }

        System.out.println("End of program.");
        input.close();


    }
    
}
