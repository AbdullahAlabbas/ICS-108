import com.example.ghostbusters.GhostBustersApplication;
module com.example.ghostbusters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ghostbusters to javafx.fxml;
    exports com.example.ghostbusters;
}