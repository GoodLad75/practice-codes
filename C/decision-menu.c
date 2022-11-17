#include <stdio.h>
//DO WHILE LOOP

int main(void)
{
    
    int food, foodchoice, drink, drinkchoice, f_quantity=1, d_quantity=1, foodorder=0, drinkorder=0;
    int total;
    char result, loop_repeat;
    
    do
    {
        printf("\nWelcome to Zoidberg's Pizzeria!");
        printf("\nPlease choose your order.\n");
        
        //FOOD MENU
        printf("\n[1] $10 Special Trash Burger");
        printf("\n[2] $5 One Day Old Salad\n");
        printf("\nEnter your choice: ");
        scanf("%d", &foodchoice);

        if (foodchoice = 1) food = 10; //SETTING PRICE
        else if (foodchoice = 2) food = 5;

        printf("Enter quantity: "); //SETTING QUANTITY
        scanf("%d", &f_quantity);
        foodorder = food * f_quantity;

        printf("\nWould you like a drink? (Y/N)");
        scanf(" %c", &result);

        //DRINK MENU
        if (result == 'y'){
            printf("\nDrink Menu\n");
            printf("\nPlease choose your order.\n");
            printf("\n[1] $4 Bender's Beer");
            printf("\n[2] $5 Slurm");

            printf("\n\nEnter your choice: ");
            scanf("%d", &drinkchoice);

            if (drinkchoice = 1) drink = 4; //SETTING PRICE
            else if (drinkchoice = 2) drink = 5; 

            printf("Enter quantity: "); //SETTING QUANTITY
            scanf("%d", &d_quantity);
            drinkorder = drink * d_quantity;
        }
        else {
            printf("Proceeding to checkout...");
        }

        printf("\nOrder Summary");
        printf("\nFood Price: $%d", foodorder);
        printf("\nDrink Price: $%d", drinkorder);
        printf("\nTotal: $%d", total = foodorder + drinkorder);

        printf("\nWould you like to order again? (Y/N)"); // SETTING CONDITION FOR LOOP
        scanf(" %c", &loop_repeat);

    } while (loop_repeat == 'y');
    
    return 0;
}
