module eus.ehu.presentation.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.presentation.gitexercise to javafx.fxml;
    exports eus.ehu.presentation.gitexercise;
}