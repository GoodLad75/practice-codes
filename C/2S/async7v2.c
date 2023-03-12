#include <stdio.h>
#include <stdlib.h>

struct Node{
  float data;
  struct Node* next;
};

int TotalNodes() {
    //get from the user a number of nodes to be created in the linked list and return the number inputted;

}

void AddANode() {
    /*allow the user to a node in the linked list. The first node inputted will be the head of the linked list,
    while the tail will be the last node inputted;*/

}

void DisplayNodes(struct Node* node) {
    //will access and print the node address and the data element of each node in the linked list from the head to the tail.
    printf("The linked list is:\n");
    while (node != NULL) {
        printf("%p: %c\n", node, node->data);
        node = node->next;
    }
}

void InsertInPosition() {
    /*will access the linked list from the head to the tail and insert a new node given the position.
    Provide a notification message inputted position is found in the linked list.*/
}


int main() {

    int choice; 

    printf("Linked lists operations: [1] Set Nodes  [2] Add Nodes   [3] Display Nodes   [4] Insert  [5] Exit\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
    case 1:
        printf("111");
        break;
    case 2:
        printf("222");
        break;
    case 3:
        printf("333");
        break;
    case 4:
        printf("444");
        break;
    case 5:
        printf("Program terminated.");
        break;
    
    default:
        break;
    }

    return 0;
}