module com.masanz.saludografico {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.masanz.sgi to javafx.fxml;
    exports com.masanz.sgi;
}