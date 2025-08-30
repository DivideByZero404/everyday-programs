import java.util.Scanner;
class checkname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] names = {
            {"alice", "bob", "charlie"},
            {"david", "eva", "frank"},
            {"george", "hannah", "ivy"}
        };
        
        System.out.print("Enter a Name:");
        String str=sc.nextLine();
        boolean flag=false;
        
        for(int i=0;i<names.length;i++){
            for(int j=0;j<names[i].length;j++){
                if(str.equals(names)){
                    flag=true;
                    break;
                }
            }
        }
        
        if(flag){
            System.out.println("Yes, the name exists in the array");
        }
        else{
            System.out.println("No, the name does not exist in the array");
        }
    }
}