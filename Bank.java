public class Bank {
    private double balance;
    private double rate;

    public Bank(double bal,double rat){
        balance=bal;
        rate=rat;
    }
    public double getBalance(){
        return balance;
    }
    public double getRate(){
        return rate;
    }
    public double calculateInterest(){
        return getBalance()*(getRate()/1200);
    }
}
