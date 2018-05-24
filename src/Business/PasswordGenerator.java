package Business;

import java.security.SecureRandom;

/**
 *
 * @author ProjektGruppe 10.
 */
public class PasswordGenerator {

    private static SecureRandom random = new SecureRandom();

    private final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private final String NUMERIC = "0123456789";
    private final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    private String generatePassword(int len, String dic) {
        String password = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            password += dic.charAt(index);
        }
        return password;
    }

    public void setRandom(SecureRandom random) {
        PasswordGenerator.random = random;
    }

    public SecureRandom getRandom() {
        return random;
    }
}
