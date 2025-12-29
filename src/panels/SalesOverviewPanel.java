package panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import utils.Style;

/**
 * SalesOverviewPanel - Creates the bar chart showing quarterly sales
 * This is the TOP-LEFT panel in the dashboard
 */
public class SalesOverviewPanel {
    
    /**
     * Create the sales overview panel with bar chart
     */
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Sales Overview");
        
        // Create axes for the bar chart
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setLegendVisible(false);
        barChart.setPrefHeight(250);
        
        // Add data (the bars!)
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Q1", 45));
        series.getData().add(new XYChart.Data<>("Q1", 55));
        series.getData().add(new XYChart.Data<>("Q2", 65));
        series.getData().add(new XYChart.Data<>("Q2", 85));
        series.getData().add(new XYChart.Data<>("Q4", 60));
        series.getData().add(new XYChart.Data<>("Q4", 70));
        series.getData().add(new XYChart.Data<>("Q4", 90));
        
        barChart.getData().add(series);
        
        // Create info boxes at the bottom
        HBox infoBoxes = new HBox(15);
        infoBoxes.setAlignment(Pos.CENTER);
        infoBoxes.setPadding(new Insets(15, 0, 0, 0));
        infoBoxes.getChildren().addAll(
            Style.createInfoBox("Total Sales: 150K"),
            Style.createInfoBox("Growth: 12%", "#10b981"),
            Style.createInfoBox("Target: 200K")
        );
        
        panel.getChildren().addAll(barChart, infoBoxes);
        return panel;
    }
}