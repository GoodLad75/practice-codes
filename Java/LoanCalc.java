import java.util.*;
public class LoanCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double loanAmt = 0; double interest = 0; double mPayment = 0;
        double a = 0; double numMonth = 0; 
        

        //INPUT//
        System.out.print("Loan Amount: "); loanAmt = input.nextDouble();
        System.out.print("Interest per Year: "); interest = input.nextDouble();
        System.out.print("Monthly Payment: "); mPayment = input.nextDouble();

        solving(numMonth, loanAmt, interest, mPayment);

    }
    public static double solving (double numMonth, double loanAmt, double interest, double mPayment){
        
            double interestN = loanAmt * (interest / 100); // ANNUAL INTEREST IN PESO
            double monthlyInt = interest / 12; //MONTHLY INTEREST
            double interestAmt = loanAmt * (monthlyInt / 10); //MONTHLY INTEREST IN PESO

            double paymentM = mPayment + monthlyInt; //MONTHLY
            double monthsToPay = loanAmt / paymentM; //NO. OF MONTHS
            double totalLoan = (paymentM * monthsToPay) + interestN ; // TOTAL LOAN AMT

            if (mPayment < interestAmt)
            {
                System.out.println(" ");
                System.out.println("WARNING: Payment too Low! Loan cannot be repaid.");

            }
            
            System.out.printf("Months to Pay:%8.0f\n", monthsToPay);
        return numMonth;

    }
}
