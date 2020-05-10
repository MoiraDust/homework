package week5_2;

import java.util.Scanner;

public class exercise2 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println();
            System.out.println("surname: ");
            String surNmae=scan.next();
            String sn=surNmae.toUpperCase();
            System.out.println("first Name: ");
            String firstName=scan.next();
            String fn=firstName.toUpperCase();
            System.out.println("birthday:(dd-mm-year)");
            String birth=scan.next();
            String day=birth.substring(0,2);
            String month=birth.substring(3,5);
            String year=birth.substring(6,10);
            System.out.println(fn+" "+sn+" was born on "+" "+day+" "+month+" "+year);
        }
    }
