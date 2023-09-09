module com.example.javagamebyhemydev {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javagamebyhemydev to javafx.fxml;
    exports com.example.javagamebyhemydev;
}