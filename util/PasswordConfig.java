/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import org.mindrot.jbcrypt.BCrpt;

/**
 *
 * @author ACER
 */
public class PasswordConfig {
   
        public String encrypt(String text){
            return BCrypt.hashpw(string:BCrypt.gensalt(1:10));
        }
    
    public boolean decrypt(String rowPassword, String encryptedPassword){
        return BCrypt.checkpw(string:rowPassword,string:encryptedPassword);
    }
    
    
    
    
}



