public class Main {
    public static void main(String[] args) {
        String login = "Anderi_Makarevich";
        String password = "qwerty4";
        String confirmPassword = "qwerty4";

        boolean b = UserAuthenticator.validateCredentials(login, password, confirmPassword);
        System.out.println(b);

    }
}