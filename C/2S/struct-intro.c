#include <stdio.h>
#include <string.h>

struct Person{
    char name[50];
    int age;
}p1, p2, p3;

typedef struct Student {
    int no;
    char n[50];
} stdDetails;


int main(){
    stdDetails s1;
    s1.no = 1001;
    strcpy(s1.n, "DSAAL CCIS2A");
    printf("Section: %s\n", s1.n);

    //struct Person s1, s2, s3,....;
    strcpy(p1.name, "Pia Castro");
    p1.age = 21;
    printf("Name: %s\n", p1.name);
    printf("Age: %d\n", p1.age);

    return 0;
}