package org.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {
    private PaintAppModel paintAppModel = new PaintAppModel();
    private GraphicsContext graphicsContext;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Canvas canvas;

    @FXML
    void handleColorPicker(ActionEvent event){
        paintAppModel.setCurrentColor(colorPicker.getValue());
    }

    @FXML
    void mouseDragged(MouseEvent event){
        graphicsContext.setFill(paintAppModel.getCurrentColor());
        graphicsContext.fillRect(event.getX(), event.getY(), 3,3);
        paintAppModel.addPoint(event.getX(), event.getY());
    }

    @FXML
    public void initialize(){
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.WHITE);
    }
}



