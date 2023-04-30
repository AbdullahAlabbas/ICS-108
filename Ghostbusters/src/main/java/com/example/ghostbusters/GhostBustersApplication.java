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

    AnimationTimer timer;

    final Ghost ghost1 = new Ghost(10,"Ghost.png");
    final Ghost ghost2 = new Ghost(5,"Ghost2.png");
    final Ghost ghost3 = new Ghost(15,"Ghost3.png");

    final ImageView object1 = ghost1.object();
    final ImageView object2 = ghost2.object();
    final ImageView object3= ghost3.object();

    final Text scoreText = new Text("Score: 0");
    final Text gameOverText = new Text("Game Over");
    final ImageView restartButton = new ImageView(new Image("Retrybutton.png"));
    final ImageView startButton = new ImageView(new Image("Start.png"));
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
        scoreText.setVisible(false);
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
            scoreText.setText("Score: " + score);
            objectSpeed += 1;
        });
        object3.setOnMouseClicked(event -> {
            root.getChildren().remove(object3);
            score += ghost3.getScore();
            scoreText.setText("Score: " + score);
            objectSpeed += 1;
        });

        //startButton
        startButton.setOnMouseClicked(mouseEvent -> {

            timer.start();
            startButton.setVisible(false);
            scoreText.setVisible(true);
        });

        startButton.setFitHeight(80);
        startButton.setPreserveRatio(true);
        startButton.setLayoutX(100);
        startButton.setLayoutY(440);
        root.getChildren().add(startButton);



        // restartButton
        restartButton.setOnMouseClicked(event1 -> {

                    score = 0;
                    objectSpeed = 2;
                    objectsDropped = 0;
                    gameOverText.setVisible(false);
                    restartButton.setVisible(false);

                    scoreText.setText("Score: " + score);


                    object1.setLayoutX(10);
                    object1.setLayoutY(0);
                    object2.setLayoutX(5);
                    object2.setLayoutY(0);
                    object3.setLayoutX(7.5);
                    object3.setLayoutY(0);

                    root.getChildren().addAll(object1, object2,object3);


                });
        restartButton.setPreserveRatio(true);
        restartButton.setFitHeight(80);
        restartButton.setLayoutX(100);
        restartButton.setLayoutY(440);
        restartButton.setVisible(false);
        root.getChildren().add(restartButton);






        //scene
        Scene gameScene = new Scene(root, 400, 600);
        primaryStage.setTitle("GhostBusters");
        primaryStage.setScene(gameScene);
        primaryStage.show();
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (objectsDropped >= 6 ) {
                    gameOverText.setText("Game Over\nScore: " + score);
                    gameOverText.setVisible(true);
                    restartButton.setVisible(true);
                    root.getChildren().remove(object2);
                    root.getChildren().remove(object1);
                    root.getChildren().remove(object3);


                    return;}
                int random = (int)Math.floor(Math.random() * 2);

                    object1.setLayoutY(object1.getLayoutY() + objectSpeed+2);
                    object2.setLayoutY(object2.getLayoutY() + objectSpeed+1);
                    object3.setLayoutY(object3.getLayoutY() + objectSpeed+0.5);


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
                if(object3.getLayoutY() > 600){
                    double randomX = Math.random()*300;
                    object3.setLayoutX(randomX);
                    object3.setLayoutY(0);
                    objectsDropped++;
                    root.getChildren().add(object3);
                }
            }
        };


    }


    public static void main(String[] args) {
        launch(args);
    }}
