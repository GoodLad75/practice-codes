#include <stdio.h>

int main(void) {
    float grade;
    printf("Enter grade: ");
    scanf("%f", &grade);

    if (grade > 74){printf("Accept.");}
    else if (grade > 50 && grade < 75) {printf("Floating.");}
    else if (grade < 51) {printf("Reject.");}
}