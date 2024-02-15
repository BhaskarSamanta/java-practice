class employee{ // creating the employee class
    String name;    //declearing two global class variable
    double basicpay;


    public employee(){ // default constructor
        
        this.name=name;
        this.basicpay=basicpay;
    } 
    
    
    public employee(String name, double basicpay){
        this.name=name;
        this.basicpay=basicpay;
    }




    public employee(employee e){ // constructor with object as parameter
        this.name=e.name;
        this.basicpay=e.basicpay;
        
    }
    

    

    public void calculate(){    // function to calculate the required fields   
        double DA=0.3*basicpay;
        double HRA = 0.12 * basicpay;
        double gross = DA+HRA+basicpay;
        

        if(gross>=50000){ // returning the details whose gross is more than 50000
        System.out.println("name:"+name);
        System.out.println("basic salary:"+basicpay);
        System.out.println("da:"+DA);
        System.out.println("hra:"+HRA);
        System.out.println("gross"+gross);
        System.out.println();
        }   

    }
    
}

 
public class hra { // main class
    public static void main(String[] args) {
        

        employee e = new employee("bhaskar",500000);
        employee e2 = new employee("aritra",550000);
        employee e3 = new employee("swetty ritwika",70);
        employee e5 = new employee("jali ankita", 5000000);
        e.calculate();
        e2.calculate();
        e3.calculate();
        // e5.calculate();
        employee e4 = new employee(e5); // calling the copy constructor

        e4.calculate();
    }
}