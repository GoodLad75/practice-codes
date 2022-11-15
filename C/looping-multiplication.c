#include <stdio.h>
//Multiplication Table
int main() {
  int i,userInput,multiple;
  
  printf("Enter a number 1-10   ");
  scanf("%d", &userInput);
  i = userInput;
  multiple = userInput;
  
  for (i; i <= 100; i+=multiple) {
    printf("%d\n", i);
  }
  
  return 0;
}
