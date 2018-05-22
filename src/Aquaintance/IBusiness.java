/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquaintance;

/**
 *
 * @author Mads Obel Jensen
 */
public interface IBusiness {

    void injectData(IData data);

    void getCase();
    
    int getID();

    String getFirstName();

    String getLastName();

    int getPhoneNumber();

    String getEmail();

    int getBirthday();

    int getCPR();

    String getAddress();

    String getJournal();
    
    String getStatus();
    
    String getUsername();
    
    boolean validateUsername(String username);
    
    boolean validatePassword(String username, String password);
    
    String getUserType(String username, String password);
        
}
