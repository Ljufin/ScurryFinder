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
    
    //setters
    public static void set_username(String newname) {
        username = newname;
    }
    
    public static void set_password(String newpass) {
        password = newpass;
    }
    
    // private variables to store some basic data for the interface
    private static String username;
    private static String password;
    
    
}
