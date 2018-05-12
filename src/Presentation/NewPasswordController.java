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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author borga
 */
public class NewPasswordController implements Initializable {

    @FXML
    private TextField UserNameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button okButton1;
    @FXML
    private Button backButton;

    @FXML
    private Label invalidUserName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void userNameOnAction(ActionEvent event) {

    }

    @FXML
    private void passwortOutputOnAction(ActionEvent event) {
    }

    @FXML
    private void okButtonOnAction(ActionEvent event) {
        if ("admin".equals(UserNameTextField.getText())) {
            passwordTextField.setText("admin");
            invalidUserName.setText("");
        } else {
            invalidUserName.setText("Inncorrect username, Try again!");
            invalidUserName.setTextFill(Color.rgb(210, 39, 30));
        }
    }

    @FXML
    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

}
