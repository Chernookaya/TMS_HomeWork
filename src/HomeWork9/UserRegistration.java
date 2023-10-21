package HomeWork9;
//Создать класс, в котором будет статический метод.
//Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
//– один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//Метод возвращает true, если значения верны или false в другом случае.

public class UserRegistration {
    public static void main(String[] args) {
        String login = "user123";
        String password = "qwerty123";
        String confirmPassword = "qwerty123";

        try {
            boolean isRegistrationSuccessful = registerUser(login, password, confirmPassword);
            System.out.println("Registration successful: " + isRegistrationSuccessful);
        } catch (WrongLoginException e) {
            System.out.println("Wrong login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password: " + e.getMessage());
        }
    }
    public static boolean registerUser(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 && login.contains(" ")) {
            throw new WrongLoginException("Login should be less than 20 characters and should not contain spaces");
        }

        if (password.length() >= 20 && password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password should be less than 20 characters, should not contain spaces, and should contain at least one digit");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match");
        }

        return true;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}