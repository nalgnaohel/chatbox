package chatbox;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/chatbox.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 500.0, 700.0);

        primaryStage.setTitle("ChatBox");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setOnCloseRequest(
                event -> {
                    Platform.exit();
                    System.exit(0);
                });

        primaryStage.show();
    }
}