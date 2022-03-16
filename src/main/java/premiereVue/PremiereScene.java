package premiereVue;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class PremiereScene {
    public void start(Stage stage){
        VBox root = new VBox();
        Scene scene = new Scene(root,300,80);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}
