package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller promptView class
 * Used to handle the promptView screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class promptView implements Initializable 
{

    //Attributes of the promptView controller class.
    @FXML
    private Button yesButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label passwordMsgLabel1;

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
     * Handles the yesOn action
     * No implementation.
     * @param event
     */
    @FXML
    private void yesOnAction(ActionEvent event) 
    {
    }

    /**
     * Handles the cancelOn action
     * No implementation.
     * @param event
     */
    @FXML
    private void cancelOnAction(ActionEvent event) 
    {
    }

}
