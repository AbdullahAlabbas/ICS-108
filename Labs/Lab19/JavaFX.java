package com.example.javafx;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFX extends Application {

    int currentIndex = 0;
    boolean isPlaying = false;
    Timeline timeline;
    Button playPauseButton;
    Button speedUpButton;
    Button speedDownButton;

    @Override
    public void start(Stage primaryStage) {

        Image[] images = {
                new Image("https://dev.java/assets/images/java-logo-vert-blk.png"),
                new Image("https://scand.com/wp-content/uploads/2021/04/Java.jpg"),
                new Image("Image.png")};

        ImageView imageView = new ImageView(images[0]);

        playPauseButton = new Button("Play");
        playPauseButton.setOnAction(new ButtonHandler());

        speedUpButton = new Button("Speed+");
        speedUpButton.setOnAction(new ButtonHandler());

        speedDownButton = new Button("Speed-");
        speedDownButton.setOnAction(new ButtonHandler());

        HBox buttonBox = new HBox(10, playPauseButton, speedUpButton, speedDownButton);
        buttonBox.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();
        root.setCenter(imageView);
        root.setBottom(buttonBox);

        timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            currentIndex++;
            if (currentIndex == images.length) {
                currentIndex = 0;
            }
            imageView.setImage(images[currentIndex]);
        }));
        timeline.setCycleCount(Animation.INDEFINITE);

        Scene scene = new Scene(root, 500, 600);

        primaryStage.setTitle("Lab-19");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == playPauseButton) {
                if (isPlaying) {
                    pauseAnimation();
                } else {
                    playAnimation();
                }
            } else if (event.getSource() == speedUpButton) {
                if (isPlaying) {
                    timeline.setRate(timeline.getRate() * 2);
                }
            } else if (event.getSource() == speedDownButton) {
                if (isPlaying) {
                    timeline.setRate(timeline.getRate() / 2);}}
        }}

    private void playAnimation() {
        isPlaying = true;
        playPauseButton.setText("Pause");
        timeline.play();
    }

    private void pauseAnimation() {
        isPlaying = false;
        playPauseButton.setText("Play");
        timeline.pause();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
