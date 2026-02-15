
package config;


public class session {
     public static String username;
     public static int user_id;
    public static String role;
    public static String fullname;
    public static String email;
    public static String phonenumber;
    public static int id; 
    public static String password; 

    public static void clear() {
        username = null;
        role = null;
        fullname = null;
        email = null;
        phonenumber = null;
        id = 0;
        password = null;
    }
    
    
}
