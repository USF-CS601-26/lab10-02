package factorymethod;

public class Main {

    static void main(String[] args) {
        NotificationService service =
                new EmailService();
        service.notifyUser("Your order has shipped.");

        // FILL IN CODE: do the same for the SMSService

    }
}