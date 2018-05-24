package Presentation;

import Aquaintance.IBusiness;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author ProjektGruppe 10.
 */
public class citizenHomeController implements Initializable {

    @FXML
    private Button logOutButton;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private MenuItem menuButton;
    @FXML
    private VBox VBox;
    @FXML
    private Label caseIDLabel;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label PhonenumberLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label caseStatusLabel;
    @FXML
    private Label caseIDLabel1;
    @FXML
    private Label firstNameLabel1;
    @FXML
    private Label lastNameLabel1;
    @FXML
    private Label PhonenumberLabel1;
    @FXML
    private Label emailLabel1;
    @FXML
    private Label caseStatusLabel1;
    @FXML
    private Label caseIDLabel11;
    @FXML
    private Label firstNameLabel11;
    @FXML
    private Label lastNameLabel11;
    @FXML
    private Label PhonenumberLabel11;
    @FXML
    private Label emailLabel11;
    @FXML
    private Label caseStatusLabel11;
    private IBusiness Business;

    /**
     * Initializes the controller class.
     */
    public void injectBusiness(IBusiness business) {
        this.Business = business;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void LogOutAction(ActionEvent event) {
    }

    @FXML
    private void changePassword(ActionEvent event) {
    }

}
