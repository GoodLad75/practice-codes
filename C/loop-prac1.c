#include <stdio.h>

int main(void)
{
    int grade_ctr,grade,average=0,i;

    printf("How many grades will you be entering? ");
    scanf("%d", &grade_ctr);

    for (i = 0; i < grade_ctr; i++){
        printf("Enter your grade: ");
        scanf("%d", &grade);
        average += grade;
    }

    average /= grade_ctr;
    printf("\nFinal Average: %d", average);

    return 0;
}

