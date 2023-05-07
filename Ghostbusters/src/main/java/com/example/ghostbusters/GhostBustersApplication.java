package com.example.ghostbusters;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
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
        private double objectSpeed = 2;
        private double speedRate = 0.25;
        private int objectsDropped = 0;
        final private Pane root = new Pane();
        private boolean stope;
        private AnimationTimer timer;
        private Leaderboard leaderboard = new Leaderboard();
        private final Ghost ghost1 = new Ghost(5, "Ghost.png");
        private final Ghost ghost2 = new Ghost(10, "Ghost2.png");
        private final Ghost ghost3 = new Ghost(15, "Ghost3.png");
        private final ImageView object1 = ghost1.object();
        private final ImageView object2 = ghost2.object();
        private final ImageView object3 = ghost3.object();

        private final Text scoreText = new Text("Score: 0");
        private final Text gameOverText = new Text("Game Over");
        private final ImageView restartButton = new ImageView(new Image("Retrybutton.png"));
        private final ImageView startButton = new ImageView(new Image("Start.png"));
        private final ImageView gameSign = new ImageView("sign.png");


        public void start (Stage primaryStage){

        // Create game layout
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image("gameSceneWallpaper.png"),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(backgroundImage));
        root.getChildren().addAll(scoreText);

        //scoreText
        scoreText.setFont(Font.font("Chiller", 40));
        scoreText.setFill(Color.WHITE);
        scoreText.setLayoutX(10);
        scoreText.setLayoutY(30);

        //gameOverText
        gameOverText.setFont(Font.font("Chiller", 50));
        gameOverText.setFill(Color.RED);
        gameOverText.setLayoutX(125);
        gameOverText.setLayoutY(120);
        gameOverText.setVisible(false);
        root.getChildren().add(gameOverText);

        //leaderBoard
        String[] strings = {"1st", "2nd", "3rd", "4th", "5th"};
        VBox leaderBoardBox = new VBox();
        leaderBoardBox.setLayoutX(160);
        leaderBoardBox.setLayoutY(220);
        leaderBoardBox.setAlignment(Pos.CENTER_LEFT);
        root.getChildren().add(leaderBoardBox);
        leaderBoardBox.setVisible(false);


        //objects
        object1.setOnMouseClicked(event -> {
            root.getChildren().remove(object1);
            score += ghost1.getScore();
            scoreText.setText("Score: " + score);
            objectSpeed = objectSpeed + speedRate;
        });
        object2.setOnMouseClicked(event -> {
            root.getChildren().remove(object2);
            score += ghost2.getScore();
            scoreText.setText("Score: " + score);
            objectSpeed = objectSpeed + speedRate;
        });

        object3.setOnMouseClicked(event -> {
            root.getChildren().remove(object3);
            score += ghost3.getScore();
            scoreText.setText("Score: " + score);
            objectSpeed = objectSpeed + speedRate;
        });


        //startButton
        startButton.setOnMouseClicked(mouseEvent -> {
            timer.start();
            scoreText.setVisible(true);
            startButton.setVisible(false);
            gameSign.setVisible(false);
            stope = false;
        });
        scoreText.setVisible(false);
        startButton.setFitHeight(80);
        startButton.setPreserveRatio(true);
        startButton.setLayoutX(100);
        startButton.setLayoutY(440);
        root.getChildren().add(startButton);

        //gameSign
        gameSign.setVisible(true);
        gameSign.setFitHeight(500);
        gameSign.setLayoutX(-25);
        gameSign.setPreserveRatio(true);
        root.getChildren().add(gameSign);
        
        // restartButton
        restartButton.setOnMouseClicked(event1 -> {

            score = 0;
            objectSpeed = 2;
            objectsDropped = 0;
            stope = false;

            gameOverText.setVisible(false);
            restartButton.setVisible(false);
            scoreText.setVisible(true);
            leaderBoardBox.getChildren().clear();
            scoreText.setText("Score: " + score);
            root.getChildren().add(scoreText);

            object1.setLayoutX(10);
            object1.setLayoutY(0);
            object2.setLayoutX(5);
            object2.setLayoutY(0);

            root.getChildren().addAll(object1, object2, object3);


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

        //Timer
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (stope) {
                    return;
                }

                if (objectsDropped >= 31) {
                    gameOverText.setText("Game Over\nScore: " + score);
                    gameOverText.setVisible(true);
                    restartButton.setVisible(true);
                    scoreText.setVisible(false);
                    root.getChildren().remove(object3);
                    root.getChildren().remove(object2);
                    root.getChildren().remove(object1);
                    stope = true;
                    leaderboard.addPlayer(new Player(score));

                    for (int i = 0; i < leaderboard.getTopPlayers().size(); i++) {
                        Player player = leaderboard.getTopPlayers().get(i);
                        Text leaderBoardText = new Text(strings[i] + ": " + player.getScore());
                        leaderBoardText.setFont(Font.font("Chiller", 35));
                        leaderBoardText.setFill(Color.WHITE);
                        leaderBoardBox.getChildren().add(leaderBoardText);
                    }
                    leaderBoardBox.setVisible(true);

                    return;

                }


                object1.setLayoutY(object1.getLayoutY() + objectSpeed + 2);
                object2.setLayoutY(object2.getLayoutY() + objectSpeed + 1);
                object3.setLayoutY(object3.getLayoutY() + objectSpeed + 1);

                if (object1.getLayoutY() > 600) {
                    double randomX = Math.random() * 300;
                    object1.setLayoutX(randomX);
                    object1.setLayoutY(0);
                    objectsDropped++;
                    root.getChildren().add(object1);
                }
                if (object2.getLayoutY() > 600) {
                    double randomX = Math.random() * 300;
                    object2.setLayoutX(randomX);
                    object2.setLayoutY(0);
                    objectsDropped++;
                    root.getChildren().add(object2);
                }

                if (object3.getLayoutY() > 600) {
                    double randomX = Math.random() * 300;
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
