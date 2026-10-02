package factorymethod;

class SMSNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
