//ACTUAL LAB EXAMPLE//
/*PROBLEM
    Johnny owns an ISP company. They offer three types of packages.
    Package a / A = 20 MBPS + incl. of HD cable // 1500 PHP
    Package b / B = 25 MBPS + incl. of Landline // 2000 PHP
    Package c / C = 30 MBPS + incl. of Netflix Subscription // 3000 PHP
    Ask the user to input the type of package he/she would avail. Display the price and info about the package.
    Display error when user inputs an invalid character.   */

import java.util.Scanner;
public class DecisionISP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "A"; String b = "B"; String c = "C";
        String packageType;

        //Ask user input//
        System.out.println("Please enter package type: "); packageType = input.nextLine().toUpperCase();
        input.close();
        //even if user inputs a lowercase letter, we automatically convert it to uppercase//

        if (packageType .equals(a)){
            System.out.println("Package A");
            System.out.println("Price: 1500 PHP");
            System.out.println("Inclusion: HD Cable");
        }
        else if (packageType .equals(b)){
            System.out.println("Package B");
            System.out.println("Price: 2000 PHP");
            System.out.println("Inclusion: Landline");
        }
        else if (packageType .equals(c)){
            System.out.println("Package C");
            System.out.println("Price: 3000 PHP");
            System.out.println("Inclusion: Netflix Subscription");
        }
        else{
            System.out.println("Please enter a valid character. Thank you.");
        }

    }
}
