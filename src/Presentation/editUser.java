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
 * FXML Controller editUser class
 * Used to handle the editUser screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class editUser implements Initializable 
{

    //Attributes of the editUser controller class.
    @FXML
    private Label AdminIDLabel;
    @FXML
    private Button backButton;
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
    private Button SaveButton;

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
