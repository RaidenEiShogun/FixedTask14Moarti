package org.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MainPaint extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(MainPaint.class.getResource("PaintVisual.fxml")));
        primaryStage.setTitle("JavaFX Paint");
        primaryStage.setScene(new Scene(root, 700, 560));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
