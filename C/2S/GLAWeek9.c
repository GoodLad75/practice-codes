// Lewis, Paolo || Bernardino, Carol || Tabios, Roland || Capitly, Mariella || Ibanez, Ronalyn
// CCIS2A
#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 10

float stack[MAX_SIZE];
int top = -1;
int choice; 

void PushOperation(float element) {
    if (top == MAX_SIZE - 1) {
        printf("Stack Overflow\n");
        return;
    }
    top++;
    stack[top] = element;
}

void DisplayStackElements() {
    if (top == 1) {
        printf("Stack is empty\n");
        return;
    }
    printf("Elements in stack are:\n");
    int j=1;
    for (int i = top; i >= 0; i--) {
        printf("Element [%d] %.2f\n", j, stack[i]);
        j++;
    }
}

void PopOperation() {
    if (top == -1) {
        printf("Stack Underflow\n");
        return;
    }
    printf("Popped element is %.2f\n", stack[top]);
    top--;
}

void PeekHighest() {
    if (top == -1) {
        printf("Stack is empty\n");
        return;
    }
    float highest = stack[0];
    for (int i = 1; i <= top; i++) {
        if (stack[i] > highest) {
            highest = stack[i];
        }
    }
    printf("Highest element in stack is %.2f\n", highest);
}

void PeekLowest() {
    if (top == -1) {
        printf("Stack is empty\n");
        return;
    }
    float lowest = stack[0];
    for (int i = 1; i <= top; i++) {
        if (stack[i] < lowest) {
            lowest = stack[i];
        }
    }
    printf("Lowest element in stack is %.2f\n", lowest);
}

int main() {
    float element;
    do
    {
        printf("Midterm Case Study\n\n");
        printf("Select an operation:\n");

        printf("[1] Insert elements.\n");
        printf("[2] Display elements.\n");
        printf("[3] Remove an element.\n");
        printf("[4] Display highest value.\n");
        printf("[5] Display lowest value.\n");
        printf("[6] Exit.\n");

        
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1: 
            for (int i=0; i<MAX_SIZE; i++){
                printf("Enter element #%d: ", i+1);
                scanf("%f", &element);
                PushOperation(element);
            }   
            break;
        case 2:
            DisplayStackElements();
            break;
        case 3:
            PopOperation();
            break;
        case 4:
            PeekHighest();
            break;
        case 5:
            PeekLowest();
            break;
        default:
            printf("Program terminated.");
            break;
        }

    } while (choice  >= 1 && choice <= 5);
}