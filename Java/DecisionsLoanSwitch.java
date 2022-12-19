import java.util.Scanner;
public class DecisionsLoanSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       final double PROCESS_FEE = 350.00;
       double loanAmount=0, interest=0;
       int monthPay=0; double salary=0;
       
       System.out.println("MEMBER "); String name = input.nextLine();
       System.out.println("TYPE OF LOAN [s/c]"); char loanType = input.next().charAt(0);
       loanType = Character.toUpperCase(loanType);
       
       switch (loanType){
           case 'S':
           case 'C':
           System.out.println("MOTHLY SALARY "); salary = input.nextDouble();
	       System.out.println("MONTHS TO PAY"); monthPay = input.nextInt();
       
	       //process
	       if (loanType == 'C' || loanType == 'c')
	    	   loanAmount = 10_000;
	       else if (loanType == 'S' || loanType == 's')
	       {
	    	   if (salary > 30_000)
	    		   loanAmount = salary * 1.2;
	    	   else
	    		   loanAmount = salary * 1.1;
	       }
	     
	       
	       if (monthPay > 12)
	    	   interest = loanAmount * 0.065;
	       else
               interest = loanAmount * 0.05;
            break;
            
            default:
            System.out.println("INVALID input. End of the program");
            break;
       }  
	       
	       double takeHomePay = loanAmount - PROCESS_FEE;
	       double toPay = loanAmount + interest;
	       
	       //output
	       System.out.print ("\nLOAN DETAILS\n");
	       System.out.printf("\nMember\t\t\t\t%10s", name);
	       System.out.printf("\nMonthly Salary\t\t\t%,10.2f", salary);
	       System.out.printf("\nType of Loan\t\t\t%10c", loanType);
	       System.out.printf("\nAllowed loan Amount\t\t%,10.2f", loanAmount);
	       System.out.printf("\nMonths to Pay\t\t\t%10d", monthPay);
	       System.out.printf("\nLoan Interest\t\t\t%,10.2f", interest);
	       System.out.printf("\nProcessing fee\t\t\t%,10.2f", PROCESS_FEE);
	       System.out.printf("\nTAKE HOME PAY\t\t\t%,10.2f", takeHomePay);
	       System.out.printf("\nTOTAL AMOUNT TO PAY\t\t%,10.2f", toPay);
           System.out.printf("\nMONTHLY DUE\t\t\t%,10.2f", (toPay / monthPay));
           input.close();
       } 
    }
