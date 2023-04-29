package com.example.ghostbusters;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class GhostBustersApplication extends Application {
    private int score = 0;
    final private int objectValue = 10;
    private int objectSpeed = 2;
    private int objectsDropped = 0;
    final Pane root = new Pane();

    final Ghost ghost1 = new Ghost(10,"Ghost.png");
    final Ghost ghost2 = new Ghost(5,"Ghost2.png");
    final ImageView object1 = ghost1.object();
    final ImageView object2 = ghost2.object();
    final Text scoreText = new Text("Score: 0");
    final Text gameOverText = new Text("Game Over");
    final Button restartButton = new Button("TRY AGAIN?");
    public void start(Stage primaryStage) {
        // Create game layout
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image("gameSceneWallpaper.png"),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(backgroundImage));
        root.getChildren().addAll( scoreText);
        //scoreText
        scoreText.setFont(Font.font("Chiller", 40));
        scoreText.setFill(Color.WHITE);
        scoreText.setLayoutX(10);
        scoreText.setLayoutY(30);
        //gameOverText
        gameOverText.setFont(Font.font("Chiller", 90));
        gameOverText.setFill(Color.RED);
        gameOverText.setLayoutX(80);
        gameOverText.setLayoutY(300);
        gameOverText.setVisible(false);
        root.getChildren().add(gameOverText);
        //object
        object1.setOnMouseClicked(event -> {
            root.getChildren().remove(object1);
            score += ghost1.getScore();
            scoreText.setText("Score: " + score);
            objectSpeed += 1;
        });
        object2.setOnMouseClicked(event -> {
            root.getChildren().remove(object2);
            score += ghost2.getScore();
            scoreText.setText("Score: "+ score);
            objectSpeed += 1;
            // restartButton
            restartButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    score = 0;
                    objectSpeed = 2;
                    objectsDropped = 0;

                    gameOverText.setVisible(false);
                    restartButton.setVisible(false);

                    root.getChildren().add(scoreText);

                    object1.setLayoutX(10);
                    object1.setLayoutY(0);
                    object2.setLayoutX(5);
                    object2.setLayoutY(0);

                    root.getChildren().addAll(object1, object2);

                }
            });
            restartButton.setLayoutX(200);
            restartButton.setLayoutY(50);
            restartButton.setVisible(false);
            root.getChildren().add(restartButton);


        });
        //scene
        Scene gameScene = new Scene(root, 400, 600);
        primaryStage.setTitle("GhostBusters");
        primaryStage.setScene(gameScene);
        primaryStage.show();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (objectsDropped >= 3 ) {
                    gameOverText.setText("Game Over\nScore: " + score);
                    gameOverText.setVisible(true);
                    restartButton.setVisible(true);
                    return;}
                int random = (int)Math.floor(Math.random() * 2);

                    object1.setLayoutY(object1.getLayoutY() + objectSpeed+2);
                    object2.setLayoutY(object2.getLayoutY() + objectSpeed+1);

                if (object1.getLayoutY() > 600 ) {
                    double randomX = Math.random() * 300;
                    object1.setLayoutX(randomX);
                    object1.setLayoutY(0);
                    objectsDropped++;
                    root.getChildren().add(object1);
                }
                if(object2.getLayoutY() > 600){
                    double randomX = Math.random()*300;
                    object2.setLayoutX(randomX);
                    object2.setLayoutY(0);
                    objectsDropped++;
                    root.getChildren().add(object2);
                }
            }
        };
        timer.start();
    }


    public static void main(String[] args) {
        launch(args);
    }}
