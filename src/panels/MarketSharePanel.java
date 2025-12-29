package panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import utils.Style;

/**
 * MarketSharePanel - Creates the pie chart showing market share
 * This is the TOP-RIGHT panel in the dashboard
 */
public class MarketSharePanel {
    
    /**
     * Create the market share panel with pie chart
     */
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Market Share");
        
        // Create the pie chart
        PieChart pieChart = new PieChart();
        pieChart.setLegendVisible(false);
        pieChart.setPrefHeight(250);
        
        // Add data slices (like cutting a pizza!)
        pieChart.getData().addAll(
            new PieChart.Data("Product A", 40),
            new PieChart.Data("Product B", 20),
            new PieChart.Data("Product C", 15),
            new PieChart.Data("Product D", 25)
        );
        
        // Create legend (the colored boxes with labels)
        VBox legend = new VBox(10);
        legend.setAlignment(Pos.CENTER_LEFT);
        legend.setPadding(new Insets(20));
        legend.getChildren().addAll(
            Style.createLegendItem("Product A", "#5a9fd4"),
            Style.createLegendItem("Product B", "#6dbfb8"),
            Style.createLegendItem("Product C", "#ffc857"),
            Style.createLegendItem("Product D", "#e15759")
        );
        
        // Winner badge (trophy + text)
        HBox winner = new HBox(10);
        winner.setAlignment(Pos.CENTER);
        winner.setPadding(new Insets(15, 0, 0, 0));
        Label trophy = new Label("🏆");
        trophy.setFont(Font.font(24));
        Label winnerText = new Label("Product A: 40%");
        winnerText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        winner.getChildren().addAll(trophy, winnerText);
        
        // Arrange chart and legend side-by-side
        HBox chartAndLegend = new HBox(20);
        chartAndLegend.getChildren().addAll(pieChart, legend);
        
        panel.getChildren().addAll(chartAndLegend, winner);
        return panel;
    }
}