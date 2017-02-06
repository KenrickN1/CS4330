/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kjnzr3checkers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Kenrick Niedbalski
 */
public class CheckerBoard {
    private double boardWidth;
    private double boardHeight;
    
    private double rectWidth;
    private double rectHeight;
    
    private int NumRows;
    private int NumCols;
    
    private Color lightColor;
    private Color darkColor;
    
    private AnchorPane anchorPane;
    
    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight){
         this(numRows, numCols, boardWidth, boardHeight, Color.RED, Color.BLACK);
    }
    
    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
           this.NumRows = numRows;
           this.NumCols = numCols;
           this.boardWidth = boardWidth;
           this.boardHeight = boardHeight;
           this.lightColor = lightColor;
           this.darkColor = darkColor;    
    }
    
    public int getNumRows(){
        return this.NumRows;
    }
    
    public int getNumCols(){
        return this.NumCols;
    }
    
    public double getWidth(){
        return this.boardWidth;
    }
    
    public double getHeight(){
        return this.boardHeight;
    }
    
    public double getRectangleWidth(){
        return this.rectWidth;
    }
    
    public double getRectangleHeight(){
        return this.rectHeight;
    }
    
    public Color getLightColor(){
        return this.lightColor;
    }
    
    public Color getDarkColor(){
        return this.darkColor;
    }
    
    public AnchorPane build(){
        anchorPane = new AnchorPane();
        anchorPane.setMaxWidth(boardWidth);
        anchorPane.setMinHeight(boardHeight);
        
        
        rectWidth = Math.ceil(boardWidth / NumRows);
        rectHeight = Math.ceil(boardHeight / NumCols);
        
        for (int row = 0; row < NumRows; row++) {
            for (int col = 0; col < NumCols; col++) {
                
                Rectangle rect = new Rectangle(rectWidth, rectHeight, lightColor);
                
                /*if((row%2 == 0)){
                    if(col%2 == 0){
                        rect.setFill(lightColor);
                    }
                    else{
                        rect.setFill(darkColor);
                    }
                }
                else{
                    if(col%2 == 0){
                        rect.setFill(darkColor);
                    }
                    else{
                        rect.setFill(lightColor);
                    }
                }*/
                
                if((row+col)%2 == 0){
                    rect.setFill(lightColor);
                }
                else{
                    rect.setFill(darkColor);
                }
                
                anchorPane.getChildren().addAll(rect);
                AnchorPane.setTopAnchor(rect, rectHeight*row);
                AnchorPane.setLeftAnchor(rect, rectWidth*col);
            }
        }
        return anchorPane;
    }
    
    public AnchorPane getBoard(){
        return this.anchorPane;
    }
}
