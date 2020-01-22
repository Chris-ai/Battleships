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
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainController implements Initializable {

    public Button button_start_game;
    public Button button_exit;
    public TextField nickname;

    private PlayerModel Player;



    public void StartGameButtonPressed(ActionEvent actionEvent) throws IOException {


        if (nickname.getText().isEmpty()) {
            AlertBox.display("Error", "Nazwa użytkownika jest wymagana!");
        } else {


            try {
                Player = new PlayerModel(nickname.getText());
                Stage st = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/SetShipsOnBoardWindow.fxml"));

                Parent sceneMain = loader.load();

                SetShipsOnBoardWindowController controller = loader.<SetShipsOnBoardWindowController>getController();
                controller.setPlayer(Player);

                Scene scene = new Scene(sceneMain);
                st.setScene(scene);
                st.setMaximized(false);
                st.setTitle("My App");
                st.show();
            } catch (IOException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

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
