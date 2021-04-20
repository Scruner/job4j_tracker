package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (!users[i].equals(login)) {
                throw new UserNotFoundException("User not listed");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername()
                .length() < 3) {
            throw new UserInvalidException("User not valid");
        }
        return false;
    }

    public static void main(String[] args) {

            User[] users = {
                    new User("Petr Arsentev", true)
            };
            try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.getMessage("User not valid");
        } catch (UserNotFoundException e) {
            e.getMessage("User not listed");
        }
    }
}
