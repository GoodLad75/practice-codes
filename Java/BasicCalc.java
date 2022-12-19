import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInt; int secondInt; int answer=0; int operation;

        
        System.out.println("*         Calculator            *");
        System.out.println("*                               *");
        System.out.println("*       Enter two integers      *");
        System.out.println("*                               *");
        System.out.println("* First number: ");                  firstInt = input.nextInt();
        System.out.println("* Second number: ");                 secondInt = input.nextInt();
        System.out.println("*********************************");
        System.out.println("*      Select an operation      *");
        System.out.println("* (1) Add       (2) Subtract    *");
        System.out.println("* (3) Multiply  (4) Divide      *");
        System.out.println("*                               *");
        System.out.println("* Operation:                     "); operation = input.nextInt();
        System.out.println("*********************************");

        switch (operation){
            case 1:
            answer = firstInt + secondInt;
            System.out.println("\n Sum is: " + answer);
            break;

            case 2:
            answer = firstInt - secondInt;
            System.out.println("\nDifference is: " + answer);
            break;

            case 3:
            answer = firstInt * secondInt;
            System.out.println("\nProduct is: " + answer);
            break;

            case 4:
            answer = firstInt / secondInt;
            System.out.println("\nQuotient is: " + answer);
            break;

            default:
            System.out.println("Error in operation.");

        }
    }
}
