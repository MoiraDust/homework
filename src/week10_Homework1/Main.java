package week10_Homework1;

public class Main {
    public static void main(String[] args) {
        Person testPerson = new Person("Alice","08081996");
        System.out.println(testPerson.toString());
        Person testStudent = new Student("Bob","03032001","Marketing");
        System.out.println(testStudent.toString());
        Person testInstructor = new Instructor("Cater","03032001",3000);
        System.out.println(testInstructor.toString());
    }
}
