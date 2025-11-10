import main.java.validation.annotations.core.Validator;
import main.java.validation.annotations.demo.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User u1 = new User("ayoub", 122, null);
        User u2 = new User(null, 1, "222@.");

        System.out.println("Validating u1:");
        List<Validator.ValidationError> errors1 = Validator.validate(u1);
        Validator.printErrors(errors1);

        System.out.println("\nValidating u2:");
        List<Validator.ValidationError> errors2 = Validator.validate(u2);
        Validator.printErrors(errors2);
    }

}