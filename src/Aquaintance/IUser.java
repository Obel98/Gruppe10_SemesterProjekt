/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquaintance;

/**
 *
 * @author Obel
 */
public interface IUser
{

    String getUsername();

    String getPassword();
    
    String setPassword();

    String getFirstname();

    String getLastname();

    String getEmail();

    int getPhoneNumber();

    int getCPR();

    String getAddress();

    String getBirthday();

}
