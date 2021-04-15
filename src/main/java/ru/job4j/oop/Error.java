package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 3, "Good");
        Error error2 = new Error(false, 1, "Ok");
        Error error3 = new Error(true, 7, "Wonderful");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
