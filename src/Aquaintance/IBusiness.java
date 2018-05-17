/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquaintance;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Mads Obel Jensen
 */
public interface IBusiness {

    void injectData(IData data);

    void getCase();
    
    ResultSet sendQuery(String query);

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
