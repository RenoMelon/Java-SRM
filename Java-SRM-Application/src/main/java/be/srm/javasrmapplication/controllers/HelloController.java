package be.srm.javasrmapplication.controllers;

import eu.hansolo.tilesfx.Tile;
import javafx.fxml.FXML;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class HelloController {

    @FXML
    private Tile cpuTile;

    private final SystemInfo si = new SystemInfo();
    private final CentralProcessor processor = si.getHardware().getProcessor();
    private long[] prevTicks;

    @FXML
    public void initialize(){
        System.out.println("Controller werkt!");

        this.prevTicks = processor.getSystemCpuLoadTicks();
    }



    private void setupTimer(){
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), event -> {
            updateCpuData();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void updateCpuData(){
        double cpuLoad = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
        this.prevTicks = processor.getSystemCpuLoadTicks();
        cpuTile.setValue(cpuLoad);

    }


}