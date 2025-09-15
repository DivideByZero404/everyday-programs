import java.util.Scanner;
 class Matrix{
     int rows;
     int cols;
     int[][] mat;
     
     Matrix(){
         this.rows=0;
         this.cols=0;
         this.mat=new int[0][0];
     }
     
     Matrix(int row,int col){
         this.rows=row;
         this.cols=col;
         mat=new int[rows][cols];
     }
     
     Matrix(Matrix m){
         this.rows=m.rows;
         this.cols=m.cols;
         mat=new int[rows][cols];
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 this.mat[i][j]=m.mat[i][j];
             }
         }
     }
     
     void input_matrix(Scanner sc){
         System.out.println("Enter elements to the Matrix : ");
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 mat[i][j]=sc.nextInt();
             }
         }
     }
     
     void display(){
      for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println("");
         }
     }
     
     Matrix add(Matrix a){
         Matrix res=new Matrix(rows,cols);
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 res.mat[i][j]=this.mat[i][j]+a.mat[i][j];
             }
         }
         return res;
     }
     
     Matrix sub(Matrix s){
          Matrix res1=new Matrix(rows,cols);
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 res1.mat[i][j]=this.mat[i][j]-s.mat[i][j];
             }
         }
         return res1;
     }
        
     Matrix transpose(){
         Matrix t=new Matrix(rows,cols);
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 t.mat[j][i]=this.mat[i][j];
             }
         }
         return t;
     }
     
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows and cols of Matrix 1 : ");
    int r1=sc.nextInt(),c1=sc.nextInt();
    Matrix A=new Matrix(r1,c1);
    A.input_matrix(sc);
    
    System.out.println("Enter rows and cols of Matrix 2 : ");
    int r2=sc.nextInt(),c2=sc.nextInt();
    Matrix B=new Matrix(r2,c2);
    B.input_matrix(sc);
    
    System.out.println("Matrix 1 : ");
    A.display();
    
    System.out.println("Matrix 2 : ");
    B.display();
    
    Matrix C=new Matrix(A);
    System.out.println("Matrix C (copied from Matrix A) : ");
    C.display();
    
    Matrix sum=A.add(B);
    System.out.println("Matrix A + B : ");
    sum.display();
    
    Matrix subt=A.sub(B);
    System.out.println("Matrix A - B : ");
    subt.display();
    
    Matrix tran=A.transpose();
    System.out.println("Transpose of Matrix A : ");
    tran.display();
    
    
}
     
     }
