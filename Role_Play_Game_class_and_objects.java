class game{
     String name;
     int health;
     int strength;
     int level;
     static int total=0;
     
     game(String n,int h,int s,int l){
         name=n;
         health=h;
         strength=s;
         level=l;
         total++;
     }
     static void total_num(){
         
         System.out.println("\nTotal number of characters : "+total);
     }
     void show(){
         System.out.println("\nCharacter Name   : "+name);
         System.out.println("\nHealth             : "+health);
         System.out.println("Strength           : "+strength);
         System.out.println("Level              : "+level);
     }
     public static void main(String[] args){
         game[] arr=new game[3];
         arr[0]=new game("Bunny",89,50,12);
         arr[1]=new game("King",77,90,44);
         arr[2]=new game("Cat",12,96,78);
        System.out.println("\n------- A FABLE -------");

         for(int i=0;i<arr.length;i++){
             arr[i].show();
         }
         game.total_num();
     }
 }





