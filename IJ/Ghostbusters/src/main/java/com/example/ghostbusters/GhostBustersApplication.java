package com.example.ghostbusters;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class GhostBustersApplication extends Application {
    private int score = 0;
    private int objectValue = 10;
    private int objectSpeed = 2;
    private int objectsDropped = 0;
    private Pane root = new Pane();
    private ImageView object = new ImageView(new Image("Ghost.png"));
    private Text scoreText = new Text("Score: 0");
    private Text gameOverText = new Text("Game Over");
    public void start(Stage primaryStage) {
        // Create game layout
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image("gameSceneWallpaper.png"),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(backgroundImage));
        root.getChildren().addAll(object, scoreText);
        scoreText.setFont(Font.font("Chiller", 40));
        scoreText.setFill(Color.WHITE);
        scoreText.setLayoutX(10);
        scoreText.setLayoutY(30);
        gameOverText.setFont(Font.font("Chiller", 90));
        gameOverText.setFill(Color.RED);
        gameOverText.setLayoutX(80);
        gameOverText.setLayoutY(300);
        gameOverText.setVisible(false);
        root.getChildren().add(gameOverText);
        object.setOnMouseClicked(event -> {
            root.getChildren().remove(object);
            score += objectValue;
            scoreText.setText("Score: " + score);
            objectSpeed += 50;});
        Scene gameScene = new Scene(root, 400, 600);
        primaryStage.setTitle("GhostBusters");
        primaryStage.setScene(gameScene);
        primaryStage.show();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (objectsDropped >= 5) {
                    gameOverText.setText("Game Over\nScore: " + score);
                    gameOverText.setVisible(true);
                    return;}
                object.setLayoutY(object.getLayoutY() + objectSpeed);
                if (object.getLayoutY() > 600) {
                    double randomX = Math.random() * 300;
                    object.setLayoutX(randomX);
                    object.setLayoutY(0);
                    objectValue = 10;
                    objectSpeed = 2;
                    objectsDropped++;
                    root.getChildren().add(object);}}};
        timer.start();}


    public static void main(String[] args) {
        launch(args);
    }}
