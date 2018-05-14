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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ResetButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void backOnAction(ActionEvent event) {
    }

    @FXML
    private void pressEnter(KeyEvent event) {
    }

    @FXML
    private void userNameOnAction(ActionEvent event) {
    }
    
}
