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
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class caseComment implements Initializable {

    @FXML
    private Label AdminIDLabel;
    @FXML
    private Button backButton;
    @FXML
    private Button saveButton;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOnAction(ActionEvent event) {
    }

    @FXML
    private void saveOnAction(ActionEvent event) {
    }

    
}
