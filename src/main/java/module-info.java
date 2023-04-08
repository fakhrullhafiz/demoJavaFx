module com.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.demojavafx to javafx.fxml;
    exports com.demojavafx;
}