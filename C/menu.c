#include <stdio.h>

int main(void){
int food=0, food_order,food_qty,food_price;
int drink=0, drink_order,drink_qty,drink_price,amtdue,bottom_price;
char response,bottomless;
do {
    printf("------Main Menu------\n");
    printf("[1] Pork Adobo Php 55\n[2] Menudo Php60\n[3] Honey Chicken Php48\n[4] Fish Filet Php50\n");

    printf("------Drinks-------\n");
    printf("[1] Orange juice Php30\n[2] Ice Tea Php25\n[3] Coke Php25\n\nBottomless - Additional Php10\n\n");  

    printf("Hello, I am Jenny can i have your order?\n");
    
    printf("Enter item number for food order: ");
    scanf("%d", &food_order);
    printf("Enter quantity: ");
    scanf("%d", &food_qty);

    if (food_order == 1) {
        food_price = 55;
    }
    if (food_order == 2) {
        food_price = 60;
    }
    if (food_order == 3) {
        food_price = 48;
    }
    if (food_order == 4) {
        food_price = 50;
    }

    food = food_price * food_qty;

    printf("Enter item number for drink order: ");
    scanf("%d", &drink_order);
    printf("Enter quantity: ");
    scanf("%d", &drink_qty);

    if (food_order == 1) {
        drink_price = 30;
    }
    if (food_order == 2) {
        drink_price = 25;
    }
    if (food_order == 3) {
        drink_price = 25;
    }

    printf("would you like to avail our bottomless drink? (Y/N)");
    scanf(" %c", &bottomless);

    if (bottomless == 'y' || bottomless == 'Y'){
        bottom_price = 10;
    }

    drink = (drink_price + bottom_price) * drink_qty;
    amtdue = food + drink;

    printf("\n\nTotal Price for food: PHP%d\n", food);
    printf("Total Price for drinks: PHP%d\n", drink);
    printf("Total Amount Due: PHP%d\n\n", amtdue);

    printf("Would you like to order again? (Y/N)");
    scanf(" %c", &response);
    
} while (response =='y' || response == 'Y');

}