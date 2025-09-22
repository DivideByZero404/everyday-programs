class online{
    int prod_ID;
    String[] name=new String[20];
    int[] qty=new int[5];
    int[] price=new int[5];
    static int total=0;
    int count=0;
    
    online(int pid,String[] n,int[] q,int[] pr){
            prod_ID=pid;
            name=n;
            qty=q;
            price=pr; 
        
    }
    void details(){
            System.out.println("Product ID   : "+prod_ID);
         int sum=0;
        for(int i=0;i<name.length;i++){
            int prod=qty[i]*price[i];
            sum+=prod;
            
             System.out.println("\nProduct Name : "+name[i]);
            System.out.println("Quantity     : " + qty[i]);
            System.out.println("Price        : Rs." + price[i]);
            System.out.println("Total        : " + prod);
         }
       
       System.out.println("--------------------------");
        System.out.println("Bill Amount      : Rs."+sum);
        System.out.println("--------------------------\n");
        
        
    }
    public static void main(String[] args){
        
    online[] arr=new online[3];
    arr[0]=new online(345,new String[]{"Fan","Pen","Watch"},new int[]{3,5,1},new int[]{1000,10,500});
        
    arr[1]=new online(990,new String[]{"lipstick","blush"},new int[]{2,1},new int[]{700,670});
        
    arr[2]=new online(246,new String[]{"Charms","perfume","mirror","neon shades"},new int[]{50,1,2,3},new int[]{2,700,70,545});
    
        for(int i=0;i<arr.length;i++){
            arr[i].details();
        }
    }
}
