//6510450585 Prakasit Jaiharn
package services;

import models.User;

public class AgeValidator implements Validator{
    @Override
    public boolean validated(User user) {
        if( user.getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        } else {
            return true;
        }
    }
}
