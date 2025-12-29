package utils;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Style - Contains all styling methods
 * Think of this as your "art supplies box" - all the colors, fonts, and styles!
 */
public class Style {
    
    /**
     * Create a styled white panel with rounded corners and shadow
     */
    public static VBox createStyledPanel(String title) {
        VBox panel = new VBox(15);
        panel.setPadding(new Insets(20));
        panel.setStyle(
            "-fx-background-color: white; " +
            "-fx-background-radius: 10; " +
            "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 10, 0, 0, 2);"
        );
        panel.setPrefWidth(650);
        panel.setPrefHeight(380);
        
        // Add title
        Label titleLabel = new Label(title);
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 22));
        titleLabel.setTextFill(Color.web("#2d3748"));
        panel.getChildren().add(titleLabel);
        
        return panel;
    }
    
    /**
     * Create an info box (like "Total Sales: 150K")
     */
    public static VBox createInfoBox(String text) {
        return createInfoBox(text, "#4a5568");
    }
    
    public static VBox createInfoBox(String text, String textColor) {
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(12, 20, 12, 20));
        box.setStyle("-fx-background-color: #f7fafc; -fx-background-radius: 8;");
        
        Label label = new Label(text);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        label.setTextFill(Color.web(textColor));
        box.getChildren().add(label);
        
        return box;
    }
    
    /**
     * Create a legend item for charts (colored square + text)
     */
    public static HBox createLegendItem(String text, String color) {
        HBox item = new HBox(10);
        item.setAlignment(Pos.CENTER_LEFT);
        
        // Color square
        HBox colorBox = new HBox();
        colorBox.setPrefSize(20, 20);
        colorBox.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 3;");
        
        // Label
        Label label = new Label(text);
        label.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
        
        item.getChildren().addAll(colorBox, label);
        return item;
    }
    
    /**
     * Create a product entry for rankings
     */
    public static HBox createProductEntry(String rank, String name, String units, String barColor) {
        HBox entry = new HBox(15);
        entry.setAlignment(Pos.CENTER_LEFT);
        
        // Rank circle
        StackPane rankCircle = new StackPane();
        rankCircle.setPrefSize(40, 40);
        rankCircle.setStyle("-fx-background-color: " + barColor + "; -fx-background-radius: 20;");
        Label rankLabel = new Label(rank);
        rankLabel.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        rankLabel.setTextFill(Color.WHITE);
        rankCircle.getChildren().add(rankLabel);
        
        // Product name
        Label productLabel = new Label(name);
        productLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        productLabel.setPrefWidth(150);
        
        // Progress bar
        HBox progressBar = new HBox();
        progressBar.setPrefHeight(30);
        double width = rank.equals("1") ? 280 : rank.equals("2") ? 230 : 180;
        progressBar.setPrefWidth(width);
        progressBar.setStyle("-fx-background-color: " + barColor + "; -fx-background-radius: 5;");
        
        // Units label
        Label unitsLabel = new Label(units);
        unitsLabel.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        unitsLabel.setTextFill(Color.web("#2d3748"));
        
        entry.getChildren().addAll(rankCircle, productLabel, progressBar, unitsLabel);
        return entry;
    }
}