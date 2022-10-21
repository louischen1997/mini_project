module com.example.final_project_demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.final_project_demo to javafx.fxml;
    exports com.example.final_project_demo;
}