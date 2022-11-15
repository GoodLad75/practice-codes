#include <stdio.h>

int main(void) {

    float amount,cents;
    int totalamt, int_cents,
    thousands=0,five_hundreds=0,two_hundreds=0,hundreds=0,
    fifties=0,twenties=0,tens=0,fives=0,ones=0,cents25=0,cents1=0;
    
    printf("Enter the amount: ");
    scanf("%f", &amount);

    totalamt = amount; // convert float to integer
    cents = (amount - totalamt) * 100;
    int_cents = cents;


    //FOR WHOLE NO.//
    if (totalamt >= 1000){
        thousands = totalamt / 1000;
        totalamt = totalamt - (thousands * 1000);
    } 
    
    if (totalamt >= 500){
        five_hundreds = totalamt / 500;
        totalamt = totalamt - (five_hundreds * 500);
    }

    if (totalamt >= 200){
        two_hundreds = totalamt / 200;
        totalamt = totalamt - (two_hundreds * 200);
    }

    if (totalamt >= 100){
        hundreds = totalamt / 100;
        totalamt = totalamt - (hundreds * 100);
    }
    
    if (totalamt >= 50){
        fifties = totalamt / 50;
        totalamt = totalamt - (fifties * 50);
    }

    if (totalamt >= 20){
        twenties = totalamt / 20;
        totalamt = totalamt - (twenties * 20);
    }

    if (totalamt >= 10){
        fifties = totalamt / 10;
        totalamt = totalamt - (tens * 10);
    }

    if (totalamt >= 5){
        fives = totalamt / 5;
        totalamt = totalamt - (fives * 5);
    }

    if (totalamt >= 1){
        ones = totalamt / 1;
    }


    //FOR CENTS//
    if (cents >= 25){
        cents25 = cents / 25;
        cents = cents - (cents25 * 25);
    }
    
    if (cents >= 1){
        cents1 = cents / 1;
    }

    printf("\nTotal Amount: %d", totalamt);
    printf("\nThousands: %d", thousands);
    printf("\nFive Hundreds: %d", five_hundreds);
    printf("\nTwo Hundreds: %d", two_hundreds);
    printf("\nHundreds: %d", hundreds);
    printf("\nFifties: %d", fifties);
    printf("\nTwenties: %d", twenties);
    printf("\nTens: %d", tens);
    printf("\nFives: %d", fives);
    printf("\nOnes: %d", ones);
    printf("\n25 Cents: %.d", cents25);
    printf("\nOne Cents: %d", cents1);
    return 0;
}

/*

Logic for if statements:
1. Remove centavos from total amount.
2. Determine if amount is within the value range (1000, 500, etc.)
3. Perform division operation to get a single digit number to be used for counting.
    3.1 (e.g.)1000 / 1000 = 1, 2000 / 2000 = 2
4. Subtract the bills that were already counted from the total amount.
    4.1 Total Amount = Total Amount - (Type of bill * Value of bill)

        Assume that totalamt = 1000 
        thousands = totalamt / 1000; OUTPUT = 1
        totalamt = totalamt - (thousands * 1000); OUTPUT = 0, since 1000 - (1 * 1000) = 0
5. Print output.

How to separate cents
1. To accept decimal (since cents are represented as decimal) numbers use float.
2. Convert float into integer.
3. Perform subtraction operation between float and integer.
    Since integer only stores whole number, you should be left with the decimal numbers only.
4. Multiply the decimal numbers to 100, this will convert it into a whole number.
5. Convert float into integer again.

Assume that amount = 220.50 (float), and totalamt = amount (int)
Cents = (amount - totalamt) * 100
Cents = 220.50 - 220
Cents = .50
Cents = 50

*/
