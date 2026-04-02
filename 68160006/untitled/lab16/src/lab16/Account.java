package lab16;

abstract class Account {
    protected String name;
    protected double amount;

    Account(String name, double amount) {
        this.name = name;
        setAmount(amount);
    }

    void deposit(double amount){
        this.amount += amount;
    }

    String getName(){
        return name;
    }

    double getAmount(){
        return amount;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    abstract void computeInterest();
}

