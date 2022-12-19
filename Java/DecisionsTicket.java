//LEWIS, PAOLO// //ICT-101//
import java.util.Scanner;
public class DecisionsTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String Name; String Residence; String ID; String Ticket;
        int age; int menuChoice; double ticketPrice=0; double foodPrice=0;
        double discount; double totalPay;
        
        
        System.out.print("Full name : "); Name = input.nextLine();
        System.out.print("Singapore Residence [YES/NO]: "); Residence = input.nextLine().toUpperCase();
        System.out.print("Do you have a resident ID? [YES/NO] : "); ID = input.nextLine().toUpperCase();
        System.out.print("Ticket with meal [YES/NO] : "); Ticket = input.nextLine().toUpperCase();
        System.out.print("Age: "); age = input.nextInt();
        System.out.println(" ");
        
        //FOR AGE//
        if (age > 1 && age <=5){ 
            ticketPrice = 0;
        }
        else if (age >= 65){
            ticketPrice = 20;
        }
        else{
            ticketPrice = 40;
        }
                
        //MEAL INCLUSION//
        if (Ticket .equals("YES")){
            
            System.out.println("\nSelect Meal [1 - 3]: ");
            System.out.println("1. Hotdog Sandwich, Fries, Soda");
            System.out.println("2. Cheeseburger, Fries, Soda");
            System.out.println("3. Rice Meal, Dessert, Soda");
            System.out.print("\nChoice: "); menuChoice = input.nextInt();

            if (menuChoice == 1){
                foodPrice = 15;
            }
            else if (menuChoice == 2){
                foodPrice = 20;
            }
            else if (menuChoice == 3){
                foodPrice = 30;
            }
            else{
                System.out.println("Invalid input.");
            } 

        }
        else{
            foodPrice = 0;
        }

        //FOR DISCOUNT SG//
        if (Residence .equals("YES") && ID .equals("YES")){
            if (age <= 6 && age >= 65){
                discount = 0;
            }
            else if (age > 6 && age < 65){
                discount = 0.05;
                ticketPrice = 40 - (40 * 0.05);
            }
        }
        else{
            discount = 0;
        }

        totalPay = ticketPrice + foodPrice;

        //OUTPUT//
        if (age == 0){
            System.out.println("Error. Invalid Age.");
        }
        else{
            System.out.println("-----------------------------------------------");
            System.out.println("|              Ticket Booth                   |");
            System.out.println("-----------------------------------------------");
            System.out.println("|Name: " + Name + "                             |");
            System.out.println("-----------------------------------------------");
            System.out.println("|Age: " + age + "                                      |");
            System.out.println("-----------------------------------------------");
            System.out.println("|Meal: $" + foodPrice + "                                  |");
            System.out.println("-----------------------------------------------");
            System.out.println("|Ticket: $" + ticketPrice + "                                 |");
            System.out.println("-----------------------------------------------");
            System.out.println("|Total Pay: $" + totalPay + "                              |");
            System.out.println("-----------------------------------------------");
        }
        input.close();
    }
    
}
