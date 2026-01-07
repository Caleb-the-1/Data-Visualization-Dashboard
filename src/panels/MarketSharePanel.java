package panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import utils.DataManager;
import utils.Style;

public class MarketSharePanel {
    
    private static PieChart pieChart;
    
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Market Share");
        
        pieChart = new PieChart();
        pieChart.setLegendVisible(false);
        pieChart.setPrefHeight(250);
        
        // Load initial data
        refreshData();
        
        // Listen for data changes
        DataManager.addListener(() -> refreshData());
        
        VBox legend = new VBox(10);
        legend.setAlignment(Pos.CENTER_LEFT);
        legend.setPadding(new Insets(20));
        legend.getChildren().addAll(
            Style.createLegendItem("Product A", "#5a9fd4"),
            Style.createLegendItem("Product B", "#6dbfb8"),
            Style.createLegendItem("Product C", "#ffc857"),
            Style.createLegendItem("Product D", "#e15759")
        );
        
        HBox winner = new HBox(10);
        winner.setAlignment(Pos.CENTER);
        winner.setPadding(new Insets(15, 0, 0, 0));
        Label trophy = new Label("🏆");
        trophy.setFont(Font.font(24));
        Label winnerText = new Label("Product A: 40%");
        winnerText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        winner.getChildren().addAll(trophy, winnerText);
        
        HBox chartAndLegend = new HBox(20);
        chartAndLegend.getChildren().addAll(pieChart, legend);
        
        panel.getChildren().addAll(chartAndLegend, winner);
        return panel;
    }
    
    private static void refreshData() {
        pieChart.getData().clear();
        for (DataManager.DataEntry entry : DataManager.getMarketShareData()) {
            pieChart.getData().add(new PieChart.Data(entry.label, entry.value));
        }
    }
}