package Final;

abstract class Bank {
    abstract void getBalance();
}

class AsianBank extends Bank {
    private int balance = 100;

    public void getBalance() {
        System.out.println(" \n Current Balance for AsianBank is => " + balance);
    }
}

class EuropeanBank extends Bank {
    private int balance = 150;

    public void getBalance() {
        System.out.println(" \n Current Balance for European Bank is => " + balance);
    }

}

class AmericanBank extends Bank {

    private int balance = 200;

    public void getBalance() {
        System.out.println("\n Current Balance for European Bank is => " + balance);
    }

}

public class AbstractBank {

    public static void main(String[] args) {

        Bank AsianObj = new AsianBank();
        Bank europeanObj = new EuropeanBank();
        Bank americanObj = new AmericanBank();

        AsianObj.getBalance();
        europeanObj.getBalance();
        americanObj.getBalance();

    }

}
