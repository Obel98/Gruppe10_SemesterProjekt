/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Obel
 */
public class Database
{

    private final String dburl;
    private final String dbusername;
    private final String dbpassword;

    public Database(String dburl, String dbusername, String dbpassword)
    {
        this.dburl = dburl;
        this.dbusername = dbusername;
        this.dbpassword = dbpassword;
    }

    public void listNames()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try
        {
            Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select * from admin;");
            System.out.println("Admin list:");
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    System.out.print(rs.getString(i) + " ");
                    i++;
                }
                System.out.println(rs.getString(i) + " ");

            }
            db.close();
            rs.close();
            st.close();
            System.out.println("Press enter to go back to the menu.");
            System.in.read();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }}
    /*
    public void winners()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try
        {
            Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select temp1.name from tournaments, (\n"
                    + "select * from playson\n"
                    + "union\n"
                    + "select * from coachesfor) AS temp0,\n"
                    + "(\n"
                    + "select * from players\n"
                    + "union\n"
                    + "select * from coaches\n"
                    + ") AS temp1\n"
                    + "where teamname = tournaments.winner and temp1.nickname = temp0.nickname\n"
                    + "order by name");
            System.out.println("These are the names of all the people who have won at least one tournament");
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    System.out.print(rs.getString(i) + " ");
                    i++;
                }
                System.out.println(rs.getString(i) + " ");

            }
            db.close();
            rs.close();
            st.close();
            System.out.println("Press enter to go back to the menu.");
            System.in.read();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public void numberOfPlayers()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try
        {
            Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select teams.name, count(teamname)\n"
                    + "from playson, teams\n"
                    + "where teamname = teams.name\n"
                    + "group by teams.name\n"
                    + "order by teams.name");
            System.out.println("These are the team names followed by the number of players on each team:");
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    System.out.print(rs.getString(i) + " ");
                    i++;
                }
                System.out.println(rs.getString(i) + " ");

            }
            db.close();
            rs.close();
            st.close();
            System.out.println("Press enter to go back to the menu.");
            System.in.read();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public void teamsWith()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }

        try
        {
            Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);
            Scanner input = new Scanner(System.in);
            System.out.println("Input minimum number of teams participating:");
            int j = input.nextInt();
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select name from tournaments where \"Number of teams\" >= (" + j + ")");
            System.out.println("This is the tournaments in which there's more than " + j + " participating teams:");
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    System.out.print(rs.getString(i) + " ");
                    i++;
                }
                System.out.println(rs.getString(i) + " ");

            }
            db.close();
            rs.close();
            st.close();
            System.out.println("Press enter to go back to the menu.");
            System.in.read();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public void teamsWith1()
    {
        Scanner input = new Scanner(System.in);
        try
        {
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
        try
        {
            Connection db = DriverManager.getConnection(dburl, dbusername, dbpassword);
            System.out.println("Input minimum number of teams participating:");
            int j = input.nextInt();
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select tournaments.name\n"
                    + "from participatesin, tournaments\n"
                    + "where tournamentname = tournaments.name\n"
                    + "group by tournaments.name\n"
                    + "having count(tournamentname) >= " + j + "\n"
                    + "order by tournaments.name");
            System.out.println("This is the tournaments in which there's more than " + j + " participating teams:");
            while (rs.next())
            {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount())
                {
                    System.out.print(rs.getString(i) + " ");
                    i++;
                }
                System.out.println(rs.getString(i) + " ");

            }
            db.close();
            rs.close();
            st.close();
            System.out.println("Press enter to go back to the menu.");
            System.in.read();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}*/
