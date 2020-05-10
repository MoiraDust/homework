package week7_03;

import java.util.ArrayList;
import java.util.Collections;

public class ContactList{
    public static ArrayList<Contact> list = new ArrayList<Contact>();

    public void addContact(Contact myContact){
        list.add(myContact);
    }
    public boolean removeContact(int myStudentId){
        for(Contact temp : list)
            if(temp.getStudentId() == myStudentId){
                list.remove(temp);
                return true;
        }
        return false;
    }
    public double searchScore(int myCourseId,int myStudentId){
        double grade = 0.0;
        for(Contact temp : list)
            if(temp.getCourseId() == myCourseId && temp.getStudentId() == myStudentId)
                grade = temp.getScore();
            return grade;
    }

    public void sortList(){
        Collections.sort(list);
        for(Contact c: list){
            System.out.println(c);
        }
    }

}
