package panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import utils.DataManager;
import utils.Style;

public class SalesOverviewPanel {
    
    private static BarChart<String, Number> barChart;
    private static XYChart.Series<String, Number> series;
    
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Sales Overview");
        
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        barChart = new BarChart<>(xAxis, yAxis);
        barChart.setLegendVisible(false);
        barChart.setPrefHeight(250);
        
        series = new XYChart.Series<>();
        
        // Load initial data
        refreshData();
        
        barChart.getData().add(series);
        
        // Listen for data changes
        DataManager.addListener(() -> refreshData());
        
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
    
    private static void refreshData() {
        series.getData().clear();
        for (DataManager.DataEntry entry : DataManager.getSalesData()) {
            series.getData().add(new XYChart.Data<>(entry.label, entry.value));
        }
    }
}