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
    private Button saveDraftButton;
    @FXML
    private Button attachFileButton;
    @FXML
    private TextArea commentTextArea;

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

    @FXML
    private void saveDraftOnAction(ActionEvent event) {
    }

    @FXML
    private void attachFileOnAction(ActionEvent event) {
    }

}
