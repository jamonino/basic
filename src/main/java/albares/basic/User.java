
package albares.basic;

public class User {
    private String username;
    private String pass;
    private Integer age;

    public User() {
    }
    
    public User(String username, String pass, int age) {
        this.username = username;
        this.pass = pass;
        this.age = age;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", pass=" + pass + ", age=" + age + '}';
    }
    
    
    
}
