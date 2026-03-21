module pl.mruczekprogramista.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens pl.mruczekprogramista.bmicalculator to javafx.fxml;
    exports pl.mruczekprogramista.bmicalculator;
}