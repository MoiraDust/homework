package week7_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {
    public static  ArrayList<String> list = new ArrayList<String>();

    public void readAndAppendText(String x){
        System.out.println("your add: " + x);
        list.add(x);
        System.out.print("new array is: ");
        for(String i : list){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

    public void search(String x){
        for(int i = 0; i<list.size();i++){
            if(list.get(i).equals(x)){
                System.out.print("the index is "+i+";");
            }
        }
    }

    public int[] position(String x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(x)){
                res.add(i);
            }
        }
        int[] index = new int[res.size()];
        for(int j =0; j<res.size(); j++){
            index[j] = res.get(j);
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println("your orginal array: ");
        for(int i = 0; i<args.length; i++){
            list.add(args[i]);
            System.out.print(args[i]+" ");
        }

        System.out.println(" ");
        System.out.println("input your append:");
        Scanner sc = new Scanner(System.in);
        String addWords = sc.nextLine();
        Exercise02 num = new Exercise02();
        num.readAndAppendText(addWords);

        System.out.println("input your search words:");
        String searchWords = sc.next();
        System.out.println("your search words is: "+searchWords);
        num.search(searchWords);
        System.out.println(" ");

        System.out.println("input your search words:");
        String searchWords2 = sc.next();
        System.out.println("your search words is: "+searchWords2);
        int[] m = num.position(searchWords2);
        System.out.print("array list: ");
        for(int i=0;i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }
}
