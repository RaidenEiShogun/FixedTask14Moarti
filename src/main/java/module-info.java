module org.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens org.example.demo2 to javafx.fxml;
    exports org.example.demo2;
}