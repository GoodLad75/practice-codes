#include <stdio.h>


int main(void){

    int arr1[3][2] = {{2,1}, {2,4}, {2,7}};
    
    // for (int i = 0; i <= 2; i++) {
    //     for (int j = 0; j < 3; j++) {
    //         printf("val %d\n", arr1[i][j]);
    //     }
    // }

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            printf("val %d\n", arr1[i][j]);
        }
    }
}