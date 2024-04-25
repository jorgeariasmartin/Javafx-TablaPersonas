module controllers {
    requires javafx.controls;
    requires javafx.fxml;


    opens controllers to javafx.fxml;
    opens modelos to javafx.base;
    exports controllers;
}