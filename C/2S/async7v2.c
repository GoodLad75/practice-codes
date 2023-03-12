#include <stdio.h>
#include <stdlib.h>

struct Node{
  char data;
  struct Node* next;
};

int node_ctr;

int TotalNodes() {
    //get from the user a number of nodes to be created in the linked list and return the number inputted;
    printf("Enter total number of nodes to be added: ");
    scanf("%d", &node_ctr);
    printf("\nTotal number of nodes to be added: %d", node_ctr);
    return node_ctr;

}

void AddANode(struct Node** head_ref) {
    /*allow the user to a node in the linked list. The first node inputted will be the head of the linked list,
    while the tail will be the last node inputted;*/

    int num = node_ctr;
    char val;


    for (int i = 0; i < num; i++) {
        printf("\nEnter a character: ");
        scanf(" %c", &val);

        struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
        new_node->data = val;
        new_node->next = *head_ref;
        *head_ref = new_node;
        printf("Node added successfully!\n");

    }

}

void DisplayNodes(struct Node* node) {
    printf("\n");
    int i = 1;
    while (node != NULL) {
        printf("[%d] Node: %p: %c\n", i, node, node->data);
        node = node->next;
        i++;
    }
}

void InsertInPosition(struct Node** head_ref, int position) {
    /*will access the linked list from the head to the tail and insert a new node given the position.
    Provide a notification message inputted position is found in the linked list.*/

    char val;
    printf("Enter the data for the node: ");
    scanf(" %c", &val);
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
    new_node->data = val;
    new_node->next = NULL;

    if (position == 1) {
        new_node->next = *head_ref;
        *head_ref = new_node;
        printf("Node added successfully!\n");
        return;
    }

    struct Node *current = *head_ref;
    int i;
    for (i = 1; i < position - 1 && current != NULL; i++) {
        current = current->next;
    }

    if (current == NULL) {
        printf("Invalid position!\n");
    }
    
    else {
        new_node->next = current->next;
        current->next = new_node;
        printf("Node added successfully!\n");
    }
}


int main() {

    struct Node* head = NULL;

    int choice;
    int amt_nodes, option, position;

    do
    {
        printf("\n");
        printf("Linked lists operations: [1] Set Nodes  [2] Add Nodes   [3] Display Nodes   [4] Insert  [5] Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("Set Nodes\n");
            TotalNodes();
            break;
        case 2:
            printf("Add Nodes\n");
            AddANode(&head);
            break;
        case 3:
            printf("Display Nodes\n");
            DisplayNodes(head);
            break;
        case 4:
            printf("Insert\n");
            InsertInPosition(&head, position);
            break;
        case 5:
            printf("Program terminated.\n");
            break;

        default:
            break;
        }

    } while (choice >= 1 && choice <= 4);
    

    return 0;
}