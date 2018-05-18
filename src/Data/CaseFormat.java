/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;

/**
 *
 * @author borga
 */
public class CaseFormat implements ICase {

    private int ID;
    private String firtName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int birthday;
    private int CPR;
    private String addresse;
    private String journal;
    private String status;

    public CaseFormat(int ID, String firtName, String lastName, int phoneNumber, String email, int birthday, int CPR, String addresse, String journal, String status) {
        this.ID = ID;
        this.firtName = firtName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.CPR = CPR;
        this.addresse = addresse;
        this.journal = journal;
        this.status = status;
    }

    @Override
    public String toString() {
        return "JournalFormat{" + "ID=" + ID + ", firtName=" + firtName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", birthday=" + birthday + ", CPR=" + CPR + ", addresse=" + addresse + ", journal=" + journal + ", status=" + status + '}';
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getFirstName() {
        return firtName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getBirthday() {
        return birthday;
    }

    @Override
    public int getCPR() {
        return CPR;
    }

    @Override
    public String getAddresse() {
        return addresse;
    }

    @Override
    public String getCommentar() {
        return journal;
    }

    @Override
    public String getStatus(){ return status;}
    
}
