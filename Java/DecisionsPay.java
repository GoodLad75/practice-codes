import java.util.Scanner;
public class DecisionsPay {
    public static void main(String[] args) {
        double hrsWorked; int skillLevel;
        
        double hrPayrate; double regPay; double otPay; double otTime;  
        double grossPay=0; double netPay; 

        double weeklyCost=0; double retirementPlan=0;
        char repIns; int repInsN=0; char repRetire; 

        Scanner input = new Scanner(System.in); 

        //INPUT//
        System.out.println("Barnhill Fastener Company - Payroll");
        System.out.println(" ");
        System.out.print("Please enter your skill level: "); skillLevel = input.nextInt();
        System.out.print("Please enter number of hours worked: "); hrsWorked = input.nextDouble();
        
        if (skillLevel == 1){
            hrPayrate = 17;
        }
        else if (skillLevel == 2){
            hrPayrate = 20;
        }
        else if (skillLevel == 3){
            hrPayrate = 22;
        }
        else{
            hrPayrate = 0;
            System.out.println("You entered an invalid character.");
        }
        
        //INSURANCE OPTIONS//
        switch (skillLevel){
            case 2:
            case 3:
            System.out.println(" ");
            System.out.println("***************************************************");
            System.out.println("* Insurance options:                  Weekly Cost *");
            System.out.println("* 1. Medical Insurance..................... 32.50 *");
            System.out.println("* 2. Dental Insurance...................... 20.00 *");
            System.out.println("* 3. Longterm disability Insurance......... 10.00 *");
            System.out.println("***************************************************");
            System.out.println(" ");
            
            System.out.println("Would You like to avail an insurance plan? (Y/N)"); repIns = input.next().charAt(0);
            repIns = Character.toUpperCase(repIns);
    
            if (repIns == 'Y'){
                System.out.print("Please enter the corresponding number: "); repInsN = input.nextInt();
                if (repInsN == 1){
                    weeklyCost = 32.50; System.out.println("Response Recorded.");
                }
                else if (repInsN == 2){
                    weeklyCost = 20.00; System.out.println("Response Recorded.");
                }
                else if (repInsN == 3){
                    weeklyCost = 10.00; System.out.println("Response Recorded.");
                }
                else{
                    System.out.println("Invalid number.");
                    weeklyCost = 0;
                }
            }
            else if (repIns == 'N'){
                System.out.println("Noted.");
            }
            else {
                System.out.println("Invalid Character.");
            }
            break;

            default:
            System.out.print(" ");
        }

        //PROCESS//
        regPay = hrPayrate * hrsWorked;
        otTime = hrsWorked % 40; otPay = otTime * (hrPayrate * 1.5);
        double totalPay = regPay + otPay;        
        grossPay = totalPay;

        if (weeklyCost > grossPay){
            System.out.println("Error.");
        }
        else{
            System.out.println(" ");
        }

        //FOR SKILL LEVEL 3//
        if (skillLevel == 3){
            System.out.println(" ");
            System.out.println("Retirement plan is 3% of your gross pay.");
            System.out.println("Would you like to avail a retirement plan? (Y/N)"); repRetire = input.next().charAt(0);
            repRetire = Character.toUpperCase(repRetire);
            
            if (repRetire == 'Y'){
                retirementPlan = grossPay * 0.03;
            }
            else if (repRetire == 'N'){
                retirementPlan = 0;              
            }
            
            netPay = (totalPay) - weeklyCost - retirementPlan;
        }
        else{
            System.out.println(" ");
            netPay = totalPay - weeklyCost;
        }

       //DISPLAY//
       System.out.println(" ");
       System.out.println("Hours worked: " + hrsWorked); 
       System.out.println("Hourly Pay Rate: " + hrPayrate);
       System.out.println("Regular Pay for 40 hours: " + regPay);
       System.out.println("Overtime Pay: " + otPay);
       System.out.println("Total of Regular and Overtime Pay: " + totalPay);
       
       if (skillLevel == 3){
        System.out.println("Retirement Plan Amount: " + retirementPlan);
        System.out.println("Total Itemized Deductions: " + (weeklyCost + retirementPlan));
       }
       else {
        System.out.println("Total Itemized Deductions: " + weeklyCost);
       }
       
       System.out.println("Net Pay: " + netPay);
       System.out.println(" ");
       System.out.println("Thank you for using this program.");
       input.close();
    }
}
