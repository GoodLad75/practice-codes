import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        /*THIS IS A VERY SIMPLE GRADE CALCULATOR
        THAT UTILIZES ARRAYS*/

        //INITIALIZE VARIABLES
        int n = 10;
        int [] gradeArr = new int[n]; 
        int lowest = gradeArr[0]; int highest = gradeArr[0];
        Scanner input = new Scanner (System.in);
        int average = 0; int sum = 0;

        //Input
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter your grade: ");
            gradeArr[i] = input.nextInt();
        }
        
        //Average
        for (int i = 0; i < n; i++)
        {
            sum = sum + gradeArr[i];
            average = sum / n;
        }
        
        //Lowest, Highest
        for (int i = 0; i < n; i++)
        {
            if (n > highest)
                highest = gradeArr[i];
            else
                lowest = gradeArr[i];
        }

        //Output
        System.out.println("Average: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

    }
}
