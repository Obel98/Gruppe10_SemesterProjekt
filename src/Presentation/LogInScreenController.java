package Presentation;

import Aquaintance.IBusiness;
import Aquaintance.IPresentation;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller LogInScreenController class
 * Used to handle the LogIn screen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class LogInScreenController implements Initializable 
{

    //Attributes of the LogInScreenController class.
    private IPresentation UI;
    private IBusiness Business;

    @FXML
    private PasswordField PasswordBox;
    @FXML
    private TextField UsernameBox;
    @FXML
    private Button LogOnButton;
    @FXML
    private Button ResetPasswordButton;
    @FXML
    private Label passwordMsgLabel;

    /**
     * Initializes the LogInScreenController class.
     * Sets the UI attribute to the PresentationFacade.
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        UI = PresentationFacade.getUI();
    }

    /**
     * Handles the ResetPassword action
     * Shows ForgotPassword.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void ResetPasswordAction(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/ForgotPassword.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(ResetPasswordButton.getScene().getWindow());
        stage.showAndWait();
    }

    /**
     * Inject Method for Business
     * @param business Sets the businessLayer to use.
     */
    public void injectBusiness(IBusiness business) 
    {
        this.Business = business;
    }

    /**
     * Handles the pressEnter action
     * Checks LogIn information and shows the FXML scene associated with the Type of the User.
     * @param event
     * @throws IOException
     */
    @FXML
    private void pressEnter(KeyEvent event) throws IOException
    {
        if (event.getCode().equals(KeyCode.ENTER))
        {
            String username = UsernameBox.getText();

            if (UI.validateUsername(username))
            {
                String password = PasswordBox.getText();
                if (UI.validatePassword(username, PasswordBox.getText()))
                {
                    if (UI.getUserType(username, password).equals("[Sagsbehandler]"))
                    {

                        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/CaseWorkerHomeFXML.fxml"));
                        Pane homeRoot = loader.load();
                        CaseWorkerHomeFXMLController controller = loader.getController();
                        controller.injectBusiness(Business);
                        Scene home = new Scene(homeRoot);
                        Stage appStage = new Stage();
                        appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        appStage.setResizable(true);
                        appStage.setScene(home);
                        appStage.show();
                    }
                    if (UI.getUserType(username, password).equals("[Admin]"))
                    {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AdminFXML.fxml"));
                        Pane homeRoot = loader.load();
                        AdminFXML controller = loader.getController();
                        controller.injectBusiness(Business);
                        Scene caseWorkerHome = new Scene(homeRoot);
                        Stage appStage = new Stage();
                        appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        appStage.setResizable(true);
                        appStage.setScene(caseWorkerHome);
                        appStage.show();
                    }
                    if (UI.getUserType(username, password).equals("[Sekretær]"))
                    {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/SecretaryHomeFXML.fxml"));
                        Pane root = loader.load();
                        SecretaryHomeFXMLController controller = loader.getController();
                        controller.injectBusiness(Business);
                        Scene secHome = new Scene(root);
                        Stage stage = new Stage();
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setResizable(true);
                        stage.setScene(secHome);
                        stage.show();
                    }
                    if (UI.getUserType(username, password).equals("[Borger]"))
                    {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/citizenHome.fxml"));
                        Pane root = loader.load();
                        citizenHomeController controller = loader.getController();
                        controller.injectBusiness(Business);
                        Scene secHome = new Scene(root);
                        Stage stage = new Stage();
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setResizable(true);
                        stage.setScene(secHome);
                        stage.show();

                    }
                    if (UI.getUserType(username, password).equals("[Fag]"))
                    {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/Rasmus.fxml"));
                    Pane root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setResizable(false);
                    stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    stage.setScene(scene);
                    stage.setFullScreen(true);
                    stage.show();
                    stage.setOnCloseRequest(new EventHandler<WindowEvent>()
                    {
                        @Override
                        public void handle(WindowEvent event)
                        {
                            event.consume();
                        }
                    });
                    }
                }
                else
                {
                    passwordMsgLabel.setText("Incorrect password or username, Try again!");
                    passwordMsgLabel.setTextFill(Color.rgb(210, 39, 30));
                    System.out.println("inderste");
                }

            }
            else
            {
                passwordMsgLabel.setText("Incorrect password or username, Try again!");
                passwordMsgLabel.setTextFill(Color.rgb(210, 39, 30));
                System.out.println("midsterste");
            }
        }
    }

    /**
     * Handles the LogOnButton action
     * Checks LogIn information and shows the FXML scene associated with the Type of the User.
     * @param event
     * @throws IOException
     */
    @FXML
    private void LogOnButtonAction(ActionEvent event) throws IOException
    {
        String username = UsernameBox.getText();

        if (UI.validateUsername(username))
        {
            String password = PasswordBox.getText();
            if (UI.validatePassword(username, PasswordBox.getText()))
            {
                if (UI.getUserType(username, password).equals("[Sagsbehandler]"))
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/CaseWorkerHomeFXML.fxml"));
                    Pane homeRoot = loader.load();
                    CaseWorkerHomeFXMLController controller = loader.getController();
                    controller.injectBusiness(Business);
                    Scene home = new Scene(homeRoot);
                    Stage appStage = new Stage();
                    appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setResizable(true);
                    appStage.setScene(home);
                    appStage.show();
                }
                if (UI.getUserType(username, password).equals("[Admin]"))
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AdminFXML.fxml"));
                    Pane homeRoot = loader.load();
                    AdminFXML controller = loader.getController();
                    controller.injectBusiness(Business);
                    Scene caseWorkerHome = new Scene(homeRoot);
                    Stage appStage = new Stage();
                    appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setResizable(true);
                    appStage.setScene(caseWorkerHome);
                    appStage.show();
                }
                if (UI.getUserType(username, password).equals("[Sekretær]"))
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/SecretaryHomeFXML.fxml"));
                    Pane root = loader.load();
                    SecretaryHomeFXMLController controller = loader.getController();
                    controller.injectBusiness(Business);
                    Scene secHome = new Scene(root);
                    Stage stage = new Stage();
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setResizable(true);
                    stage.setScene(secHome);
                    stage.show();
                }
                if (UI.getUserType(username, password).equals("[Borger]"))
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/citizenHome.fxml"));
                    Pane root = loader.load();
                    citizenHomeController controller = loader.getController();
                    controller.injectBusiness(Business);
                    Scene secHome = new Scene(root);
                    Stage stage = new Stage();
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setResizable(true);
                    stage.setScene(secHome);
                    stage.show();
                }
                if (UI.getUserType(username, password).equals("[Fag]"))
                {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/Rasmus.fxml"));
                    Pane root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setResizable(false);
                    stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
                    stage.setScene(scene);
                    stage.setFullScreen(true);
                    stage.show();
                    stage.setOnCloseRequest(new EventHandler<WindowEvent>()
                    {
                        @Override
                        public void handle(WindowEvent event)
                        {
                            event.consume();
                        }
                    });
                }
                else
                {
                    passwordMsgLabel.setText("Incorrect password or username, Try again!");
                    passwordMsgLabel.setTextFill(Color.rgb(210, 39, 30));
                }

            }
        }
    }

}
