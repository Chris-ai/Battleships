package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.model.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SetShipsOnBoardWindowController implements Initializable {
    
    public Button StartButton;
    public Button resetButton;
    public Button AutoButton;
    public ToggleButton toggle_vertical;
    public ToggleButton toggle_horizontal;

    private final ToggleGroup group = new ToggleGroup();
    public GridPane PlayerBoard;

    private PlayerModel player;
    private BoardModel PlayerTable;
    private Button[][] buttonArray;
    private Strategy Strategy;

    public Button but00, but01,but02,but03,but04,but05,but06,but07,but08,but09,but10
    ,but11, but12, but13,but14,but15, but16,but17,but18,but19,but20
    ,but21,but22,but23,but24,but25,but26,but27,but28,but29,but30
    ,but31,but32,but33,but34,but35, but36, but37,but38,but39,but40, but41, but42, but43, but44,but45,but46, but47, but48,but49,but50,but51, but52,but53,but54,but55, but56,but57, but58,but59,but60,but61,but62,
    but63,but64,but65,but66,but67,but68,but69,but70,but71,but72,but73,but74,but75,
    but76,but77,but78,but79,but80,but81,but82,but83,but84,but85,but86,but87,but88,but89,but90,but91,
    but92,but93,but94,but95,but96,but97,but98,but99;


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
        new AutoArrange();
    }

    public void BoardButtonPressed(ActionEvent actionEvent) {

        Toggle selectedToggle = group.getSelectedToggle();
        if (toggle_vertical.equals(selectedToggle)) {

            toggle_vertical.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,null,null)));

        } else if (toggle_horizontal.equals(selectedToggle)) {


            /**
             * Tutaj kod który ustawia vertykalnie
             */

        } else if (toggle_horizontal.equals(selectedToggle)) {

            /**
             * Tutaj kod który ustawia horyzontalnie
             */
            toggle_vertical.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,null,null)));

        } else if (toggle_horizontal.equals(selectedToggle)) {
            toggle_horizontal.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,null,null)));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        int N = 10;
        buttonArray = new Button[N][N];
        toggle_horizontal.setToggleGroup(group);
        toggle_vertical.setToggleGroup(group);



        buttonArray[0][0]= but00; buttonArray[0][1]= but01; buttonArray[0][2]= but02; buttonArray[0][3]= but03;
        buttonArray[0][4]= but04; buttonArray[0][5]= but05; buttonArray[0][6]= but06; buttonArray[0][7]= but07;
        buttonArray[0][8]= but08; buttonArray[0][9]= but09; buttonArray[1][0]= but10; buttonArray[1][1]= but11;
        buttonArray[1][2]= but12; buttonArray[1][3]= but13; buttonArray[1][4]= but14; buttonArray[1][5]= but15;
        buttonArray[1][6]= but16; buttonArray[1][7]= but17; buttonArray[1][8]= but18; buttonArray[1][9]= but19;
        buttonArray[2][0]= but20; buttonArray[2][1]= but21; buttonArray[2][2]= but22; buttonArray[2][3]= but23;
        buttonArray[2][4]= but24; buttonArray[2][5]= but25; buttonArray[2][6]= but26; buttonArray[2][7]= but27;
        buttonArray[2][8]= but28; buttonArray[2][9]= but29; buttonArray[3][0]= but30; buttonArray[3][1]= but31;
        buttonArray[3][2]= but32; buttonArray[3][3]= but33; buttonArray[3][4]= but34; buttonArray[3][5]= but35;
        buttonArray[3][6]= but36; buttonArray[3][7]= but37; buttonArray[3][8]= but38; buttonArray[3][9]= but39;

        buttonArray[4][0]= but40; buttonArray[4][1]= but41; buttonArray[4][2]= but42; buttonArray[4][3]= but43;
        buttonArray[4][4]= but44; buttonArray[4][5]= but45; buttonArray[4][6]= but46; buttonArray[4][7]= but47;
        buttonArray[4][8]= but48; buttonArray[4][9]= but49;
        buttonArray[5][0]= but50; buttonArray[5][1]= but51;  buttonArray[5][2]= but52;        buttonArray[5][3]= but53;        buttonArray[5][4]= but54;        buttonArray[5][5]= but55;
        buttonArray[5][6]= but56; buttonArray[5][7]= but57;   buttonArray[5][8]= but58;        buttonArray[5][9]= but59;        buttonArray[6][0]= but60;        buttonArray[6][1]= but61;
        buttonArray[6][2]= but62; buttonArray[6][3]= but63;  buttonArray[6][4]= but64;        buttonArray[6][5]= but65;        buttonArray[6][6]= but66;        buttonArray[6][7]= but67;
        buttonArray[6][8]= but68; buttonArray[6][9]= but69;    buttonArray[7][0]= but70;        buttonArray[7][1]= but71;
        buttonArray[7][2]= but72; buttonArray[7][3]= but73;        buttonArray[7][4]= but74;        buttonArray[7][5]= but75;
        buttonArray[7][6]= but76; buttonArray[7][7]= but77;        buttonArray[7][8]= but78;        buttonArray[7][9]= but79;        buttonArray[8][0]= but80;
        buttonArray[8][1]= but81; buttonArray[8][2]= but82;        buttonArray[8][3]= but83;        buttonArray[8][4]= but84;
        buttonArray[8][5]= but85; buttonArray[8][6]= but86;        buttonArray[8][7]= but87;        buttonArray[8][8]= but88;
        buttonArray[8][9]= but89; buttonArray[9][0]= but90;        buttonArray[9][1]= but91;        buttonArray[9][2]= but92;
        buttonArray[9][3]= but93; buttonArray[9][4]= but94;        buttonArray[9][5]= but95;        buttonArray[9][6]= but96;
        buttonArray[9][7]= but97; buttonArray[9][8]= but98;        buttonArray[9][9]= but99;

    }
}
