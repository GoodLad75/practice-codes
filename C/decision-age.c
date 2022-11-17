#include <stdio.h>
//Basic if else statement
int main(){

    int age;
    printf("Enter your age: ");
    scanf("%d", &age);

    if(age >= 21){
        printf("you can buy beer!");
    }
    else if (age < 10){
        printf("why not buy some milk?");
    }
    else if (age == 15){
        printf("have you tried vaping?");
    }
    else{
        printf("go home!");
    }

    return 0;
}
