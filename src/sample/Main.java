package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/sample.fxml"));
        primaryStage.setTitle("Battleships");
        Scene Scene = new Scene(root);
        Scene.getStylesheets().addAll(this.getClass().getResource("stylesheet.css").toExternalForm());
        primaryStage.setScene(Scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
