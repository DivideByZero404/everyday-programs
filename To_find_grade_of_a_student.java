import java.util.Scanner;

class avg_mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your subject marks out of 100: ");
        System.out.print("Maths = ");
        int a=sc.nextInt();
        System.out.print("English = ");
        int b=sc.nextInt();
        System.out.print("Science = ");
        int c=sc.nextInt();
        System.out.print("Social = ");
        int d=sc.nextInt();
        System.out.print("Tamil = ");
        int e=sc.nextInt();
        
        int sum=a+b+c+d+e;
        int avg=sum/5;
        
        System.out.println();
        System.out.println("Average = "+avg);
        System.out.println();

        if(avg>=90 && avg<=100){
            System.out.println("You got O Grade!");
        }
        else if(avg>=80 && avg <90){
             System.out.println("You got A Grade!");
        }
        else if(avg>=70 && avg <80){
            System.out.println("You got B Grade!");
        }
        else if(avg>=60 && avg <70){
             System.out.println("You got C Grade!");
        }
        else if(avg >=50 && avg<60){
                System.out.println("You Failed!");

        }
    } 
        
}