package week10;

public class HourlyWorker extends Woker {
    double salary;
    double extraSalary;

    public HourlyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computepay(int hours) {
        if(hours > 40){
            extraSalary = (hours - 40)*salaryRate*1.5;
            salary = salaryRate * 40 + extraSalary;
            return salary;
        }else {
            salary = hours * salaryRate;
            return  salary;
        }
    }
}
