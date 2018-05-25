package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import Business.PasswordGenerator;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author ProjektGruppe 10.
 */
public class ResetPasswordController implements Initializable
{

    private IBusiness Business;
    private IPresentation UI;

    @FXML
    private Button RestButton;
    @FXML
    private Button backButton;
    @FXML
    private Label invalidUserName;
    @FXML
    private Label InvaldInputLabel;
    PasswordGenerator pg = new PasswordGenerator();
    @FXML
    private TextField oldPasswordField;
    @FXML
    private PasswordField newPasswordFieldRepeat;
    @FXML
    private PasswordField newPasswordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        UI = PresentationFacade.getUI();
    }

    public void injectBusiness(IBusiness business)
    {
        this.Business = business;
    }

    @FXML
    private void ResetButtonOnAction(ActionEvent event)
    {
        if (newPasswordField.getText().equals(newPasswordFieldRepeat.getText()))
        {
            UI.setPassword(oldPasswordField.getText(), newPasswordField.getText());
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void backOnAction(ActionEvent event)
    {
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void pressEnter(KeyEvent event)
    {

    }

    @FXML
    private void userNameOnAction(ActionEvent event)
    {
    }
}
