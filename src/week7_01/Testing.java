package week7_01;

public class Testing {
    public static void main(String[] args) {
        BankAccount bcAdd = new BankAccount(1001,"Alice");
        Bank bk = new Bank();
        bk.addBankAccount(bcAdd);
        int bankAccount = bcAdd.getAccountNumber();
        String name = bcAdd.getOwnerName();
        System.out.println("new bank account: "+bankAccount+" user name:"+name);

        int remBankAccount = 999;
        int remove = bk.removeBankAccount(remBankAccount);
        if(remove == 1){
            System.out.println("remove success");
        }
        if(remove == 0){}
        System.out.println("deny: account do not exist");

        String retName = "Alice";
        int res = bk.retBankAccount(retName);
        if(res != 0){
            System.out.println("your account has been retrived, account number is :" + res);
        }
        if(res == 0){
            System.out.println("deny");
        }

    }
}
