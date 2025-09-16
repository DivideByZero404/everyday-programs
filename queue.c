#include<stdio.h>
#define MAX 5

int queue[MAX];
int front=-1,rear=-1,n;

void enqueue(int n){
    if(front==MAX-1){
        printf("\nQueue Overflowed");
    }
    else{
        if(front==-1) front=0;
        queue[++rear]=n;
        printf("\nElement %d added to Queue",n);
    }
}

void dequeue(){
    if(front==-1 || front>rear){
        printf("\nQueue Underflowed");
    }
    else{
        printf("\nElement %d removed from queue",queue[front]);
        front++;
    }
}

void peek(){
    if(front==-1 || front>rear){
        printf("\nQueue Underflowed");
    }
    else{
        printf("Top Element is %d ",queue[front]);
    }
}

void display(){
        if(front==-1 || front>rear){
        printf("\nQueue Underflowed");
    }
      else{
          printf("\nThe Queue : ");
          for(int i=front;i<=rear;i++){
              printf("\n%d\n",queue[i]);
          }
          printf("\n");
      }
}

int main() {
    int n, val;
    while (1) {
        printf("\n SELECT FROM MENU \n");
        printf("1. Enqueue (Insert)\n");
        printf("2. Dequeue (Delete)\n");
        printf("3. Peek (Front element)\n");
        printf("4. Display Queue\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &n);

        switch (n) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &val);
                enqueue(val);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Exiting program\n");
                return 0;
            default:
                printf("Invalid choice! Try again\n");
        }
    }
}