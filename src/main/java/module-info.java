module com.example.lab_02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_02 to javafx.fxml;
    exports com.example.lab_02;
}