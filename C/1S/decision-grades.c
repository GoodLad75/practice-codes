#include <stdio.h>
//Basic grade calculator
int main(void) {
    
    int prelim, midterm, finals,average;

    printf("Enter Prelim Grade: ");
    scanf("%d", &prelim);
    printf("Enter Midterm Grade: ");
    scanf("%d", &midterm);
    printf("Enter Finals Grade: ");
    scanf("%d", &finals);

    if (prelim > 0 && midterm > 0 && finals > 0) {
        if (prelim <= 100 && midterm <= 100 && finals <= 100){
            average = (prelim + midterm + finals) / 3;
            printf("Average: %d", average);
        }
        else{
           printf("You entered an invalid value."); 
        }
    }
    else {
        printf("You entered an invalid value.");
    }
    
    return 0;
}
