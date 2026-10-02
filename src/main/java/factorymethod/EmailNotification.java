package factorymethod;

class EmailNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
