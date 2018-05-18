/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquaintance;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Mads Obel Jensen
 */
public interface IData {

    public ICase getCase();
    public ArrayList<String> sendQuery(String query);
    public String sendQueryTest(String query);
    public ICase getCase(int id);
}
