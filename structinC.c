#include <stdio.h>

struct Student {
    char name[20];
    int rollno;
    float marks;
};

int main() {
    int n;
     
    printf("Enter number of records you want to insert : ");
    scanf("%d",&n);
    struct Student student[n];
    for(int i=0;i<n;i++){
        printf("Enter student Name : ");
        scanf("%s",student[i].name);
        printf("Enter Student Roll No. : ");
        scanf("%d",&student[i].rollno);
        printf("Enter Student Total Marks : ");
        scanf("%f",&student[i].marks);
        printf("\n");
    }
     
    printf("Student Structure : \n");
    for(int i=0;i<n;i++){
        printf("[Name, Roll No., Marks] = [%s, %d, %.2f]\n",student[i].name,student[i].rollno,student[i].marks);
    }

    return 0;
}