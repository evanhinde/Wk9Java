module com.example.wk9java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wk9java to javafx.fxml;
    exports com.example.wk9java;
}