/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.squirrels;

/**
 *
 * @author Will
 */
public class backEnd {
    
    
    // constructor
    public backEnd() {
        
        // launch the login screen
        new loginPage().setVisible(true);
        
    }
    
    // I know how to write Java, I swear!
    public static void main(String args[]) {
        
        new backEnd();
    }
    
    
    //getters
    public static String get_username() {
        return username;
    }
    
    public static String get_password() {
        return password;
    }
    
    public static String get_major() {
        return major;
    }
    
    public static String get_year() {
        return year;
    }
    
    public static String get_gender() {
        return gender;
    }
    
    public static Boolean get_torrey() {
        return torrey;
    }
    
    public static Boolean get_global() {
        return global;
    }
    
    //setters
    public static void set_username(String newname) {
        username = newname;
    }
    
    public static void set_password(String newpass) {
        password = newpass;
    }
    
   public static void set_major(String newmajor) {
       major = newmajor;
   }
   
   public static void set_year(String newyear) {
       year = newyear;
   }
   
   public static void set_gender(String newgender) {
       gender = newgender;
   }
   
   public static void set_torrey(Boolean newtorrey) {
       torrey = newtorrey;
   }
   
   public static void set_global(Boolean newglobal) {
       global = newglobal;
   }
    
    // private variables to store some basic data for the interface
    private static String username = "Unknown";
    private static String password = "Unknown";
    private static String major = "Undeclared";
    private static String year = "Unknown";
    private static String gender = "Unknown";
    
    private static Boolean torrey = false; // both default to false
    private static Boolean global = false;
    
    
    
}
