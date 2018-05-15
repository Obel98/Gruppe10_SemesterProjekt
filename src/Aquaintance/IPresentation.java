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

    void loadHome();

    int getID();

    String getFirtName();

    String getLastName();

    int getPhoneNumber();

    String getEmail();

    int getBirthday();

    int getCPR();

    String getAddresse();

    String getJournal();
    
    String getStatus();

}
