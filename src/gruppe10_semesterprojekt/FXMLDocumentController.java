/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppe10_semesterprojekt;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author Obel
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField PasswordBox;

    @FXML
    private TextField UsernameBox;

    @FXML
    private Button LogOnButton;

    @FXML
    private Button ResetPasswordButton;

    @FXML
    void LogOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}



