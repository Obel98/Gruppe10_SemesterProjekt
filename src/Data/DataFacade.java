/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;
import java.sql.ResultSet;

/**
 *
 * @author Mads Obel Jensen
 */
public class DataFacade implements Aquaintance.IData
{

    private ICase iCase;
    private ResultSet rs;

    @Override
    public ICase getCase()
    {
        CaseReader IC = new CaseReader("Sag1.txt");
        iCase = IC.getCase();
        return iCase;
    }

    @Override
    public ResultSet sendQuery(String query)
    {
        Database db = new Database("jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn",
                "jkclsvjn", "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1");
        rs = db.sendQuery(query);
        return rs;
    }

}
