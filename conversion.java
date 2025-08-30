import java.util.Scanner;
class diagonalsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of.rows:");
        int row=sc.nextInt();
        System.out.print("Enter no.of.columns:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
    
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr[i][j] +" ") ;
            }
            System.out.println();
        }
        
        int mindim=Math.min(row,col);
        int primary=0,secondary=0;
         for(int i=0;i<mindim;i++){
             primary+=arr[i][i];
             secondary+=arr[i][col-i-1];
         }
         int total=primary+secondary;
         
         if(row==col && row%2==1){
             total-=arr[row/2][col/2];
         }
         System.out.println("Primary diagonal sum = " + primary);
        System.out.println("Secondary diagonal sum = " + secondary);
        System.out.println("Total diagonal sum = " + total);

        
        sc.close();
    }
}