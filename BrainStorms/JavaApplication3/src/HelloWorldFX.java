import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {
    @Override
    public void start(Stage stage) {
        Button btn = new Button("Click Me");
        Scene scene = new Scene(btn, 300, 200);
        stage.setTitle("JavaFX Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
