/* basic unit converter program in c.
   accepting user input in feet, converting it to meter, centimeter, and inches.
   we will be using float to accomodate larger and decimal numbers.
*/

#include <stdio.h>
int main(){
    // Declaration of variables.
    float userInput_ft;
    float meter = 3.281; float inch = 12; float cm = 30.48;
    float ft_m, ft_in, ft_cm; 

    // Accepting user input.
    printf("Enter measurement in feet: ");
    scanf("%f", &userInput_ft);

    // Processing data gathered.
    ft_m = userInput_ft / meter;
    ft_in = userInput_ft * inch;
    ft_cm = userInput_ft * cm;

    /* or alternatively
    
    ft_m = userInput_ft / 3.281;
    ft_in = userInput_ft * 12;
    ft_cm = userInput_ft * 30.48;

    */

   // Printing results.
   printf("\nMeasurement in feet: %.2f", userInput_ft);
   printf("\nMeasurement in meter: %.2f", ft_m);
   printf("\nMeasurement in inch: %.2f", ft_in);
   printf("\nMeasurement in centimeter: %.2f", ft_cm);

   /* Most problems in their core can be solved using IPO (Input, Process, Output)
   Input (gathering data), Process (performing operations. processing data provided),
   Output (the program provides the result the user needs.)

   Asides from making sure the code works, programmers also need to make sure that
   the code they've written is readable. (this incl. writing comments, proper naming of vars)

   good luck, and happy coding / programming! feel free to ask questions always. */

}