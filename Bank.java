abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    @Override
    void getBalance() {
        System.out.println("Bank A Balance: $100");
    }
}

class BankB extends Bank {
    @Override
    void getBalance() {
        System.out.println("Bank B Balance: $150");
    }
}

class BankC extends Bank {
    @Override
    void getBalance() {
        System.out.prin
