#include <stdio.h>

int main(void){

    int n=0,ctr=0,num; 
    printf("Enter n: ");
    scanf("%d", &n);

    int rating[n];
    printf("Enter elements:\n");
    for (int i=0; i<n; ++i){
        scanf("%d", &rating[i]);    
    }
    
    printf("Enter y: ");
    scanf("%d", &num);

    for (int j=0; j<=n; j++){
        // printf("%d\n",rating[j]);
        
        if (num == rating[j]){
            ctr = ctr +=1;
        }
    }
    
    printf("Frequency: %d",ctr);
}