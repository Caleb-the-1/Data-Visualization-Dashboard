package components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * StatusBar - Creates the bottom status bar
 * Shows: System Status, User Activity, Last Update
 */
public class StatusBar {
    
    /**
     * Create the status bar
     */
    public static HBox create() {
        HBox statusBar = new HBox(30);
        statusBar.setAlignment(Pos.CENTER);
        statusBar.setPadding(new Insets(15, 20, 15, 20));
        statusBar.setStyle("-fx-background-color: #cbd5e0;");
        
        // System Status
        HBox systemStatus = new HBox(10);
        systemStatus.setAlignment(Pos.CENTER);
        Label gearIcon = new Label("⚙");
        gearIcon.setFont(Font.font(24));
        Label statusText = new Label("System Status: OK");
        statusText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        statusText.setTextFill(Color.web("#059669"));
        systemStatus.getChildren().addAll(gearIcon, statusText);
        
        // User Activity
        HBox userActivity = new HBox(10);
        userActivity.setAlignment(Pos.CENTER);
        Label chartIcon = new Label("📊");
        chartIcon.setFont(Font.font(24));
        Label activityText = new Label("User Activity: 120 Online");
        activityText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        userActivity.getChildren().addAll(chartIcon, activityText);
        
        // Last Update (shows current time)
        HBox lastUpdate = new HBox(10);
        lastUpdate.setAlignment(Pos.CENTER);
        Label clockIcon = new Label("🕐");
        clockIcon.setFont(Font.font(24));
        String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
        Label updateText = new Label("Last Update: " + currentTime);
        updateText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        lastUpdate.getChildren().addAll(clockIcon, updateText);
        
        statusBar.getChildren().addAll(systemStatus, userActivity, lastUpdate);
        return statusBar;
    }
}