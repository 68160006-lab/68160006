package lab16;

public class Test{
    public static void main(String[] args){
        Account ac;

        ac = new SavingAccount(10000);
        System.out.println("account name: " + ac.getName());
        System.out.println("initial amount: " + ac.getAmount());

        ac.deposit(5000);
        System.out.println("new amount after deposit: " + ac.getAmount());

        ac.computeInterest();
        System.out.println("new amount after compute interest: " + ac.getAmount());

        System.out.println();

        ac = new CheckingAccount(20000);
        System.out.println("account name: " + ac.getName());
        System.out.println("initial amount: " + ac.getAmount());

        ac.deposit(6000);
        System.out.println("new amount after deposit: " + ac.getAmount());

        ((CheckingAccount) ac).withdraw(3000);
        System.out.println("new amount after withdrawal: " + ac.getAmount());

        ac.computeInterest();
        System.out.println("new amount after compute interest: " + ac.getAmount());
    }
}
