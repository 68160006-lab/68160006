package lab16;

class CheckingAccount extends Account {
	CheckingAccount(double amount){
        super("checking", amount);
    }

    void withdraw(double amount) {
        setAmount(getAmount() - amount);
    }

    void computeInterest() {
        amount += amount * 0.005; // 0.5%
    }
}

