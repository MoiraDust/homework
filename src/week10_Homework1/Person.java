package week10_Homework1;


public class Person {
    String name;
    String birthday;
    public Person(){

    }

    public Person(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return name + " " + birthday;
    }



}
