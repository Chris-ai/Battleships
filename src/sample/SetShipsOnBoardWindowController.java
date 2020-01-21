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
    public ToggleButton toogle_vertical;
    public ToggleButton toggle_horizontal;


    public Button but00;    public Button but01;
    public Button but02;    public Button but03;
    public Button but04;    public Button but05;
    public Button but06;    public Button but07;
    public Button but08;    public Button but09;

    public Button but10;    public Button but11;
    public Button but12;    public Button but13;
    public Button but14;    public Button but15;
    public Button but16;    public Button but17;
    public Button but18;    public Button but19;

    public Button but20;    public Button but21;
    public Button but22;    public Button but23;
    public Button but24;    public Button but25;
    public Button but26;    public Button but27;
    public Button but28;    public Button but29;

    public Button but30;    public Button but31;
    public Button but32;    public Button but33;
    public Button but34;    public Button but35;
    public Button but36;    public Button but37;
    public Button but38;    public Button but39;

    public Button but40;    public Button but41;
    public Button but42;    public Button but43;
    public Button but44;    public Button but45;
    public Button but46;    public Button but47;
    public Button but48;    public Button but49;

    public Button but50;    public Button but51;
    public Button but52;    public Button but53;
    public Button but54;    public Button but55;
    public Button but56;    public Button but57;
    public Button but58;    public Button but59;

    public Button but60;    public Button but61;
    public Button but62;    public Button but63;
    public Button but64;    public Button but65;
    public Button but66;    public Button but67;
    public Button but68;    public Button but69;

    public Button but70;    public Button but71;
    public Button but72;    public Button but73;
    public Button but74;    public Button but75;
    public Button but76;    public Button but77;
    public Button but78;    public Button but79;

    public Button but80;    public Button but81;
    public Button but82;    public Button but83;
    public Button but84;    public Button but85;
    public Button but86;    public Button but87;
    public Button but88;    public Button but89;

    public Button but90;    public Button but91;
    public Button but92;    public Button but93;
    public Button but94;    public Button but95;
    public Button but96;    public Button but97;
    public Button but98;    public Button but99;

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

    public void Horizontal(ActionEvent actionEvent) {
    }

    public void Vertical(ActionEvent actionEvent) {
    }

    public void BoardButtonPressed(ActionEvent actionEvent) {
    }
}
