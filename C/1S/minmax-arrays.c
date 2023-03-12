#include <stdio.h>

int main(void){

    int player; int scores[50];
    
    printf("Enter the number of players: ");
    scanf("%d", &player);

    //accepting input
    for (int i=0; i<player; ++i){
        printf("Goals score by player #%d: ",i + 1);
        scanf("%d", &scores[i]);
    }
    //finding largest element & assigning it index 0
    for (int i = 1; i < player; ++i) {
        if (scores[0] < scores[i]) {
            scores[0] = scores[i];
        }
    }
    //output statement
    if (scores[0] < 10){
        printf("Okay, fine, it's Messi");
    }
    else{
        printf("Not Messi");
    }
}