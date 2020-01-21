package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.model.PlayerModel;

import java.io.IOException;

public class MainController {

    public Button button_start_game;
    public Button button_exit;
    public Label nickname;


    public void StartGameButtonPressed(ActionEvent actionEvent) throws IOException {

        if(nickname.getText().isEmpty()) {

            
        } else {
            Parent root = FXMLLoader.load(getClass().getResource("fxml/SetShipsOnBoardWindow.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();

            PlayerModel newPlayer = new PlayerModel(nickname.getText(), 0, 0);
        }

    }

    public void ExitButtonPressed(ActionEvent actionEvent) {

        Stage stage = (Stage) button_exit.getScene().getWindow();
        stage.close();
    }
}
