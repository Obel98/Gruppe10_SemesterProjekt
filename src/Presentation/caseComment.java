package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller caseComment class
 * Used to handle the caseComment screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class caseComment implements Initializable 
{

    //Attributes of the caseComment controller class.
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
     * Handles the backOn action
     * No implemetation.
     * @param event
     */
    @FXML
<<<<<<< Updated upstream
    private void backOnAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();

=======
    private void backOnAction(ActionEvent event) 
    {
>>>>>>> Stashed changes
    }

    /**
     * Handles the saveOn action
     * No implemetation.
     * @param event
     */
    @FXML
    private void saveOnAction(ActionEvent event) 
    {
    }

    /**
     * Handles the saveDraftOn action
     * No implemetation.
     * @param event
     */
    @FXML
    private void saveDraftOnAction(ActionEvent event) 
    {
    }

    /**
     * Handles the attachFileOn action
     * No implemetation.
     * @param event
     */
    @FXML
    private void attachFileOnAction(ActionEvent event) 
    {
    }

}
