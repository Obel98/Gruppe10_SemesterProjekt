/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Aquaintance.ICase;
import Aquaintance.IData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mads Obel Jensen
 */
public class BusinessFacade implements Aquaintance.IBusiness {

    private IData data;
    //Add to set instead.
    private Case sag;
    private ResultSet rs;
    private static Connection db;

    @Override
    public void injectData(IData data) {
        this.data = data;
    }

    @Override
    public void getCase() {
        //ICase newCase = data.getCase();
        sag = new Case(Integer.parseInt(data.sendQueryTest("SELECT caseid FROM accessto WHERE username = 'tota'")), "Problemer med TEXT column", new Borger(data.sendQueryTest("SELECT cpr FROM users WHERE username = 'borgar30'"), data.sendQueryTest("SELECT firstname FROM users WHERE username = 'borgar30'"), data.sendQueryTest("SELECT lastname FROM users WHERE username = 'borgar30'"), data.sendQueryTest("SELECT address FROM users WHERE username = 'borgar30'"), data.sendQueryTest("SELECT telephonenumber FROM users WHERE username = 'borgar30'"), data.sendQueryTest("SELECT email FROM users WHERE username = 'borgar30'")), data.sendQueryTest("SELECT date FROM casefile WHERE caseid = (SELECT caseid FROM accessto WHERE username = 'tota')"));
        sag.getBorger().setUsername("borgar30");
        sag.getBorger().setBirthday("SELECT birthday FROM users WHERE username = 'borgar30'");
        //ICase newCase = sag;
        /*sag.setID(newCase.getID());
        sag.setFirstName(newCase.getFirstName());
        sag.setLastName(newCase.getLastName());
        sag.setPhoneNumber(newCase.getPhoneNumber());
        sag.setEmail(newCase.getEmail());
        sag.setBirthday(newCase.getBirthday());
        sag.setCPR(newCase.getCPR());
        sag.setAddresse(newCase.getAddresse());
        sag.setCommentar(newCase.getCommentar());
        sag.setStatus(newCase.getStatus());*/
    }

    @Override
    public int getID() {
        return sag.getID();
    }

    @Override
    public String getFirstName() {
        return sag.getBorger().getName();
    }

    @Override
    public String getLastName() {
        return sag.getBorger().getLastName();
    }

    @Override
    public int getPhoneNumber() {
        return Integer.parseInt(sag.getBorger().getPhoneNumber());
    }

    @Override
    public String getEmail() {
        return sag.getBorger().getEmail();
    }

    @Override
    public int getBirthday() {
        return Integer.parseInt(sag.getBorger().getBirthday());
    }

    @Override
    public int getCPR() {
        return Integer.parseInt(sag.getBorger().getCPR());
    }

    @Override
    public String getAddress() {
        return sag.getBorger().getAddress();
    }

    @Override
    public String getJournal() {
        return sag.getCommentar();
    }
    
    @Override
    public String getStatus() {
        return sag.getStatus();
    }
    
    @Override
    public String getUsername()
    {
        return sag.getBorger().getUsername();
    }

    @Override
    public void sendQuery(String query)
    {
        //rs = 
        data.sendQuery(query);
        //return rs;
    }
    
    @Override
    public boolean validUsername(String username)
    {
        ArrayList<String> list;
        list = data.sendQuery("SELECT username FROM users");
        return list.contains(username);
        
    }
    
    @Override
    public boolean validPassword(String username, String password)
    {
        ArrayList<String> list;
        list = data.sendQuery("SELECT password FROM users WHERE username = '" + username + "'");
        return list.contains(password);
        
    }
    
    @Override
    public String getUserType(String username, String password)
    {
        ArrayList<String> list;
        list = data.sendQuery("SELECT type FROM users WHERE username = '" + username + "' AND password = '" + password + "'");
        //System.out.println(list.toString());
        return list.toString();
        
    }
    
    @Override
    public String passThrough(String query)
    {
        return data.sendQueryTest(query);
    }
    
    
    

}
