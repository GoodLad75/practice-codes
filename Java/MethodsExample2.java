//LEWIS,PAOLO// //ICT 101//
import java.util.*;
public class MethodsExample2 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number: "); a = input.nextInt();
        System.out.print("Enter a number: "); b = input.nextInt();

        sum(a, b);
        difference(a, b);
        System.out.println("Product:" + product(a, b));
        input.close();
    }

    public static void sum (int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void difference (int a, int b){
        int difference = a - b;
        System.out.println("Difference: " + difference);
    }

    public static int product (int a, int b){
        int product = a * b;
        return product;
    }
}
