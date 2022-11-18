package apollo.exercises.ch06_classes;

public class BankRunner {
    public static void main(String[] args) {
        User user1 = new User("Kroaster", "Phil", 23);
        BankAccount account1 = new BankAccount(user1, 500);
        String test = account1.withdraw(600);
        System.out.println(test);


        User user2 = new User("ASD", "TF", 23);
        BankAccount account2 = new BankAccount(user2, 500);
        String test2 = account2.withdraw(600);
        System.out.println(test2);
    }
}
