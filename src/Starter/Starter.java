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
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author Obel
 */
public class Starter extends Application
{
    
    @Override
    public void start(Stage stage) throws Exception
    {
        IData Data = new DataFacade();
        IBusiness Business = new BusinessFacade();
        IPresentation UI = new PresentationFacade();
        System.out.println("Borgar er en dejlig mand <3");
        
        Business.injectData(Data);
        UI.injectBusiness(Business);
        UI.start();
        Data.getCase();
        Business.getCase();
        System.out.println(UI.getAddresse());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
