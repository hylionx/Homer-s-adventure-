/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author HYLIA
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        SwitchStage mystage = new SwitchStage("view/home.fxml");
        mystage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
