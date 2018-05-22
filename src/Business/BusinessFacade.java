/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Aquaintance.ICase;
import Aquaintance.IData;

/**
 *
 * @author Mads Obel Jensen
 */
public class BusinessFacade implements Aquaintance.IBusiness
{

    private IData data;
    private Case sag;
    //Add to set instead.

    @Override
    public void injectData(IData data)
    {
        this.data = data;
    }

    @Override
    public void getCase(int ID)
    {
        ICase temp = data.getCase(ID);
        sag = new Case(temp);
    }

    @Override
    public int getID()
    {
        return sag.getID();
    }

    @Override
    public String getFirstName()
    {
        return sag.getFirstName();
    }

    @Override
    public String getLastName()
    {
        return sag.getLastName();
    }

    @Override
    public int getPhoneNumber()
    {
        return sag.getPhoneNumber();
    }

    @Override
    public String getEmail()
    {
        return sag.getEmail();
    }

    @Override
    public String getBirthday()
    {
        return sag.getBirthday();
    }

    @Override
    public int getCPR()
    {
        return sag.getCPR();
    }

    @Override
    public String getAddress()
    {
        return sag.getAddress();
    }

    @Override
    public String getJournal()
    {
        return sag.getJournal();
    }

    @Override
    public String getStatus()
    {
        return sag.getStatus();
    }

    @Override
    public String getUsername()
    {
        return sag.getUserName();
    }

    @Override
    public boolean validateUsername(String username)
    {
        return data.validateUserName(username);
    }

    @Override
    public boolean validatePassword(String username, String password)
    {
        return data.validatePassword(username, password);
    }

    @Override
    public String getUserType(String username, String password)
    {
        return data.getUserType(username, password);
    }

}
