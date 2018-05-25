package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller addUser class
 * Used to handle the addUser screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class addUser implements Initializable 
{

    //Attributes of the addUser controller class.
    @FXML
    private TextField TempCodeTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField phonenumberTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField CPRTextField;
    @FXML
    private TextField dateOfBirthTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private MenuButton typeMenuButton;
    @FXML
    private Label AdminIDLabel1;
    @FXML
    private Button SaveButton;
    @FXML
    private Button backButton;

    /**
     * Initializes the Admin controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }

    /**
     * Handles the backOn action
     * Closes the scene.
     * @param event
     */
    @FXML
    private void backOnAction(ActionEvent event) 
    {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    /**
     * Handles the SaveOn action
     * Closes the scene.
     * @param event
     */
    @FXML
    private void SaveOnAction(ActionEvent event) 
    {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();

        //todo need logic for saving
    }

}
