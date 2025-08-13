package August12;

public class Bank {
    private double deposit;
    private double balance =0.0;
    private double withdraw;





    public double withdraw(double d){
         return balance=balance-d;

    }
    public double balance(){
        return balance;


    }
    public double deposit( double deposit){
        balance=balance+deposit;
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdraw() {
        return withdraw;
    }


}
