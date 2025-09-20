class library{
    String title;
    String author;
    int price;
    boolean book_issued;
   static int total=0;
    
    library(String t,String a,int pr,boolean bk_issue){
        this.title=t;
        this.author=a;
        this.price=pr;
        this.book_issued=bk_issue;
        
        
        if(bk_issue){
            total++;
        }
    }
    
    void detail(){
       System.out.println("\nBook Title                  : "+title);
       System.out.println("Book Author                 : "+author);
       System.out.println("Book Price                  : "+price);
       System.out.println("Book Issued                 : "+(book_issued?"Yes" : "No"));
    }
       
       static void issue(){
       System.out.println("\nTotal number of books issued: "+total);
       
       
    }
    public static void main(String[] args){
        library[] arr=new library[3];
        arr[0]=new library("Twighlight","James paul",550,true);
        arr[1]=new library("Harry potter","J K Rowling",670,false);
        arr[2]=new library("Murder Mystery","Alice inez",890,true);
        for(int i=0;i<arr.length;i++){
            arr[i].detail();
        }
        library.issue();
    }
}
