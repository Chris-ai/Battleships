package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import sample.model.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class GameController {

   // to są kolory dla buttonów i labeli, dodajemy je poprzez np. but00.setBackground(missed);
   public static final Background shooted = new Background(new BackgroundFill(Color.LIGHTGREEN,null,null));
   public static final Background missed = new Background(new BackgroundFill(Color.RED,null,null));

   public Label lab00, lab01,lab02, lab03, lab04,lab05,lab06, lab17, lab07, lab08,lab09,
    lab10, lab11, lab12, lab13,lab14,lab15, lab16, lab18, lab19, lab20, lab21, lab22,
    lab23, lab24, lab25, lab26, lab27,lab28,lab38, lab29, lab30, lab31, lab32, lab33,
    lab34, lab35, lab36, lab37, lab39, lab40, lab41, lab42, lab43,lab44, lab45, lab46, lab47, lab48,
    lab49, lab50, lab51, lab52, lab53, lab54,lab55, lab56,lab57, lab58,lab59,lab60, lab61,lab62,
    lab63, lab64, lab65,lab66, lab67, lab68, lab69, lab70, lab71, lab72, lab73, lab74, lab75, lab76, lab77,
    lab78,lab79,lab80, lab81, lab82, lab83, lab84, lab85, lab86, lab88,lab89,lab90, lab91,lab92, lab93,
     lab94, lab95, lab87, lab96, lab97, lab98,lab99;

      private BoardModel board;
      private BoardModel myBoard;
      private Button[][] buttonArray = new Button[10][10];
      private java.awt.Label[][] labelArray = new java.awt.Label[10][10];
      private Computer c;


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

   /**
    * Trzeba poprawić te metody !
    * @param actionEvent
    */

   public void AboutButtonPressed(ActionEvent actionEvent) {
         int i,j;
         int pomX=0;
         int pomY = 0;
         int pomX1=0;
         int pomY1=0;

         for(i = 0; i<10; i++){
            for (j=0;j<10;j++){
               if(actionEvent.getSource()==buttonArray[i][j]){
                  pomX=i;
                  pomY=j;
                  break;

               }

            }
         }
         if (board.getPos(pomX,pomY)!=0){
            buttonArray[pomX][pomY].setTextFill(Color.GREEN);

            checkDamage(pomX,pomY,board);
            Position p = c.easyShot(10);


            if (board.getPos(p.getX(),p.getY())!=0){
               buttonArray[p.getX()][p.getY()].setTextFill(Color.GREEN);
               checkDamage(p.getX(),p.getY(),board);
            }else{
               buttonArray[p.getX()][p.getY()].setTextFill(Color.RED);
            }

         }else{
            buttonArray[pomX][pomY].setTextFill(Color.RED);
            Position p = c.easyShot(10);
            for(i = 0; i<10; i++){

            }
            if (board.getPos(p.getX(),p.getY())!=0){
               buttonArray[p.getX()][p.getY()].setTextFill(Color.GREEN);
               checkDamage(p.getX(),p.getY(),board);
            }else{
               buttonArray[p.getX()][p.getY()].setTextFill(Color.RED);
            }
         }


      }
      public void drown (ShipModel s){
         int n=0;


         if(s.getOrientation()==0){
            for(int k =0;k<s.getLength();k++){

               buttonArray[s.getX()][s.getY()+n].setTextFill(Color.BLUE);
               buttonArray[s.getX()][s.getY()+n].setDisable(true);
               n++;
            }
         }else{
            for(int k =0;k<s.getLength();k++){

               buttonArray[s.getX()+n][s.getY()].setTextFill(Color.BLUE);
               buttonArray[s.getX()+n][s.getY()].setDisable(true);
               n++;
            }


         }
      }
      public void checkDamage(int x, int y, BoardModel board){
         for (ShipModel s:board.getShipList()) {
            if(s.getOrientation()==0){
               if(s.getLength()==3){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()&&y==s.getY()+1)||(x==s.getX()&&y==s.getY()+2)||(x==s.getX()&&y==s.getY()+3)){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
               if(s.getLength()==5){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()&&y==s.getY()+1)||(x==s.getX()&&y==s.getY()+2)||(x==s.getX()&&y==s.getY()+3)||(x==s.getX()&&y==s.getY()+4)||(x==s.getX()&&y==s.getY()+5)){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
               if(s.getLength()==4){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()&&y==s.getY()+1)||(x==s.getX()&&y==s.getY()+2)||(x==s.getX()&&y==s.getY()+3)||(x==s.getX()&&y==s.getY()+4)){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
               if(s.getLength()==2){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()&&y==s.getY()+1)||(x==s.getX()&&y==s.getY()+2)){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }

            }else{
               if(s.getLength()==5){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()+1&&y==s.getY())||(x==s.getX()+2&&y==s.getY())||(x==s.getX()+3&&y==s.getY())||(x==s.getX()+4&&y==s.getY())||(x==s.getX()+5&&y==s.getY())){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
               if(s.getLength()==4){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()+1&&y==s.getY())||(x==s.getX()+2&&y==s.getY())||(x==s.getX()+3&&y==s.getY())||(x==s.getX()+4&&y==s.getY())){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
               if(s.getLength()==3){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()+1&&y==s.getY())||(x==s.getX()+2&&y==s.getY())||(x==s.getX()+3&&y==s.getY())){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
               if(s.getLength()==2){
                  if((x==s.getX()&&y==s.getY())||(x==s.getX()+1&&y==s.getY())||(x==s.getX()+2&&y==s.getY())){
                     s.damageShip();
                     if(s.getDemage()==s.getLength()){
                        drown(s);
                     }
                  }
               }
            }

         }}


      @Override
      public void initialize(URL url, ResourceBundle resourceBundle) {


         ShipModel s = new ShipModel(0,5,3,0,0);
         ShipModel s1 = new ShipModel(1,3,4,0,0);
         ShipModel s2 = new ShipModel(6,5,2,0,1);
         ShipModel s3 = new ShipModel(3,3,5,0,0);
         List<ShipModel> pomShipList = new ArrayList<ShipModel>();
         c = new ComputerModel();
         pomShipList.add(s);
         pomShipList.add(s1);
         pomShipList.add(s2);
         pomShipList.add(s3);

         board =new BoardModel(10, 10, new ManualArrange(),pomShipList);

         board.setShipBoard();

         board.printBoardpom();



         buttonArray[0][0]= but00;  buttonArray[0][1]= but01;        buttonArray[0][2]= but02;        buttonArray[0][3]= but03;
         buttonArray[0][4]= but04;        buttonArray[0][5]= but05;        buttonArray[0][6]= but06;        buttonArray[0][7]= but07;
         buttonArray[0][8]= but08;        buttonArray[0][9]= but09;        buttonArray[1][0]= but10;        buttonArray[1][1]= but11;
         buttonArray[1][2]= but12;        buttonArray[1][3]= but13;        buttonArray[1][4]= but14;        buttonArray[1][5]= but15;
         buttonArray[1][6]= but16;        buttonArray[1][7]= but17;        buttonArray[1][8]= but18;        buttonArray[1][9]= but19;
         buttonArray[2][0]= but20;        buttonArray[2][1]= but21;        buttonArray[2][2]= but22;        buttonArray[2][3]= but23;
         buttonArray[2][4]= but24;        buttonArray[2][5]= but25;        buttonArray[2][6]= but26;        buttonArray[2][7]= but27;
         buttonArray[2][8]= but28;        buttonArray[2][9]= but29;        buttonArray[3][0]= but30;        buttonArray[3][1]= but31;
         buttonArray[3][2]= but32;        buttonArray[3][3]= but33;        buttonArray[3][4]= but34;        buttonArray[3][5]= but35;
         buttonArray[3][6]= but36;        buttonArray[3][7]= but37;        buttonArray[3][8]= but38;        buttonArray[3][9]= but39;

         buttonArray[4][0]= but40;        buttonArray[4][1]= but41;        buttonArray[4][2]= but42;        buttonArray[4][3]= but43;
         buttonArray[4][4]= but44;        buttonArray[4][5]= but45;        buttonArray[4][6]= but46;        buttonArray[4][7]= but47;
         buttonArray[4][8]= but48;        buttonArray[4][9]= but49;
         buttonArray[5][0]= but50;        buttonArray[5][1]= but51;        buttonArray[5][2]= but52;        buttonArray[5][3]= but53;        buttonArray[5][4]= but54;        buttonArray[5][5]= but55;
         buttonArray[5][6]= but56;        buttonArray[5][7]= but57;        buttonArray[5][8]= but58;        buttonArray[5][9]= but59;        buttonArray[6][0]= but60;        buttonArray[6][1]= but61;
         buttonArray[6][2]= but62;        buttonArray[6][3]= but63;        buttonArray[6][4]= but64;       buttonArray[6][5]= but65;        buttonArray[6][6]= but66;        buttonArray[6][7]= but67;
         buttonArray[6][8]= but68;        buttonArray[6][9]= but69;        buttonArray[7][0]= but70;        buttonArray[7][1]= but71;
         buttonArray[7][2]= but72;        buttonArray[7][3]= but73;        buttonArray[7][4]= but74;        buttonArray[7][5]= but75;
         buttonArray[7][6]= but76;        buttonArray[7][7]= but77;        buttonArray[7][8]= but78;        buttonArray[7][9]= but79;        buttonArray[8][0]= but80;
         buttonArray[8][1]= but81;        buttonArray[8][2]= but82;        buttonArray[8][3]= but83;        buttonArray[8][4]= but84;
         buttonArray[8][5]= but85;        buttonArray[8][6]= but86;        buttonArray[8][7]= but87;        buttonArray[8][8]= but88;
         buttonArray[8][9]= but89;        buttonArray[9][0]= but90;        buttonArray[9][1]= but91;        buttonArray[9][2]= but92;
         buttonArray[9][3]= but93;        buttonArray[9][4]= but94;        buttonArray[9][5]= but95;        buttonArray[9][6]= but96;
         buttonArray[9][7]= but97;        buttonArray[9][8]= but98;        buttonArray[9][9]= but99;



      }
   }