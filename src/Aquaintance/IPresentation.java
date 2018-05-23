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
public interface IPresentation {

    void injectBusiness(IBusiness business);

    void start();

    void getCase(int ID);

    int getID();

    String getFirstName();

    String getLastName();

    int getPhoneNumber();

    String getEmail();

    String getBirthday();

    int getCPR();

    String getAddress();

    String getJournal();

    String getStatus();

    String getUsername();

}
