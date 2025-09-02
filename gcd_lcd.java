import java.util.Scanner;
class gcd_lcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers = ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        
        int gcd=1;
        int limit=Math.min(a,b);
        for(int i=1;i<=limit;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
            int lcd=(a*b)/gcd;
        
        System.out.println("GCD = "+gcd);
        System.out.println("LCD = "+lcd);
    }
}