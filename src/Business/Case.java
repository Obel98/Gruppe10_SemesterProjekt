package Business;

public class Case implements Aquaintance.ICase {

    private int ID;
    private String firtName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int birthday;
    private int CPR;
    private String addresse;
    private String journal;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getFirtName() {
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
    public String getJournal() {
        return journal;
    }
}
