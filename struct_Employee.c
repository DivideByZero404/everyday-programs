#include <stdio.h>
#include <stdbool.h>  

struct Employee {
    int id;                
    char name[30];         
    float salary;          
    double experience;     
    bool isPermanent;      
};

int main() {
    int n;

    printf("Enter number of employees: ");
    scanf("%d", &n);

    struct Employee emp[n];     
    struct Employee *ptr = emp; 

 
    for (int i = 0; i < n; i++) {
        printf("\nEnter details for Employee %d:\n", i + 1);
        printf("ID: ");
        scanf("%d", &(ptr + i)->id);

        printf("Name: ");
        scanf("%s", (ptr + i)->name);

        printf("Salary: ");
        scanf("%f", &(ptr + i)->salary);

        printf("Experience (in years): ");
        scanf("%lf", &(ptr + i)->experience);

        printf("Is Permanent? (1 = Yes, 0 = No): ");
        scanf("%d", &(ptr + i)->isPermanent);

 
        if ((ptr + i)->isPermanent) {
            (ptr + i)->salary += (ptr + i)->salary * 0.10;
        printf("10%% Increment (if permanent) = %.2f  ",(ptr+i)->salary);

        }
    
    }

    float maxSalary = ptr->salary;
    int maxSalaryIndex = 0;
    for (int i = 1; i < n; i++) {
        if ((ptr + i)->salary > maxSalary) {
            maxSalary = (ptr + i)->salary;
            maxSalaryIndex = i;
        }
        
    }

    double maxExp = ptr->experience;
    int maxExpIndex = 0;
    for (int i = 1; i < n; i++) {
        if ((ptr + i)->experience > maxExp) {
            maxExp = (ptr + i)->experience;
            maxExpIndex = i;
        }
    }

 
    printf("\n\nAll Employee Details:\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t %s\t %.2f\t%.1lf\t%s\n",
               (ptr + i)->id,
               (ptr + i)->name,
               (ptr + i)->salary,
               (ptr + i)->experience,
               (ptr + i)->isPermanent ? "Permanent" : "Temporary");
    }

    printf("\nEmployee with Highest Salary: %s (%.2f)\n",
           (ptr + maxSalaryIndex)->name, maxSalary);

    printf("Employee with Most Experience: %s (%.1lf years)\n",
           (ptr + maxExpIndex)->name, maxExp);

    return 0;
}
