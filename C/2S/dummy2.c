#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};
void insertAtEnd(struct Node **head_ref, int new_data)
{
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node));
    struct Node *last = *head_ref;
    new_node->data = new_data;
    new_node->next = NULL;
    if (*head_ref == NULL)
    {
        *head_ref = new_node;
        return;
    }
    while (last->next != NULL)
        last = last->next;
    last->next = new_node;
    return;
}
void deleteNode(struct Node **head_ref, int key)
{
    struct Node *temp = *head_ref, *prev;
    if (temp != NULL && temp->data == key)
    {
        *head_ref = temp->next;
        free(temp);
        return;
    }
    while (temp != NULL && temp->data != key)
    {
        prev = temp;
        temp = temp->next;
    }
    if (temp == NULL)
    {
        printf("The node value is not found!\n");
        return;
    }
    prev->next = temp->next;
    free(temp);
}
int searchNode(struct Node **head_ref, int key)
{
    struct Node *current = *head_ref;
    while (current != NULL)
    {
        if (current->data == key)
            return 1;
        current = current->next;
    }
    return 0;
}
void printList(struct Node *node)
{
    while (node != NULL)
    {
        printf(" %d ", node->data);
        node = node->next;
    }
}
// Test the functions in the main()
int main()
{
    struct Node *head = NULL;
    int n = 0, val = 0, ch = 0;
    printf("Enter a number of nodes to be created: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        printf("Enter node value: ");
        scanf("%d", &val);
        insertAtEnd(&head, val);
    }
    printf("Linked list: ");
    printList(head);
    printf("\nLinked List Operations: [1] Insert [2] Search [3] Delete\nEnter your choice: ");
    scanf("%d", &ch);
    switch (ch)
    {
    case 1:
        printf("Insert a value to be added: ");
        scanf("%d", &val);
        insertAtEnd(&head, val);
        printf("Updated Linked list: ");
        printList(head);
        break;
    case 2:
        printf("Insert a value to be searched: ");
        scanf("%d", &val);
        if (searchNode(&head, val))
            printf("The value inputted is in the linked list.");
        else

            printf("The value inputted is not in the linked list.");

        break;
    case 3:
        printf("Insert a value to be deleted: ");
        scanf("%d", &val);
        deleteNode(&head, val);
        printf("Updated Linked list: ");
        printList(head);
        break;
    default:
        printf("The choices are 1, 2, or 3. You have entered an invalid operation choice.");
        break;
    }
    return 0;
}