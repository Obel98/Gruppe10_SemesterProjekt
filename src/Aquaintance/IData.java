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
public interface IData {

    ICase getCase(int ID);

    boolean validateUserName(String username);

    boolean validatePassword(String username, String password);

    String getUserType(String username, String password);
}
