import java.util.Scanner;
public class DecisionsPet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double residence; double hrsHome; String petReco = "none.";

        System.out.println("Pet Recommendation based on your lifestyle.");
        
        System.out.println("\nWhere do you live? Enter the number that corresponds your answer.");
        System.out.println("(1)House (2)Apartment (3)Dormitory");
        System.out.print("\nYour answer: "); residence = input.nextDouble();
        
        System.out.println("\nAverage number of hours you're home: ");
        System.out.println("(1) 18 or more (2) 10 to 17 (3) 8 to 9");
        System.out.println("(4) 6 to 7     (5) 0 to 5");
        System.out.print("\nYour answer: "); hrsHome = input.nextDouble();

        if (residence == 1){
            if (hrsHome == 1){
                petReco = "Pot-bellied Pig";
            }
            else if (hrsHome == 2){
                petReco = "Dog";
            }
            else if (hrsHome == 3 || hrsHome == 4 || hrsHome == 5){
                petReco = "Snake";
            }
        }
        else if (residence == 2){
            if (hrsHome == 1 || hrsHome == 2){
                petReco = "Cat";
            }
            else if (hrsHome == 3 || hrsHome == 4 || hrsHome == 5){
                petReco = "Hamster";
            }
        }
        else if (residence == 3){
            if (hrsHome == 1 || hrsHome == 2 || hrsHome == 3 || hrsHome == 4){
                petReco = "Fish";
            }
            else if (hrsHome == 5){
                petReco = "Ant Farm";
            }
        }         
        else{
            System.out.println("There was something wrong with the data you provided. Try again.");
        }
        
        System.out.println("\nBased on your lifestyle, your pet should be a: ");
        System.out.println(petReco);

        System.out.println("\nThank you for using this program.");
    }
}
