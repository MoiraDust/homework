package week5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input principle: ");
        double principle=scan.nextDouble();
        System.out.println("input interestRate: ");
        double interestRate=scan.nextDouble();
        System.out.println("input year: ");
        int year=scan.nextInt();
        double total=principle;
        double interest=0.0;
        int y=0;
        for(int i=0;i<year;i++){
            y=i+1;
            System.out.print("year"+y+" principle: $"+total+" ");
            interest=total*interestRate;
            total=total*(1+interestRate);
            System.out.println("Interest :$"+interest+" Total"+total);
        }
    }
}
