module com.example.liskov {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.liskov to javafx.fxml;
    exports com.example.liskov;
}