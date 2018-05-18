/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

/**
 *
 * @author Mads Obel Jensen
 */
import Aquaintance.IBusiness;
import Aquaintance.IData;
import Aquaintance.IPresentation;
import Business.BusinessFacade;
import Data.DataFacade;
import Presentation.PresentationFacade;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author Obel
 */
public class Starter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        IData Data = new DataFacade();
        IBusiness Business = new BusinessFacade();
        IPresentation UI = new PresentationFacade();

        Business.injectData(Data);
        UI.injectBusiness(Business);
        UI.start();
        //Data.getCase();
        Business.getCase();
        //String eba = "test";
        //System.out.println(eba.equals("Sagsbehandler"));
        //System.out.println(UI.getAddresse());
        //System.out.println(Data.sendQueryTest("SELECT type FROM users WHERE username = 'tota' AND password = 'abcabc'"));
        // Sagsbehandler: tota // abcabc
        // Admin: admin // 12345
        // Borger: borgar30 // 12345

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
