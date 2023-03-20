package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class JavaFX extends Application {

    @Override
    public void start(Stage stage) {
        Image[] images = {
                new Image("https://dev.java/assets/images/java-logo-vert-blk.png"),
                new Image("https://scand.com/wp-content/uploads/2021/04/Java.jpg"),
                new Image("Image.png")};


        int randomNumber = (int) (Math.random() * images.length);
        Image image = images[randomNumber];
        int randomNumber2 = (int) (Math.random() * images.length);
        Image image2 = images[randomNumber2];

        ImageView imageView = new ImageView(image);
        ImageView imageView2 = new ImageView(image2);


        Pane pane = new VBox();
        pane.getChildren().addAll(imageView , imageView2);

        Scene scene = new Scene(pane, 500, 1000);

        stage.setTitle("Generate a Random Image");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}