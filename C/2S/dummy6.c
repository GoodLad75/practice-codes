#include <stdio.h>
#include <stdlib.h>
struct dnode{
    int data;
    struct dnode *p;
    struct dnode *n;
};

void print(struct dnode *h){
    int nodeNumber = 1;
    while(h != NULL){
        printf("Node %d", nodeNumber);
        printf("Previous address: %p\tData: %d\tNext address %p\n", h->p, h->data, h->n);
        h = h->n;
    }
};

int main(){

    struct dnode *h = NULL;
    struct dnode *a = NULL;
    struct dnode *b = NULL;
    struct dnode *c = NULL;
    struct dnode *d = NULL;
    

    b = (struct dnode*) (malloc(sizeof(struct dnode)));
    c = (struct dnode*) (malloc(sizeof(struct dnode)));
    d = (struct dnode*) (malloc(sizeof(struct dnode)));
    a = (struct dnode*) (malloc(sizeof(struct dnode)));
    
    a->data = 400;
    b->data = 300;
    c->data = 200;
    d->data = 100;
    
    //head node
    a->p = NULL;
    a->n = d;
    
    d->p = a;
    d->n = c;
    
    c->p = d;
    c->n = b;
    
    //tail node
    b->p = c;
    b->n = NULL;
    
    //a-> d -> c -> b
    h = a;
    print(h);


    return 0;
}