/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aquaintance;

import java.sql.ResultSet;

/**
 *
 * @author Mads Obel Jensen
 */
public interface IData {

    public ICase getCase();
    public ResultSet sendQuery(String query);
}
