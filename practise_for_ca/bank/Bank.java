package practise_for_ca.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    HashMap<Integer, Account> accounts = new HashMap<>();
    public void addAcc( Account a){
        accounts.put(a.accno, a);
    }

    public void searchAcc(Integer accno) throws Exception{
        if(accounts.containsKey(accno)){
            System.out.println("acc exists");
            accounts.get(accno).diplayAcc();
        }
        else{
            String s = "No acc foubng";
            System.out.println(s);
        }
    }

}
