package Starter;


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
 * Starter class Used to start the program. 
 * extends Application
 * @author Gruppe10
 */
public class Starter extends Application 
{

    /**
     * Starter Method for our program.
     * Calls Facade Constructors and Inject Methods. Starts the program.
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception 
    {
        
        IData Data = new DataFacade();
        IBusiness Business = new BusinessFacade();
        IPresentation UI = PresentationFacade.getUI(); //new PresentationFacade();
                
        Business.injectData(Data);
        UI.injectBusiness(Business);
        UI.start();
        // Sagsbehandler: tota // abcabc
        // Admin: admin // 12345
        // Borger: borgar30 // 12345
        // Sekratær: ras // rass

    }

    /**
     * Main Method.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }

}
