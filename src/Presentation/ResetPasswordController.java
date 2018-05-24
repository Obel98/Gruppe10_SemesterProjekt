/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import Business.PasswordGenerator;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class ResetPasswordController implements Initializable {

    @FXML
    private Button RestButton;
    @FXML
    private Button backButton;
    @FXML
    private Label invalidUserName;
    @FXML
    private TextField UserNameTextField;
    @FXML
    private Label InvaldInputLabel;
    @FXML
    private PasswordField password2;
    @FXML
    private PasswordField password1;
    PasswordGenerator pg = new PasswordGenerator();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ResetButtonOnAction(ActionEvent event) {
        if (password1.equals(password2)) {
            Stage stage = (Stage) RestButton.getScene().getWindow();
            stage.close();

        }
    }

    @FXML
    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void pressEnter(KeyEvent event) {

    }

    @FXML
    private void userNameOnAction(ActionEvent event) {
    }
}
