package practise_for_ca.bank;

public class Main {
    public static void main(String[] args) throws Exception {

        Account a1 = new Account("surya", 100000);
        Account a2 = new Account("mohan", 264295034);
        Bank bank = new Bank();
        a1.diplayAcc();
        a2.diplayAcc();
        a1.deposit(1111);
        a2.withdraw(1111);
        bank.addAcc(a1);
        bank.addAcc(a2);
        bank.searchAcc(1);
    }

}
