package Data;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String type;
    private String username;
    private int CPR;
    private int phonenumber;
    private int birthday;

    public User(){
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.email = "";
        this.type = "";
        this.username = "";
        this.CPR = 0;
        this.phonenumber = 0;
        this.birthday = 0;

    }
    public User(String firstName, String lastName, String address, String email, String type, String username, int CPR, int phonenumber, int birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.type = type;
        this.username = username;
        this.CPR = CPR;
        this.phonenumber = phonenumber;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
}
