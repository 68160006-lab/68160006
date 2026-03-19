package lab13;

class AccountDemo { 
    public static void main(String[] args) { 
        SavingsAccount sa = new SavingsAccount(30000); 
        System.out.println("account name: " + sa.getName());        
        System.out.println("initial amount: " + sa.getAmount());       
        sa.deposit(2000); 
        System.out.println("new amount after deposit: " + sa.getAmount()); 

        CheckingAccount ca = new CheckingAccount(50000); 
        System.out.println("account name: " + ca.getName());       
        System.out.println("initial amount: " + ca.getAmount());       
        ca.deposit(4000); 
        System.out.println("new amount after deposit: " + ca.getAmount());       
        ca.withdraw(6000); 
        System.out.println("new amount after withdrawal: " + ca.getAmount()); 
    } 
}
