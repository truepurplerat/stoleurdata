module com.example.sussypig {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pigrat.stoleurdata to javafx.fxml;
    exports com.pigrat.stoleurdata;
}