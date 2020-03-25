package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User res = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                res = user;
            }
        }
        if (res == null) {
            throw new UserNotFoundException("User is not found");
        }
        return res;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("abrunan", true)
        };
        try {
            User user = findUser(users, "abrunan");
            if (validate(user)) {
                System.out.println("This user has access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
