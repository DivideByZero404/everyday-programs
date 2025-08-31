#include<stdio.h>
int comparetriplets(int a[],int b[],int size);

int main(){

int a[3],b[3];
     printf("Enter Alice's Points:\n");
     for(int i=0;i<3;i++){
         scanf("%d",&a[i]);
     }
     
      printf("Enter Bob's Points:\n");
     for(int i=0;i<3;i++){
         scanf("%d",&b[i]);
     }
     
     for(int i=0;i<3;i++){
         printf("%d\t",a[i]);
     }
     printf("\n");
     
     for(int i=0;i<3;i++){
     printf("%d\t",b[i]);
     }
  printf("\n");
     
     comparetriplets(a,b,3);
     return 0;
}
int comparetriplets(int a[], int b[],int size){
     int acount=0;
     int bcount=0;
     
     for(int i=0;i<3;i++){
         if(a[i]>b[i]) acount++;
         else if(a[i]<b[i]) bcount++;
     }
     printf("[Alice score, Bob score]:\t");
     printf("[ %d , %d ]",acount,bcount);
     
}