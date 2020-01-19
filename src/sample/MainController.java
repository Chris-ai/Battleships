package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {
    public Button button_start_game;
    public Button button_exit;
    public Button button_about;

    public void StartGameButtonPressed(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/GameWindow.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void AboutButtonPressed(ActionEvent actionEvent) {
    }

    public void ExitButtonPressed(ActionEvent actionEvent) {
        Stage stage = (Stage) button_exit.getScene().getWindow();
        stage.close();
    }
}
