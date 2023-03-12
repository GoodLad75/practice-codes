#include <stdio.h>

int main(void){

    int userInput,onesUser,tensUser;
    float fuserInput,tens;
    
    char* digit1[] = {"zero", "one", "two","three", "four", "five",
        "six", "seven", "eight", "nine", "ten", "eleven","twelve", "thirteen", 
        "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    char* digit2[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
        "seventy", "eighty", "ninety"};
    
    printf("Enter the number to be translated: ");
    scanf("%d", &userInput);

    if (userInput >= 0 && userInput <= 19) /* single - 19 numbers */
    {
        printf(digit1[userInput]);
    }
    
    else if (userInput >= 20 && userInput <= 99) /* 2 digit numbers */
    {
        /* we will separate the numbers from each other.*/
        fuserInput = userInput;
        
        /* get first number for index */
        tens = fuserInput * 0.1;
        tensUser = tens; /* tens */
        
        /* get second number for index */
        onesUser = userInput % 10; /* ones */

        printf(digit2[tensUser]);
        if (onesUser > 0){
            printf("-");
            printf(digit1[onesUser]);
        }
             
    }

}