#include <stdio.h>
#include <stdlib.h>

struct node{
    float data;
    struct node *anext;
};

void print(struct node *l){
    while (l != NULL){
        printf("Node address: %p \t Data: %.2f \t Next: %p\n",l,l->data,l->anext);
        l = l->anext;
    }
}

int main(){
    struct node *h;
    struct node *f = NULL;
    struct node *s = NULL;
    struct node *t = NULL; 
    
    f = (struct node*) malloc(sizeof(struct node));
    s = (struct node*) malloc(sizeof(struct node));
    t = (struct node*) malloc(sizeof(struct node));

    printf("Enter the first number: ");
    scanf("%f", &f->data);
    printf("Enter the second number: ");
    scanf("%f", &s->data);
    printf("Enter the third number: ");
    scanf("%f", &t->data);


    // f->data = 150;
    // s->data = 200;
    // t->data = 300;

    f->anext = s;
    s->anext = t;
    t->anext = NULL;

    h = f;
    print(h);

}