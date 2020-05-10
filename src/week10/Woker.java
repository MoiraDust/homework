package week10;

public class Woker {
    public double salary;
    protected String name;
    protected double salaryRate;

    public Woker(String name,double salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computepay(int hours){
        salary = hours * salaryRate * 5;
        return salary;
    }
    public String getName(){
        return name;
    }
}
