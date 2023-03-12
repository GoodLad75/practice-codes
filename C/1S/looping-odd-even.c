#include <stdio.h>

int main()
{
    int i,j;
    
    printf("\nEven Numbers.\n");
    for (i = 0; i < 100; i+=2) {
        printf("\n%d", i);
    }
    
    printf("\n\nOdd Numbers.\n");
    for (j = 0; j < 100; j++) {
        if (j%2 !=0){
            printf("\n%d", j);
        }
    }

    return 0;
}
