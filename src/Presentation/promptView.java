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

/**
 * FXML Controller class
 *
 * @author rasmu
 */
public class promptView implements Initializable {

    @FXML
    private Button yesButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label passwordMsgLabel1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void yesOnAction(ActionEvent event) {
    }

    @FXML
    private void cancelOnAction(ActionEvent event) {
    }

}
