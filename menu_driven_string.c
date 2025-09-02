#include<stdio.h>
#include<string.h>
char arr[50];
 
int len(char arr[]){
    int num=0;
    for(int i=0;arr[i]!='\0';i++){
     num++;
    }
    return num;
}
void substring(int fr,int to){
    char sub[100];
    int j=0;

    for(int i=fr;i<to && arr[i] !='\0';i++){
        sub[j++]=arr[i];
    }
    sub[j]='\0';
    printf(sub[j]);
}

char rev(char arr[],int leng){
    int leng=strlen(arr);
    for(int i=leng-1;i>=0;i--){
        printf("%c",arr[i]);
    }
    printf("\n");

}
int main(){
     
    int n;
    int fr,to;
    printf("Enter input string: ");
    fgets(arr,sizeof(arr),stdin);
    printf("Enter any of the 3 choice:");
    printf("1. Length of the input string");
    printf("2. return substring of a string");
    printf("3. reverse the string");
    printf("Enter a choice :");
    scanf("%d",&n);
    
    switch(n){
    case 1:
       printf("Length of the input string is : %d",len(arr));
       break;
    case 2:
       printf("Enter the Start location of the substring : ");
       scanf("%d",&fr);
       printf("Enter the End location for the substring : ");
       scanf("%d",&to);
       printf("Substring of the input string is :");
       substring(fr,to);
       break;
    case 3:
       printf("Reverse of the string is : ");
       rev(arr,to);
       break;
    }

    return 0;
}