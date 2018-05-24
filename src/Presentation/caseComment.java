package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ProjektGruppe 10.
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
