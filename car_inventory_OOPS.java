class car{
    String name;
    String company;
    int price;
    static String msg="KK Car showroom welcomes you!!";
    
    car(String n,String c,int pr){
        name=n;
        company=c;
        price=pr;
    }
    
    static void show(){
        
        System.out.println(msg);
        System.out.println("\nCar Inventory Details : \n");
    }
    void display(){
        System.out.println("Model Name   : "+name);
        System.out.println("Company Name : "+company);
        System.out.println("Car Price    : Rs."+price);
        System.out.println();
    }
    public static void main(String[] args){
        car[] arr=new car[3];
        arr[0]=new car("Swift","Maruti Suzuki",650000);
        arr[1]=new car("Creta","Hyundai",1100000);
        arr[2]=new car("Nexon EV","Tata Motors",1400000);
        car.show();
        for(int i=0;i<arr.length;i++){
            arr[i].display();
        }
        
    }
}
