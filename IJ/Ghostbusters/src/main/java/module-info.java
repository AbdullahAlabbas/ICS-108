module com.example.ghostbusters {
    requires javafx.controls;
    requires javafx.fxml;


    opens Project.Ghostbusters.src.main.java.com.example.ghostbusters to javafx.fxml;
    exports Project.Ghostbusters.src.main.java.com.example.ghostbusters;
}