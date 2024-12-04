package practise_for_ca.bank;

public class Account {
     public static Integer next =1000;
     Integer accno;
    String accholder;
    Integer balance;

    public Account(String accholder, Integer balance){
        this.accno = next++;
        this.accholder = accholder;
        this.balance = balance;
    }

    public void diplayAcc(){
        System.out.println("Account details : ");
        System.out.println("Account number : "+this.accno);
        System.out.println("Account Holder name : "+this.accholder);
        System.out.println("Balance  : "+this.balance);
    }

    public void deposit(Integer amt){
        this.balance += amt;

    }

    public void withdraw(Integer amt) throws InvalidWithdrawal {
    Integer bal = this.balance - amt;
    if(bal<0){
        throw  new InvalidWithdrawal("Invalid withdraw amount woth account balance "+ this.balance);
    }
    else{
        this.balance = bal;
    }
    }


}
