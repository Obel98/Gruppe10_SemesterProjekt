/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;
import java.util.ArrayList;

/**
 *
 * @author Mads Obel Jensen
 */
public class DataFacade implements Aquaintance.IData {

    private ICase iCase;

    @Override
    public ICase getCase(int id) {
        Case sag = new Case(id);
        iCase = sag.getCase();
        return iCase;
    }

    @Override
    public boolean validateUserName(String username) {
        Database db = new Database();
        ArrayList<String> temp = new ArrayList<>();
        temp = db.sendQuery("SELECT username FROM users");
        return temp.contains(username);
    }

    @Override
    public boolean validatePassword(String username, String password) {
        Database db = new Database();
        ArrayList<String> temp = new ArrayList<>();
        temp = db.sendQuery("SELECT password FROM users WHERE username = '" + username + "'");
        return temp.contains(password);
    }

    @Override
    public String getUserType(String username, String password) {
        Database db = new Database();
        ArrayList<String> temp = new ArrayList<>();
        temp = db.sendQuery("SELECT type FROM users WHERE username = '" + username + "' AND password = '" + password + "'");
        return temp.toString();
    }

}
