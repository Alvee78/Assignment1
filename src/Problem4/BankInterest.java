package Problem4;

public class BankInterest {
    private double balance;
    public BankInterest(){
        balance = 0 ;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double printBalance(double year){
        for (int i = 0; i < year; i++) {
            balance = balance + (balance * 0.05);
        }
        return balance;
    }
}
