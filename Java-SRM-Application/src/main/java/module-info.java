module be.srm.javasrmapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.github.oshi;
    requires java.sql;

    opens be.srm.javasrmapplication to javafx.fxml;
    exports be.srm.javasrmapplication;
    exports be.srm.javasrmapplication.controllers;
    opens be.srm.javasrmapplication.controllers to javafx.fxml;
}