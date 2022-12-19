//METHODS DEMO//
public class MethodsIntro {

    //WHAT IS A METHOD?//
    //A METHOD IS A BLOCK OF CODE EXECUTED IN ONE LINE.//

    public static void main(String[] args) {
        //THIS IS THE MAIN METHOD OF THE PROGRAM.//
        //THIS IS WHAT RUNS WHEN YOU PRESS THE RUN BUTTON.//

        //EXAMPLE//
        int a = 12; int b = 13;
        System.out.println(a * b);
        //Output is 156.//

        //Let's change the values.//
        int c = 50; int d = 45;
        System.out.println(c * d);
        //Output is 2250.//

        //What if we need to redo this code for 100x?//
        //Do we declare 100 variables? Copy the code 100x?//
        //Why don't we just use methods to reuse the same code over 'n over?//

        //METHOD EXAMPLE//
        multiply(12, 13);
        multiply(50, 45);
    }

    //Let's make a method//
    public static void multiply (int a, int b){
        System.out.println(a * b);
    }

    //You can also use this for other operations.//
    public static void divide (int a, int b){
        System.out.println(a / b);
    }
    
}
