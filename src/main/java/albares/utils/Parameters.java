
package albares.utils;

import albares.basic.api.User;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public final class Parameters {

    public Parameters() {
    }
    
    public static final String PROJECT_NAME = "Jose";
    public static final int EXPIRATION_MILLIS = 60 /* SECONDS */ *1000;
    
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/prueba_db";
    public static final String DB_USER = "prueba_user";
    public static final String DB_PASS = Secrets.DB_PASS;
    
    public static final Map<Integer, User> users = new HashMap();
    public static final AtomicInteger idUsers = new AtomicInteger(0);
    
}
