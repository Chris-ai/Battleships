package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.model.PlayerModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public Button button_start_game;
    public Button button_exit;
    public TextField nickname;

    private PlayerModel Player;



    public void StartGameButtonPressed(ActionEvent actionEvent) throws IOException {


        if (nickname.getText().isEmpty()) {
            AlertBox.display("Error", "Nazwa użytkownika jest wymagana!");
        } else {
            Player = new PlayerModel(nickname.getText());
            Parent root = FXMLLoader.load(getClass().getResource("fxml/SetShipsOnBoardWindow.fxml"));
            FXMLLoader fxmlloader = new FXMLLoader();

            fxmlloader.setBuilderFactory(new JavaFXBuilderFactory());
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();

        }
    }



    public void ExitButtonPressed(ActionEvent actionEvent) {

        Stage stage = (Stage) button_exit.getScene().getWindow();
        stage.close();
    }


    public PlayerModel getPlayer() {
        return Player;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
