import java.util.Scanner;
class prime_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start limit:");
        int a=sc.nextInt();
        System.out.print("Enter stop limit:");
        int b=sc.nextInt();
        for(int i=a;i<b;i++){
            boolean prime=true;
            if(i<=1){
                continue;
            }
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                prime=false;
            }
        }

        if(prime){
    
        System.out.println(i);
        }
        }
    }
}