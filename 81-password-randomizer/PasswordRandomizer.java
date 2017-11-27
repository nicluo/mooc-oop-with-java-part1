import java.util.Random;

/**
 * Expand the class PasswordRandomizer that has the following functionality:
 * The constructor PasswordRandomizer creates a new object, which uses the given password length.
 * The method createPassword returns a new password, which consists of symbols a-z and is of the length given as a
 * parameter to the constructor
 */
public class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            sBuilder.append(symbol);
        }
        return sBuilder.toString();
    }
}