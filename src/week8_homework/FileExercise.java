package week8_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileExercise {
    /*search*/
    public boolean searchMethod(String fileName,double x) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNextDouble()) {
            if (x == fileScanner.nextDouble())
                return true;
        }
        return false ;
    }
    /*add*/
    public void addValue(String fileName){
        File f = new File(fileName);
        PrintWriter out = null;
        try{
            out = new PrintWriter(f);
        }catch (FileNotFoundException e){
            System.out.println("File does not exisit");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        while(scan.hasNextDouble()){
            out.println(scan.nextDouble());
        }
        out.close();
        System.out.println("success");
    }
    /*sort*/
    public void sortMethod(String fileName,boolean bool) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner scan = new Scanner(f);
        ArrayList<Double> list = new ArrayList<>();
        while(scan.hasNextDouble()){
            list.add(scan.nextDouble());
        }
        if(bool){
            Collections.sort(list);
            System.out.println("Sorted ArrayList in Ascending Order : "+list);
        }else{
            Collections.sort(list,Collections.reverseOrder());
            System.out.println("Sorted ArrayList in Descending Order: " +list);
        }
    }
    /*display*/
    public void displayFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner scan = new Scanner(f);
        while(scan.hasNextDouble()){
            System.out.print(scan.nextDouble()+" ");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\STUDY\\U Sleep You Die\\JavaWeeklyHomework\\src\\week8_homework\\text.txt";
        FileExercise fe = new FileExercise();
        fe.addValue(path);

        Scanner scan = new Scanner(System.in);
        System.out.println("input search number: ");
        double target = scan.nextDouble();
        boolean ifSearch = fe.searchMethod(path,target);
        if(ifSearch){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }

        fe.sortMethod(path,true);
        fe.sortMethod(path,false);

        System.out.println("press int to show context: ");
        scan.nextInt();

        fe.displayFile(path);
    }
}
