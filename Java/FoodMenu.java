/* Using if-else statement and switch statement, create a simple point of sale system.
1. Display a Main Menu.
2. Display sub menu for choices.
3. Enable the user to choose size of item.
4. Enable the user to choose quantity of item.
5. Return to Main menu after choosing from sub menu.
6. Computer user's total bill.
7. Accept Payment.
8. Compute change.
9. Thank user and exit the program. */
import java.util.Scanner;
public class FoodMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char order; double orderPrice=0; double orderQT=1; char orderSize; double newOrderPrice=0;
        char answer; char subOrder; double subOrderPrice=0; double payment; double subOrderQT=1;
        
        System.out.println("*****************************************************");
        System.out.println("*           TRAVIS SCOTT'S LA FLAME MENU            *");
        System.out.println("*  A. SICKO MODE FRIES.....................$ 10.00  *");
        System.out.println("*  B. GOOSEBUMPS BURGER....................$ 15.00  *");
        System.out.println("*  C. CHASE B\'S JAMBA JUICE...............$ 20.00   *");
        System.out.println("*****************************************************");

        System.out.println("\nPlease enter your order (A, B, C): "); order = input.next().charAt(0);
        order = Character.toUpperCase(order);
        if (order == 'A'){
            orderPrice = 10;
        }
        else if (order == 'B'){
            orderPrice = 15;
        }
       else if (order == 'C'){
            orderPrice = 20;
        }
        else{
            System.out.println("You entered an invalid character fam.");
            orderPrice = 0;
        }

        System.out.println("Enter quantity: "); orderQT = input.nextDouble();
        
        System.out.println("\nChoose them size bruh");
        System.out.println("(L) Large (+ $5.00)");
        System.out.println("(X) Xtra Large (+ $7.00)");
        System.out.println("(S) Sicko Size (+ $10.00)");
        System.out.println("\nSize: "); orderSize = input.next().charAt(0);
        orderSize = Character.toUpperCase(orderSize);
        
        if (orderSize == 'L'){
            newOrderPrice = orderPrice + 5;
        }
        else if (orderSize == 'X'){
            newOrderPrice = orderPrice + 7;
        }
        else if (orderSize == 'S'){
            newOrderPrice = orderPrice + 10;
        }
        else{
            System.out.println("You entered an invalid character fam.");
            newOrderPrice = 0;
        }

        System.out.println("\nWant some sides fam? (Y / N)"); answer = input.next().charAt(0);
        answer = Character.toUpperCase(answer);

        if (answer == 'Y'){
            System.out.println(" ");
            System.out.println("*****************************************************");
            System.out.println("*                 ADDITIONAL FLAME                  *");
            System.out.println("*  X. AUTOTUNE EVO........................$ 5.00    *");
            System.out.println("*  Y. DON TOLIVER\'S DON JULIO............$ 10.00    *");
            System.out.println("*  Z. MIKE DEAN\'S SYNTH..................$ 15.00    *");
            System.out.println("*****************************************************");

            System.out.println("\nEnter order fam: "); subOrder = input.next().charAt(0);
            subOrder = Character.toUpperCase(subOrder);
            System.out.println("How many of those flames fam? "); subOrderQT = input.nextDouble();

            if (subOrder == 'X'){
                subOrderPrice = 5;
            }
            else if (subOrder == 'Y'){
                subOrderPrice = 10;
            }
            else if (subOrder == 'Z'){
                subOrderPrice = 15;
            }
            else{
                System.out.println("You entered an invalid character fam.");
                subOrderPrice = 0;
            }
        }
        else if (answer == 'N'){
            System.out.println("Aight fam you got it.");
        }

        double totalBill = (newOrderPrice * orderQT) + (subOrderPrice * subOrderQT);
        System.out.println("Your total bill: " + totalBill);
        System.out.println("\nHow much you got there fam?"); payment = input.nextDouble();
        System.out.println(" ");
        
        if (payment > totalBill ){
            double change = payment - totalBill;
            System.out.println("You have a change of: $" + change);
        }
        else if (payment == totalBill){
            System.out.println("Exact payment? Yes sir!");
        }
        else{
            System.out.println("Insufficient money? Throw this into the moshpit.");
        }
        
        System.out.println("\nAight. Thanks for buying. ALL HAIL LA FLAME");
        input.close();
    }
}
