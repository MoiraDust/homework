package week10_Homework1;

public class Instructor extends Person{
    double salary;
    public Instructor() {
    }
    public Instructor(String name,String birthday, double salary){
        super(name,birthday);
        this.salary = salary;
    }
    @Override
    public String toString(){
        return super.toString() + " " + salary;
    }
}
