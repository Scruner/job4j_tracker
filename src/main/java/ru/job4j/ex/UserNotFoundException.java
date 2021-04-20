package ru.job4j.ex;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }

    public void getMessage(String user_not_listed) {
    }
}
