//LEWIS, PAOLO//

import java.util.*;

public class FinalsLabRev{
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        double loanAmt=0; double monthlyPay=0; double interest=0;
        double newBal=0;

        System.out.print("Enter Loan Amount: "); loanAmt = read.nextDouble();
        System.out.print("Enter Interest Rate: "); interest = read.nextDouble();
        System.out.print("Enter Monthly Pay: "); monthlyPay = read.nextDouble();

        do{
            double interestN = loanAmt * (interest / 100); // ANNUAL INTEREST IN PESO
            double monthlyInt = interest / 12; //MONTHLY INTEREST
            double interestAmt = loanAmt * (monthlyInt / 10); //MONTHLY INTEREST IN PESO

            double paymentM = monthlyPay + monthlyInt; //MONTHLY
            double monthsToPay = loanAmt / paymentM; //NO. OF MONTHS
            double totalLoan = (paymentM * monthsToPay) + interestN ; // TOTAL LOAN AMT

            if (monthlyPay < interestAmt)
            {
                System.out.println(" ");
                System.out.println("WARNING: Payment too Low! Loan cannot be repaid.");
            }

            System.out.printf("\nMonths to Pay:%8.0f\n", monthsToPay);
            System.out.printf("\nAmount:%8.0f\n" , totalLoan);

            loanAmt = loanAmt - paymentM;

        } while (loanAmt > monthlyPay);
            


   

    }

}