public class UserAuthenticator {
    public static boolean validateCredentials(String login, String password, String confirmPassword){
        try {
            ValidationService.validateLogin(login);
            ValidationService.validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException exc) {
            System.out.println(exc.getMessage());
            return false;
        }
    }
}

class ValidationService {
    public static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("invalid login");

        }
    }

    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20
                || password.contains(" ")
                || !password.matches(".*\\d.*")
                || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("invalid password");
        }
    }
}
