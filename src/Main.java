//6510450585 Prakasit Jaiharn
import models.Register;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Big", "test@gmail.com", 21);
        Register register = new Register(user);
        register.validate();
    }
}