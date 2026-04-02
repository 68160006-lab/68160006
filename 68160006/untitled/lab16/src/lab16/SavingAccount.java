package lab16;

class SavingAccount extends Account {

    SavingAccount(double amount) {
        super("saving", amount);
    }

    void computeInterest() {
        amount += amount * 0.01; // 1%
    }
}
