module com.example.sussypig {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sussypig to javafx.fxml;
    exports com.example.sussypig;
}