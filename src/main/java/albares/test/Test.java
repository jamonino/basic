
package albares.test;

import albares.utils.JWTUtils;
import com.auth0.jwt.exceptions.JWTCreationException;
import java.security.SecureRandom;
import java.util.Date;
import org.apache.commons.lang3.RandomStringUtils;


public class Test {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        char[] possibleCharacters = (new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")).toCharArray();
        String randomStr = RandomStringUtils.random( 200, 0, possibleCharacters.length-1, false, false, possibleCharacters, new SecureRandom() );
        System.out.println( new Date(System.currentTimeMillis()+60000) );
        System.out.println( new Date() );
        System.out.println(JWTUtils.generateToken(5));
    }
}