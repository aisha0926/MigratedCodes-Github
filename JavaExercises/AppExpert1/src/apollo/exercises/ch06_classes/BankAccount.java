package apollo.exercises.ch06_classes;

public class BankAccount {
    private double balance;

    public BankAccount(User user, double initialBal) {
        this.balance = initialBal;
    }
    public double deposit(double fund){
        balance += fund;
        return balance;
    }

    public String withdraw(double fund){
        if(fund > balance){
            return "Not enough funds, you only have " + balance;
        }

        balance-=fund;
        return "You've withdrawn " + fund + " remaining balance " +balance;
    }
    public void printBalance(){

            System.out.println("Available balance " + balance);

    }
}
