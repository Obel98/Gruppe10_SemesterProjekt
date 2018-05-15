/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.security.SecureRandom;

/**
 *
 * @author borga
 */
public class PasswordGenerator {

    private static SecureRandom random = new SecureRandom();

    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    public static String generatePassword(int len, String dic) {
        String password = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            password += dic.charAt(index);
        }
        return password;
    }

    private void getPassword() {
        System.out.println(generatePassword(8, ALPHA));
    }

    public static void setRandom(SecureRandom random) {
        PasswordGenerator.random = random;
    }

    public static SecureRandom getRandom() {
        return random;
    }

    
    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        pg.getPassword();
    }

}
