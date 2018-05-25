package Aquaintance;


public interface IData {
    
    ICase getCase(int ID);

    boolean validateUserName(String username);

    boolean validatePassword(String username, String password);

    String getUserType(String username, String password);
    
    void setPassword(String oldPassword, String newPassword);
    
    String showPassword(String username);
    
}
