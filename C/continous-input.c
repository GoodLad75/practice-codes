#include <stdio.h>

int main(void){

    int usr_input=0, sum=0;
    
    while (usr_input!=2000)
    {
        printf("Enter a value: ");
        scanf("%d", &usr_input);

        if (usr_input == -1){
            printf("Program was terminated, your total sales are: %d\n",sum);
            break;
        }

        sum = sum + usr_input;

        if (sum > 499 && sum < 999) {
            printf("You're off to a good start.\n");
            
        }
        else if (sum > 999 && sum < 1499) {
            printf("You're halfway there.\n");
            
        }
        else if (sum > 1499 && sum < 2000){
            printf("You're almost there.\n");
        }
        
    }

    printf("Congratulations! Your total sales are: %d", sum);
    
}
