import java.util.Scanner;

public class fiboinjava{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        
        int a=0,b=1;
        int osum=0,esum=0;
        
        for(int i=1;i<=n;i++){
            System.out.println(a+ " ");
            
            if(a%2==0){
                esum+=a;
            }
            if(a%2!=0){
                osum+=a;
            }
           int fib=a+b;
            a=b;
            b=fib;
        }
              
            System.out.println("Odd sum = "+osum);
            System.out.println("Even sum = "+esum);

            }
         }
        
        
    
