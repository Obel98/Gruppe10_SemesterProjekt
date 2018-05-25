package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller ForgotPasswordController class
 * Used to handle Forgot Password.
 * implements Initializable
 * @author Gruppe 10.
 */
public class ForgotPasswordController implements Initializable 
{

    private IBusiness Business;
    private IPresentation UI;

    //Attributes of the ForgotPasswordController class.
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button backButton;
    @FXML
    private Label invalidUserName;
    @FXML
    private Button okButton;

    /**
     * Initializes the ForgotPasswordController class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UI = PresentationFacade.getUI();
    }

    public void injectBusiness(IBusiness business) {
        this.Business = business;
    }

    /**
     * Handles the okButton action
     * To be changed.
     * @param event
     */
    @FXML
    private void okButtonOnAction(ActionEvent event) {
        if (UI.validateUsername(usernameTextField.getText())) {
            passwordTextField.setText(UI.showPassword(usernameTextField.getText()));
            invalidUserName.setText("");
            
        } else {
            invalidUserName.setText("Inncorrect username, Try again!");
            invalidUserName.setTextFill(Color.rgb(210, 39, 30));
            passwordTextField.setText("");
        }
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
     * Handles the pressEnter action
     * To be changed.
     * @param event
     */
    @FXML
    private void pressEnter(KeyEvent event) 
    {
        if (event.getCode().equals(KeyCode.ENTER)) {
            if (UI.validateUsername(usernameTextField.getText())) {
                passwordTextField.setText(UI.showPassword(usernameTextField.getText()));
                invalidUserName.setText("");
            } else {
                invalidUserName.setText("Inncorrect username, Try again!");
                invalidUserName.setTextFill(Color.rgb(210, 39, 30));
                passwordTextField.setText("");
            }
        }
    }
}
