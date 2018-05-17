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
public class BusinessFacade implements Aquaintance.IBusiness {

    private IData data;
    //Add to set instead.
    private Case sag;

    @Override
    public void injectData(IData data) {
        this.data = data;
    }

    @Override
    public void getCase() {
        ICase newCase = data.getCase();
        sag = new Case();
        sag.setID(newCase.getID());
        sag.setFirtName(newCase.getFirtName());
        sag.setLastName(newCase.getLastName());
        sag.setPhoneNumber(newCase.getPhoneNumber());
        sag.setEmail(newCase.getEmail());
        sag.setBirthday(newCase.getBirthday());
        sag.setCPR(newCase.getCPR());
        sag.setAddresse(newCase.getAddresse());
        sag.setJournal(newCase.getJournal());
        sag.setStatus(newCase.getStatus());
    }

    @Override
    public int getID() {
        return sag.getID();
    }

    @Override
    public String getFirtName() {
        return sag.getFirtName();
    }

    @Override
    public String getLastName() {
        return sag.getLastName();
    }

    @Override
    public int getPhoneNumber() {
        return sag.getPhoneNumber();
    }

    @Override
    public String getEmail() {
        return sag.getEmail();
    }

    @Override
    public int getBirthday() {
        return sag.getBirthday();
    }

    @Override
    public int getCPR() {
        return sag.getCPR();
    }

    @Override
    public String getAddresse() {
        return sag.getAddresse();
    }

    @Override
    public String getJournal() {
        return sag.getJournal();
    }
    
    @Override
    public String getStatus() {
        return sag.getStatus();
    }

    @Override
    public void getDatabase()
    {
        
    }

}
