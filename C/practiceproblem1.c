/* Practice Problem 1
Pablo is an alcoholic and loves to drink Red Horse Beer. Beer bottles are scattered in Pablo's
house and he wanted to organize and store them properly to make room for his incoming order of
12 boxes of Pale Pilsen. Pablo decided to store his 87 Red Horse bottles in crates,
each crate can fit in 12 bottles.

Write a program that would let Pablo input the amount of
bottles he has and provide him with the number of crates he will need.

Answers hint. Crates needed = 7, Excess = 3  */


#include <stdio.h>
int main (void){

    // Initializing Variables
    int rhBottles, crateAmt, excessBottles;
    /*Since we will be dealing with whole numbers (since bottles cannot have a decimal point)
    int data type should suffice */

    // Accepting User Input
    printf("Enter the number of bottles: ");
    scanf("%i", &rhBottles); // Assigning user to input to variables

    // Process
    crateAmt = rhBottles / 12; // Getting the number of crates Pablo will need
    excessBottles = rhBottles % 12; // Will display if there are any excess bottles

    // Output
    printf("Amount of crates needed: %i", crateAmt);
    printf("\nExcess bottles: %i", excessBottles);



    return 0;
}