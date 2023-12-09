module chatbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens chatbox to javafx.fxml;
    exports chatbox;
    opens chatbox.ui to javafx.fxml;
    exports chatbox.ui;
}