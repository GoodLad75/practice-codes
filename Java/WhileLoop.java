import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int remark = 1;
        int passedCount=0; int failedCount=0;

        while (remark != 0){
            System.out.print("Enter remark: "); remark = input.nextInt();

            if (remark > 0 && remark <= 50){
                System.out.println("Failed."); failedCount++;
            }
            else if (remark > 50 && remark < 101){
                System.out.println("Passed."); passedCount++;
            }
            else if (remark < 0){
                System.out.println("Invalid input");
            }
        }

        System.out.println("Total Passed: " + passedCount);
        System.out.println("Total failed: " + failedCount);
        input.close();
    }
    
}
