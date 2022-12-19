//LEWIS,PAOLO// //ICT-101//
import java.util.*;
public class FinalsLabActual2 {
    public static void main(String[] args) {
        int num[] = new int[10];
        int largest = num [0]; int smallest = num [0];
        int sum=0; int i;
        Scanner input = new Scanner (System.in);

        //INPUT//
        for (i = 0; i <10; i++){
            System.out.print("Enter a positive integer: ");
            num[i] = input.nextInt(); 
        }
        input.close();

        //PROCESS//
        for (i = 0; i < num.length; i++){
            if (num[i] > largest){
                largest = num[i];
            }
            else{
                smallest = num[i];
            }
        }
        for (i = 1; i < num.length; i++){
            sum = sum + num[i];
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        int average = sum/10;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
