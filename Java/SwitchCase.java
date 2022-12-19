/****************************************************************************************
 *A salesman commission is determined by the type of appliance sold and sales amount.   *
 *Write a program that will enter the appliance type and sale price, and then output    *
 *the commission of the salesman. Save your file MidtermActual1.java and upload.        *
 *                                                                                      *
 *	Type          Sale Price              Commission                                    *
 *  A or a        15000 to 30000          10% of sale price or 2500 whichever is higher *
 *	B or b        10000 to 14999          5% of the sale price or 600 whichever is less *
 *	C or c        5000 to  9999           3% of the sale price                          *
 *	D or d        1000 to 4999            100.00                                        *
 ****************************************************************************************/
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salePrice; String charInput; double commission = 0;
        double commP;

        System.out.println("Enter appliance type: ");
        charInput = input.nextLine().toUpperCase();

        switch (charInput){
            case "A":
            System.out.println("Enter Price: "); salePrice = input.nextDouble();
            commP = salePrice * 0.1;
            if (salePrice >= 15000 && salePrice <= 30000){
                if (commP > 2500){
                    commission = commP;
                }
                else if (commP <= 2500){
                    commission = 2500;
                }
            }
            else {
                System.out.println("You entered an invalid Price.");
            }
            break;
            
            case "B":
            System.out.println("Enter Price: "); salePrice = input.nextDouble();
            commP = salePrice * 0.05;
            if (salePrice >= 5000 && salePrice <= 14999){
                if (commP < 600){
                    commission = commP;
                }
                else if (commP > 600){
                    commission = 600;
                }
            }
            else {
                System.out.println("You entered an invalid Price.");
            }
            break;

            case "C":
            System.out.println("Enter Price: "); salePrice = input.nextDouble();
            commP = salePrice * 0.03;
            if (salePrice >= 5000 && salePrice <= 9999){
                commission = commP;
            }
            else {
                System.out.println("You entered an invalid Price.");
            }
            break;
            
            case "D":
            System.out.println("Enter Price: "); salePrice = input.nextDouble();
            commission = 100;
            if (salePrice >= 1000 && salePrice <= 4999){
            }
            else {
                System.out.println("You entered an invalid Price.");
            }
            break;
            
            default:
                System.out.println("You entered an invalid character.");
        }
        System.out.println("Commission is: " + commission);
        input.close();
    }
}
