//6510450585 Prakasit Jaiharn
package models;

import services.AgeValidator;
import services.EmailValidator;
import services.NameValidator;
import services.Validator;

import java.util.ArrayList;

public class Register {
    private final User user;
    private boolean validated;
    private final ArrayList<Validator> validators;

    public Register(User user) {
        this.user = user;
        this.validated = false;

        validators = new ArrayList<>();

        validators.add(new AgeValidator());
        validators.add(new EmailValidator());
        validators.add(new NameValidator());
    }

    public void validate() {
        validators.forEach(validator -> {
            validator.validated(user);
        });
        System.out.println("Pass Validator!");
        this.validated = true;
    }
}