package HomeWork6;

public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("На счете: " + accountNumber +" недостаточно средств");
        }
    }

    public void displayInfo() {
        System.out.println("Номер вашего счета: " + accountNumber);
        System.out.println("Сумма на счете: " + balance);
    }
}

class CreditCardTestDrive {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("DE89 3704 0044 0532 0130 00", 1752.25);
        CreditCard card2 = new CreditCard("GB29 NWBK 6016 1331 9268 19", 2225.48);
        CreditCard card3 = new CreditCard("SE35 5000 0000 0549 1000 0003", 200.96);

        card1.deposit(130.17);
        card2.deposit(550.89);
        card3.withdraw(378.12);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}

