package week7_03;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Contact stuA = new Contact("Alice",1001,01,60.0);
        Contact stuB = new Contact("Bob",1002,02,60.0);
        Contact stuC = new Contact("CC",1003);

        ContactList operation = new ContactList();

        operation.addContact(stuA);
        operation.addContact(stuB);
        operation.addContact(stuC);


        int searchStudentId = 1001;
        int searchCourseId = 01;
        double score = operation.searchScore(searchCourseId,searchStudentId);
        System.out.println(searchStudentId+" score: "+score);

        int removeId = 1001;
        boolean remove = operation.removeContact(removeId);
        if(remove){
            System.out.println("remove "+removeId+" success");
        }else{
            System.out.println("false");
        }

        operation.sortList();
    }
}
