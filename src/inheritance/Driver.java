package inheritance;

public class Driver {

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount("131212", 123);
        BankAccount ac2 = new BankAccount("131212", 123);
        System.out.println(ac1 == ac2);
        System.out.println(ac1.equals(ac2));

//        System.out.println(ac1);
//        CheckingAccount acc1 = new CheckingAccount("12421", 1000,123, 1000);
//        CheckingAccount acc2 = new CheckingAccount("12312",10000,123, 2000);
//        acc1.transfer(acc2, 100);
//
//        System.out.println("Account1 balance: " + acc1.getBalance());
//        System.out.println("Account2 balance: " + acc2.getBalance());
    }
}
