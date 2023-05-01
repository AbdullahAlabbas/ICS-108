package com.example.ghostbusters;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ghost {
    private int score;
    private String image;

    Ghost(int score, String image){
        this.score = score;
        this.image = image;
    }

    ImageView object(){
        return new ImageView( new Image(image));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
