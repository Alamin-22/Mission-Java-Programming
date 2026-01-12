package Final;

interface PaymentMethod {

    void pay(int pin, double amount);

}

class bakshPayment implements PaymentMethod {
    public void pay(int pin, double amountToPay) {
        // lets say our password is 1234
        if (pin == 1234) {
            System.out.println("\n Pin Accepted,,, Processing payment");
            System.out.println(amountToPay + " has been paid! Success!!");
        } else {
            System.out.println("\n Wrong Pin,,, Try again");
        }
    }
}

class BBLPayment implements PaymentMethod {
    public void pay(int pin, double amountToPay) {

        if (pin == 1234564) {
            System.out.println("\n Pin Accepted,,, Processing payment");
            System.out.println(amountToPay + " has been paid! Success!!");
        } else {
            System.out.println("Wrong Number,,, Try again");
        }
    }
}

public class paymentQuestion {

    public static void main(String[] args) {

        PaymentMethod bkshObj = new bakshPayment();
        bkshObj.pay(1234, 5000);

        PaymentMethod bblObj = new BBLPayment();
        bblObj.pay(1234564, 1500);

    }

}
