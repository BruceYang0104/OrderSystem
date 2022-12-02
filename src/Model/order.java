package Model;
public class order{
    
    //field
    private String name;
    private int tank;
    private int motorcycle;
    private int helicopter;
    private double sum;
    double pay;
    
    //constructors
    public order(String name, int tank, int motorcycle, int helicopter) {
        this.name = name;
        this.tank = tank;
        this.motorcycle = motorcycle;
        this.helicopter = helicopter;
       
        sum =tank*22000+motorcycle*5000+helicopter*14500;
        
    }
    
    public order(String name, int tank, int motorcycle, int helicopter,double pay) {
        this.name = name;
        this.tank = tank;
        this.motorcycle = motorcycle;
        this.helicopter = helicopter;
        this.pay=pay;
       
        sum =tank*22000+motorcycle*5000+helicopter*14500;
        
    }
    
    //method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(int rocket) {
        this.motorcycle = motorcycle;
    }

    public int getHelicopter() {
        return helicopter;
    }

    public void setHelicopter(int helicopter) {
        this.helicopter = helicopter;
    }

    public double getSum() {
        return sum;
    }
    
    public double getSum2() {
        return sum*0.95;
    }
    
    
    public double getTotal2() {
        return pay-(sum*0.95);
    }
    
    public double getTotal() {
        return pay-sum;
    }

    

    

    
    
    
    

   

    

   
    


}
