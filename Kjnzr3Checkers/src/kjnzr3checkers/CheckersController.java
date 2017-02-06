/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kjnzr3checkers;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Kenrick Niedbalski
 */
public class CheckersController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private VBox vBox;
    
    private Stage stage;
    CheckerBoard board;
    
    private int numRows = 8;
    private int numCols = 8;
    
    private Color lightColor = Color.RED;
    private Color darkColor = Color.BLACK;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }
    
    public void ready(Stage stage) {
        this.stage = stage;
        
        ChangeListener<Number> listener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
        if(lightColor == Color.RED && darkColor == Color.BLACK){
            vBox.getChildren().remove(anchorPane);
            board = new CheckerBoard(numRows, numCols, vBox.getWidth(), vBox.getHeight()-33);
        
            anchorPane = board.build();
            vBox.getChildren().add(anchorPane);
        }
        else{
            vBox.getChildren().remove(anchorPane);
            board = new CheckerBoard(numRows, numCols, vBox.getWidth(), vBox.getHeight()-33, lightColor, darkColor);
        
            anchorPane = board.build();
            vBox.getChildren().add(anchorPane);
        }
        };

        this.vBox.widthProperty().addListener(listener);
        this.vBox.heightProperty().addListener(listener);
        
        
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
       
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
    }
    
    @FXML
    private void handleGrid16x16(ActionEvent event) {
       if(lightColor == Color.RED && darkColor == Color.BLACK){
        vBox.getChildren().remove(anchorPane);
        numRows = 16;
        numCols = 16;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }
       else{
        vBox.getChildren().remove(anchorPane);
        numRows = 16;
        numCols = 16;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }
    }
    
    @FXML
    private void handleGrid10x10(ActionEvent event) {
       if(lightColor == Color.RED && darkColor == Color.BLACK){
        vBox.getChildren().remove(anchorPane);
        numRows = 10;
        numCols = 10;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }
       else{
        vBox.getChildren().remove(anchorPane);
        numRows = 10;
        numCols = 10;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }
    }
    
    @FXML
    private void handleGrid8x8(ActionEvent event) {
       if(lightColor == Color.RED && darkColor == Color.BLACK){
        vBox.getChildren().remove(anchorPane);
        numRows = 8;
        numCols = 8;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }
       else{
        vBox.getChildren().remove(anchorPane);
        numRows = 8;
        numCols = 8;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }

    }
    
    @FXML
    private void handleGrid3x3(ActionEvent event) {
       if(lightColor == Color.RED && darkColor == Color.BLACK){
        vBox.getChildren().remove(anchorPane);
        numRows = 3;
        numCols = 3;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }
       else{
        vBox.getChildren().remove(anchorPane);
        numRows = 3;
        numCols = 3;
       
        board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
        anchorPane = board.build();
        vBox.getChildren().add(anchorPane);
       }

    }
    @FXML
    private void handleColorDefault(ActionEvent event){
       vBox.getChildren().remove(anchorPane);
       
       lightColor = Color.RED;
       darkColor = Color.BLACK;
       
       board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
       anchorPane = board.build();
       vBox.getChildren().add(anchorPane);
    }
    @FXML
    private void handleColorBlue(ActionEvent event){
        vBox.getChildren().remove(anchorPane);
       
       lightColor = Color.SKYBLUE;
       darkColor = Color.DARKBLUE;
       
       board = new CheckerBoard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkColor);
       anchorPane = board.build();
       vBox.getChildren().add(anchorPane);
    } 
}
