# Factory Method Exercise

In this exercise, you will implement the **Factory Method** design pattern for a notification system.

The program supports two types of notifications:

- Email notifications
- SMS notifications

`EmailNotification` and `SMSNotification` are concrete subclasses of `Notification`.

## Where to Start

Start by looking at the following classes:

- `Notification`
- `EmailNotification`
- `SMSNotification`

These classes represent the objects that actually send notifications.

Next, look at `NotificationService`. This class contains the general logic for notifying a user, but it should **not** decide which specific type of `Notification` to create.

## Your Task

1. In `NotificationService`, declare an abstract factory method that returns a `Notification`.

2. Modify `notifyUser()` so that it:
    - calls the factory method to obtain a `Notification`
    - uses that object to send the message

3. In `EmailService`, which is a subclass of `NotificationService`, implement the factory method so that it returns an `EmailNotification`.

4. In `SMSService`, which is a subclass of `NotificationService`,implement the factory method so that it returns an `SMSNotification`.

5. Run the program and verify that the appropriate notification is created and used for each service.

## Important

`NotificationService` should not directly create an `EmailNotification` or `SMSNotification`.

The goal of this exercise is to separate:

-the code that uses a Notification

-from the code that decides which concrete Notification to create (the part that might change).