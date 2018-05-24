/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author borga
 */
public class Case implements ICase {

    private int ID;
    private String firtName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String birthday;
    private int CPR;
    private String address;
    private String journal;
    private String status;
    private String date;
    private String userName;

    public Case(int ID) {
        String[] result0 = new String[4];
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection("jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn", "jkclsvjn", "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1");
                Statement st = db.createStatement();
                ResultSet rs = st.executeQuery("Select * from casefile where caseID = '" + ID + "'");) {
            while (rs.next()) {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount()) {
                    //System.out.print(rs.getString(i) + " ");
                    result0[i - 1] = (rs.getString(i));
                    i++;
                }
                //System.out.println(rs.getString(i) + " ");
                result0[i - 1] = (rs.getString(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        this.ID = ID;
        this.date = result0[1];
        this.userName = result0[2];

        String[] result01 = new String[10];
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        try (Connection db = DriverManager.getConnection("jdbc:postgresql://elmer.db.elephantsql.com:5432/jkclsvjn", "jkclsvjn", "5vckjZ8LGdP6g2S6eHLeP5w34mASozc1");
                Statement st = db.createStatement();
                ResultSet rs = st.executeQuery("Select firstname, lastname, telephonenumber, email, birthday, cpr, address from users where username = '" + userName + "'");) {
            while (rs.next()) {
                int i = 1;
                while (i < rs.getMetaData().getColumnCount()) {
                    //System.out.print(rs.getString(i) + " ");
                    result01[i - 1] = (rs.getString(i));
                    i++;
                }
                //System.out.println(rs.getString(i) + " ");
                result01[i - 1] = (rs.getString(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        this.firtName = result01[0];
        this.lastName = result01[1];
        this.phoneNumber = Integer.parseInt(result01[2]);
        this.email = result01[3];
        this.birthday = result01[4];
        this.CPR = Integer.parseInt(result01[5]);
        this.address = result01[6];
        this.journal = result0[3];
        this.status = "Under behandling";
    }

    public String getJournal() {
        return journal;
    }

    @Override
    public String toString() {
        return "JournalFormat{" + "ID=" + ID + ", firtName=" + firtName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", birthday=" + birthday + ", CPR=" + CPR + ", addresse=" + address + ", journal=" + journal + ", status=" + status + '}';
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getCPR() {
        return CPR;
    }

    public String getStatus() {
        return status;
    }

    public ICase getCase() {
        return this;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }

}
