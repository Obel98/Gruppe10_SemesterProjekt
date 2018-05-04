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

    @Override
    public void injectData(IData data) {
        this.data = data;
    }

    @Override
    public void getCase() {
        ICase newCase = data.getCase();
        Case sag = new Case();
        sag.setID(newCase.getID());
        sag.setFirtName(newCase.getFirtName());
        sag.setLastName(newCase.getLastName());
        sag.setPhoneNumber(newCase.getPhoneNumber());
        sag.setEmail(newCase.getEmail());
        sag.setBirthday(newCase.getBirthday());
        sag.setCPR(newCase.getCPR());
        sag.setAddresse(newCase.getAddresse());
        sag.setJournal(newCase.getJournal());
    }

}
