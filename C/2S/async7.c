#include <stdio.h>
#include <stdlib.h>

struct Node{
  float data;
  struct Node* next;
};

int TotalNodes() {
    //get from the user a number of nodes to be created in the linked list and return the number inputted;
    int node_num;
    printf("Enter the number of nodes to be created: ");
    scanf("%d", &node_num);
    return node_num;
}

void AddANode(struct Node** head_ref) {
    /*allow the user to a node in the linked list. The first node inputted will be the head of the linked list,
    while the tail will be the last node inputted;*/

    float val;
    printf("Enter the data for the node: ");
    scanf("%f", &val);
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
    new_node->data = val;
    new_node->next = *head_ref;
    *head_ref = new_node;
    printf("Node added successfully!\n");
}

void DisplayNodes(struct Node *node) {
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

    if (choice = 1) {
        TotalNodes();
    }
    else if (choice = 2) {
        AddANode();
    }
    else if (choice = 3) {
        DisplayNodes(head);
    }
    else if (choice = 4) {
        InsertInPosition();
    }
    else if (choice = 5) {
        printf("Program terminated.");
    }
    else {
        printf("Please enter a valid option.");
    }
    
    return 0;
}