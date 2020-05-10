public class quickStart {
    public static class ModifyNum {
        public int modifyNumber(int num, int modifier) {
            if(modifier < 0) {
                num = num - 2;
            }
            doubleThis(num);
            num = doubleThis(modifier + num);
            return num;
        }
        public int doubleThis(int num) {
            return(num+num);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        ModifyNum numTrace = new ModifyNum();
        System.out.print(numTrace.modifyNumber(3,-4));
    }
}
