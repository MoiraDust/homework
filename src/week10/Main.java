package week10;

public class Main {
    public static void main(String[] args) {
        Woker testSalariedWorked = new SalariedWorker("A",200.00);
        Woker testHourlyWoker = new HourlyWorker("B",20.00);
        System.out.println(testSalariedWorked.getName()+" salary is "+testSalariedWorked.computepay(8));
        System.out.println(testHourlyWoker.getName()+" salary is "+testHourlyWoker.computepay(47));
    }
}
