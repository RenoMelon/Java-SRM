module be.srm.javasrmapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens be.srm.javasrmapplication to javafx.fxml;
    exports be.srm.javasrmapplication;
}