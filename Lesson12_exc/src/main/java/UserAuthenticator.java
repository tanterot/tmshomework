public class UserAuthenticator {
    public static boolean validateCredentials(String login, String password, String confirmPassword){
        try {
            ValidationService validationService = new ValidationService();
            validationService.validateLogin(login);
            validationService.validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException exc) {
            System.out.println(exc.getMessage());
            return false;
        }
    }
}

class ValidationService {
    public void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("invalid login");

        }
    }

    public void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20
                || password.contains(" ")
                || !password.matches(".*\\d.*")
                || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("invalid password");
        }
    }
}
