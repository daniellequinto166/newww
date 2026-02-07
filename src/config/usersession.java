
package config;


public class usersession {
     public static int id;
    public static String fullname;
    public static String username;
    public static String email;
    public static String password;
    public static String phonenumber;
    public static String role;
    public static String status;

    public static void clear() {
        id = 0;
        fullname = null;
        username = null;
        email = null;
        password = null;
        phonenumber = null;
        role = null;
        status = null;
    }
}
