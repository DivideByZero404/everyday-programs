class employee{
    int empID;
    String name;
    double HR,DA;
    double basic_pay;
    
    employee(int e,String n,double hr,double da,double b_p){
        empID=e;
        name=n;
        HR=hr;
        DA=da;
        basic_pay=b_p;
        
    }
    void calculate(){
        double gross=basic_pay + (basic_pay*HR) + (basic_pay*DA);
        System.out.println("Employee ID : "+empID);
        System.out.println("Employee Name : "+name+"\n"+"Basic Pay : Rs."+basic_pay);
        System.out.println("Gross Salary = "+gross+"\n");
    }

public static void main(String[] args){
    employee[] arr=new employee[3];
    arr[0]=new employee(45,"Sreenithi",0.40,0.25,50500.00);
    arr[1]=new employee(76,"Raju",0.32,0.22,70900.00);
    arr[2]=new employee(89,"Devi",0.35,0.19,60000.00);
    
    for(int i=0;i<arr.length;i++){
        arr[i].calculate();
    }

}
}
