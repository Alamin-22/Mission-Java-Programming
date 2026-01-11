package Final;

// overriding polymorphism
class Notification {
    void send() {
        System.out.print("\n Sending generic Notification");
    }
}

class SMS extends Notification {
    void send() {
        System.out.print("\n Sending SMS Notification");
    }
}

class Email extends Notification {
    void send() {
        System.out.print("\n Sending Email Notification");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Notification smsNoti = new SMS();
        smsNoti.send();

        Notification emailNoti = new Email();
        emailNoti.send();

    }

}
