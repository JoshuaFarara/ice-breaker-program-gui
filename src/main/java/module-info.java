module icebreaker.app {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.fxml; // if using FXML

    exports org.icebreakerproject;
    opens org.icebreakerproject to javafx.fxml; // only if using FXML
}