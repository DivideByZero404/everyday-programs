 #include<stdio.h>
#define MAX 5
int top=-1;
int stack[MAX];

void push(int val){
    if(top >= MAX-1){
        printf("Stack Overflow!");
    }
    else{
        stack[++top]=val;
        printf("\nelement %d pushed to the stack\n ",val);
    }
}

void pop(){
    if(top == -1){
        printf("Stack Underflow!\n");
    }
    else{
         ;
        printf("\nelement %d popped from the stack",stack[top--]);
    }
}

void peek(){
    if(top==-1){
        printf("Stack is empty!");
    }
    else{
        printf("\nTop element is : %d",stack[top]);
        
    }
}

void display(){
    if(top==-1){
printf("Stack is empty");
    }
    else{
        printf("\nStack (from top to Bottom) : ");
        for(int i=top;i>=0;i--){
            printf("%d\t",stack[i]);
        }
        printf("\n");
    }
}
int main(){
    int stack[MAX];
    int top=-1;
    int n;
    while(1){

    printf("\nSelect choice :\n");
    printf("1. Push(insert an element)\n");
    printf("2. Pop(Remove the top element)\n");
    printf("3. View Top Element\n");
    printf("4. Display Stack\n");
    printf("5. Exit\n");
    printf("Enter your choice : ");
    scanf("%d",&n);
    switch(n){
        
        case 1:
        printf("Enter an element to the Stack : ");
        scanf("%d",&n);
        push(n);
        break;
        
        case 2:
        pop();
        break;
        
        case 3:
        peek();
        break;
        
        case 4:
        display();
        break;
        
        case 5:
        printf("Exiting");
        return 0;
       
        default:
        printf("Invalid choice");
        break;
    }
    }
    return 0;
}
