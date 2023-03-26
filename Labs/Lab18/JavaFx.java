import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX extends Application {
    Image[] images = {
            new Image("https://dev.java/assets/images/java-logo-vert-blk.png"),
            new Image("https://scand.com/wp-content/uploads/2021/04/Java.jpg"),
            new Image("Image.png")};
    ImageView imageView;
    Button changeImageButton;
    Button previousImageButton;
    Button forwardImageButton;
    int imageIndex = 0;

    @Override
    public void start(Stage stage) {
        imageView = new ImageView(images[imageIndex]);

        ButtonHandler buttonHandler = new ButtonHandler();
        changeImageButton = new Button("Change Image");
        changeImageButton.setOnAction(buttonHandler);
        previousImageButton = new Button("Previous Image");
        previousImageButton.setOnAction(buttonHandler);
        forwardImageButton = new Button("Forward Image");
        forwardImageButton.setOnAction(buttonHandler);

        HBox buttonBox = new HBox(10, previousImageButton, changeImageButton, forwardImageButton);
        buttonBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10, imageView, buttonBox);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 500, 530);

        stage.setTitle("Generate a Random Image");
        stage.setScene(scene);
        stage.show();
    }

    void changeImage() {
        imageView.setImage(images[imageIndex]);
    }

    public static void main(String[] args) {
        launch(args);
    }

    class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            if (e.getSource() == changeImageButton) {
                imageIndex = (int) (Math.random() * images.length);
            } else if (e.getSource() == previousImageButton) {
                imageIndex--;
                if (imageIndex < 0) {
                    imageIndex = images.length - 1;
                }
            } else if (e.getSource() == forwardImageButton) {
                imageIndex++;
                if (imageIndex >= images.length) {
                    imageIndex = 0;
                }
            }
            changeImage();
        }
    }
}
