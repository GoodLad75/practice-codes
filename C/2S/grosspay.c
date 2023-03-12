//lEWIS, PAOLO || CCIS2A

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Employee {
    char emp_name[50];
    char position[50];
    
    double hr_rate;
    double hr_worked;
    double total_deductions;
    double gross_pay;
    double net_pay;
};

int main() {
    struct Employee emp, *ptr_emp;

    ptr_emp = &emp;

    printf("Enter employee name: ");
    fgets(emp.emp_name, 50, stdin);
    emp.emp_name[strcspn(emp.emp_name, "\n")] = '\0';

    printf("Enter employee position: ");
    fgets(emp.position, 50, stdin);
    emp.position[strcspn(emp.position, "\n")] = '\0';

    printf("Enter rate per hour: ");
    scanf("%lf", &emp.hr_rate);

    printf("Enter hours worked in a week: ");
    scanf("%lf", &emp.hr_worked);

    printf("Enter total deductions: ");
    scanf("%lf", &emp.total_deductions);

    emp.gross_pay = emp.hr_rate * emp.hr_worked;
    emp.net_pay = emp.gross_pay - emp.total_deductions;

    printf("\n\n");

    printf("Employee Name: %s\n", ptr_emp->emp_name);
    printf("Position: %s\n", ptr_emp->position);
    printf("Rate per hour: %.2f\n", ptr_emp->hr_rate);
    printf("Hours worked in a week: %.2f\n", ptr_emp->hr_worked);
    printf("Total deductions: %.2f\n", ptr_emp->total_deductions);
    printf("Gross week pay: %.2f\n", ptr_emp->gross_pay);
    printf("Net week pay: %.2f\n", ptr_emp->net_pay);

    return 0;
}