package Presentation;

import Aquaintance.IBusiness;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import Aquaintance.IPresentation;
import Data.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller AdminFXML class
 * Used to handle the Admin homescreen.
 * implements Initializable
 * @author Gruppe 10.
 */
public class AdminFXML implements Initializable 
{

    //Attributes of the Admin controller class.
    private IBusiness business;
    private IPresentation UI;

    @FXML
    private Button logOutButton;
    @FXML
    private TableColumn<User, String> firstNameTableColumn;
    @FXML
    private TableColumn<?, ?> lastNameTableColumn;
    @FXML
    private TableColumn<?, ?> addressTableColumn;
    @FXML
    private TableColumn<?, ?> emailTableColumn;
    @FXML
    private TableColumn<?, ?> TypeTableColumn;
    @FXML
    private TableColumn<?, ?> usernameTableColumn;
    @FXML
    private TableColumn<?, ?> CPRTableColumn;
    @FXML
    private TableColumn<?, ?> phonenumberTableColumn;
    @FXML
    private TableColumn<?, ?> birthdayTableColumn;
    @FXML
    private Label AdminIDLabel;
    @FXML
    private MenuItem menuButton;
    @FXML
    private TextField searchTextField;
    @FXML
    private Button searchButton;
    @FXML
    private Button addUserButton;
    @FXML
    private Button editUserButton;
    @FXML
    private Button deleteUserButton;
    @FXML
    private TableView<User> tableIDTableView;

    /**
     * Constructor for AdminFXML
     */
    public AdminFXML() 
    {
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }

    /**
     * Handles the logout action
     * Shows logInScreen.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void logOutOnAction(ActionEvent event) throws IOException 
    {
        /*Parent root = FXMLLoader.load(getClass().getResource("FXML/LogInScreen.fxml"));

        Scene logIn = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(logIn);
        stage.show(); */
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/LogInScreen.fxml"));
            Pane root = loader.load();
            LogInScreenController controller = loader.getController();
            controller.injectBusiness(business);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene logIn = new Scene(root);

            stage.setScene(logIn);
            stage.show();
            stage.setResizable(false);
        } catch (IOException ex) {
            Logger.getLogger(PresentationFacade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the changePassword action
     * Shows ResetPassword.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void changePassword(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/ResetPassword.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(menuButton.getParentPopup().getOwnerWindow());
        stage.showAndWait();
    }

    /**
     * Inject Method for Business
     * @param business Sets the businessLayer to use.
     */
    public void injectBusiness(IBusiness business) 
    {
        this.business = business;
    }

    //no implementation.
    @FXML
    private void searchOnAction(ActionEvent event) 
    {
    }

    /**
     * Handles the addUser action
     * Shows addUser.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void addUserOnAction(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/addUser.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(addUserButton.getScene().getWindow());
        stage.showAndWait();
    }

    /**
     * Handles the editUser action
     * Shows editUser.fxml on use
     * @param event
     * @throws IOException
     */
    @FXML
    private void editUserOnAction(ActionEvent event) throws IOException 
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/editUser.fxml"));
        Stage stage = new Stage();
        Parent root = loader.load();
        stage.setScene((new Scene(root)));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(editUserButton.getScene().getWindow());
        stage.showAndWait();
    }

    public TableColumn<User, String> getFirstNameTableColumn() {
        return firstNameTableColumn;
    }

    public void setFirstNameTableColumn(TableColumn<User, String> firstNameTableColumn) {
        this.firstNameTableColumn = firstNameTableColumn;
    }

    public TableColumn<?, ?> getLastNameTableColumn() {
        return lastNameTableColumn;
    }

    public void setLastNameTableColumn(TableColumn<?, ?> lastNameTableColumn) {
        this.lastNameTableColumn = lastNameTableColumn;
    }

    public TableColumn<?, ?> getAddressTableColumn() {
        return addressTableColumn;
    }

    public void setAddressTableColumn(TableColumn<?, ?> addressTableColumn) {
        this.addressTableColumn = addressTableColumn;
    }

    public TableColumn<?, ?> getEmailTableColumn() {
        return emailTableColumn;
    }

    public void setEmailTableColumn(TableColumn<?, ?> emailTableColumn) {
        this.emailTableColumn = emailTableColumn;
    }

    public TableColumn<?, ?> getTypeTableColumn() {
        return TypeTableColumn;
    }

    public void setTypeTableColumn(TableColumn<?, ?> typeTableColumn) {
        TypeTableColumn = typeTableColumn;
    }

    public TableColumn<?, ?> getUsernameTableColumn() {
        return usernameTableColumn;
    }

    public void setUsernameTableColumn(TableColumn<?, ?> usernameTableColumn) {
        this.usernameTableColumn = usernameTableColumn;
    }

    public TableColumn<?, ?> getCPRTableColumn() {
        return CPRTableColumn;
    }

    public void setCPRTableColumn(TableColumn<?, ?> CPRTableColumn) {
        this.CPRTableColumn = CPRTableColumn;
    }

    public TableColumn<?, ?> getPhonenumberTableColumn() {
        return phonenumberTableColumn;
    }

    public void setPhonenumberTableColumn(TableColumn<?, ?> phonenumberTableColumn) {
        this.phonenumberTableColumn = phonenumberTableColumn;
    }

    public TableColumn<?, ?> getBirthdayTableColumn() {
        return birthdayTableColumn;
    }

    public void setBirthdayTableColumn(TableColumn<?, ?> birthdayTableColumn) {
        this.birthdayTableColumn = birthdayTableColumn;
    }

    public TableView<User> getTableIDTableView() {
        return tableIDTableView;
    }

    public void setTableIDTableView(TableView<User> tableIDTableView) {
        this.tableIDTableView = tableIDTableView;
    }
}
