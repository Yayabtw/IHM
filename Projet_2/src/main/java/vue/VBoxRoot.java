package vue;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.DateCalendrier;

import java.io.File;


public class VBoxRoot {
    public void start(Stage stage){
        VBox root = new VBox(10);

        Label labelToday = new Label(DateCalendrier.toString());
        Label labelTomorrow = new Label(DateCalendrier.dateLendemain().toString());
        root.getChildren().addAll(labelToday, labelTomorrow);

        Scene scene = new Scene(root,300,80);

        stage.setScene(scene);
        stage.setTitle("PremiersElementsGraphiques");
        stage.show();

    }
    public VBoxRoot(){
        Label labelToday = new Label();
        this.getChildren().add(labelToday)
    }
}
