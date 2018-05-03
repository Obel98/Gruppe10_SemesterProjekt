/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author borga
 */
public class JournalFormat {

    private int ID;
    private String firtName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int birthday;
    private int CPR;
    private String addresse;
    private String journal;

    public JournalFormat(int ID, String firtName, String lastName, int phoneNumber, String email, int birthday, int CPR, String addresse, String journal) {
        this.ID = ID;
        this.firtName = firtName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.CPR = CPR;
        this.addresse = addresse;
        this.journal = journal;
    }

    @Override
    public String toString() {
        return "JournalFormat{" + "ID=" + ID + ", firtName=" + firtName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", birthday=" + birthday + ", CPR=" + CPR + ", addresse=" + addresse + ", journal=" + journal + '}';
    }
    
    
}
