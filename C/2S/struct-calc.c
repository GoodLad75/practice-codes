#include <stdio.h>

typedef struct Variables {
    float n1;
    float n2;
    float result;
} number;

int main() {
    number i;
    printf("Enter a number: ");
    scanf("%f", &i.n1);
    printf("Enter a number: ");
    scanf("%f", &i.n2);

    i.result = i.n1 + i.n2;
    printf("Sum is %.2f\n", i.result);

}