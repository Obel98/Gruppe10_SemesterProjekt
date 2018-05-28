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
public interface IAdmin
{
    
    void createUser(int CPR, String firstname, String lastname, String address, int phoneNumber, String email, String birthday, String username, String type, String password);

}
