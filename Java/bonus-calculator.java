import java.util.Scanner;
public class Bonus
{
    private static int salesAmt;

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    input.close();
    
    System.out.println("Please enter sales amount: "); salesAmt = input.nextInt(); 

    if (salesAmt <= 250){
        int bonus = 10;
        System.out.println("Bonus is: " + bonus);
    }
    
    if  (salesAmt < 251){
        int bonusRate;
        System.out.println("Please enter bonus rate: "); bonusRate = input.nextInt();
        System.out.println("Bonus amount is: " + salesAmt * bonusRate); 

    }

    }
}