package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import sample.model.Computer;

import java.io.IOException;

public class SetShipsOnBoardWindowController {
    
    public Button StartButton;
    public Button resetButton;
    public Button AutoButton;
    public ToggleButton toggle_easy;
    public ToggleButton toggle_hard;

    public void resetButtonPressed(ActionEvent actionEvent) {
    }

    public void startButtonPressed(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("fxml/GameWindow.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();


    }

    public void autoButtonPressed(ActionEvent actionEvent) {

    }

    public void easypressed(ActionEvent actionEvent) {
    }

    public void hardpressed(ActionEvent actionEvent) {
    }
}
