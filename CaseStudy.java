/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Resal
 */
public class CaseStudy extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        homeBaseBase root = new homeBaseBase();
        Scene scene = new Scene(root);
        handler hand = new handler(stage, root);
        switches s=new switches(stage, root);
        s.switchToHime();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
