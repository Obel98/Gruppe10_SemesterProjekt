/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;

/**
 *
 * @author Mads Obel Jensen
 */
public class DataFacade implements Aquaintance.IData {

    private ICase iCase;
            
    @Override
    public ICase getCase() {
        CaseReader IC = new CaseReader("Sag1.txt");
        iCase = IC.getCf();
        return iCase;
    }
    
}
