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
public interface ICase {
    public ICase getCaseByID(int ID);

    public int getID();

    public String getFirstName();

    public String getLastName();

    public int getPhoneNumber();

    public String getEmail();

    public int getBirthday();

    public int getCPR();

    public String getAddresse();

    public String getCommentar();

    public String getStatus();
}
