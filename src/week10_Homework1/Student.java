package week10_Homework1;

public class Student extends Person {
    String major;
    public Student(){
    }

    public Student(String name, String birthday, String major){
        super(name,birthday);
        this.major = major;
    }

    @Override
    public String toString(){
        return super.toString() + " "+ major;
    }
}
