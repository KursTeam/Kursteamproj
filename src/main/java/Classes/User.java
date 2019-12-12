package Classes;

/**
 * Table for users from site
 */
public class User {

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    public int user_id;

    /**
     * 
     */
    public String user_name;

    /**
     * 
     */
    public int role_id;

    /**
     * 
     */
    public int Age;

}