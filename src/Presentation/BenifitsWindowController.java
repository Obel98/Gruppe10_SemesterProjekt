package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller BenifitsWindowController class
 * Used to handle the Benefits Window.
 * implements Initializable
 * @author Gruppe 10.
 */
public class BenifitsWindowController implements Initializable 
{

    //Attributes of the BenifitsWindowController class.
    @FXML
    private Button backButton;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private Button saveButton;

    /**
     * Initializes the BenifitsWindowController class.
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
     * Handles the saveOn action
     * No implementation
     * @param event
     */
    @FXML
    private void saveOnAction(ActionEvent event) 
    {
    }

}
