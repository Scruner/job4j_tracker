package ru.job4j.ex;

public class UserInvalidException extends UserNotFoundException {

    public UserInvalidException(String message) {
        super(message);
    }

    public void getMessage(String user_not_valid) {
    }
}
