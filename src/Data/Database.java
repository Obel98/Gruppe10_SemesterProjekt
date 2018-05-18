/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Obel
 */
public class Database {

    private final String dburl;
    private final String dbusername;
    private final String dbpassword;
    private ArrayList<String> result;

    public Database() {
        this.dburl = "jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn";
        this.dbusername = "jkclsvjn";
        this.dbpassword = "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1";
    }

    public ArrayList<String> sendQuery(String query)
    {
        
        try
        {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);
                Statement st = db.createStatement();
                ResultSet rs = st.executeQuery(query);)
        {
            result = new ArrayList<>();
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    //System.out.print(rs.getString(i) + " ");
                    result.add(rs.getString(i));
                    i++;
                }
                //System.out.println(rs.getString(i) + " ");
                result.add(rs.getString(i));
            }
            //System.out.println(result);
            //return result;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return result;
    }
    
    public String sendQueryTest(String query)
    {
        String resultString = "";
        try
        {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);
                Statement st = db.createStatement();
                ResultSet rs = st.executeQuery(query);)
        {
            //String resultString = "";
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    //System.out.print(rs.getString(i) + " ");
                    resultString += rs.getString(i);
                    i++;
                }
                //System.out.println(rs.getString(i) + " ");
                resultString += rs.getString(i);
            }
            System.out.println(resultString);
            //return result;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return resultString;
    }
}
