package panels;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import utils.DataManager;
import utils.Style;

public class RevenueTrendsPanel {
    
    private static LineChart<String, Number> lineChart;
    private static XYChart.Series<String, Number> revenueSeries;
    private static XYChart.Series<String, Number> profitSeries;
    
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Revenue Trends");
        
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setPrefHeight(250);
        
        revenueSeries = new XYChart.Series<>();
        revenueSeries.setName("Revenue");
        
        profitSeries = new XYChart.Series<>();
        profitSeries.setName("Profit");
        
        // Load initial data
        refreshData();
        
        lineChart.getData().addAll(revenueSeries, profitSeries);
        
        // Listen for data changes
        DataManager.addListener(() -> refreshData());
        
        panel.getChildren().add(lineChart);
        return panel;
    }
    
    private static void refreshData() {
        revenueSeries.getData().clear();
        profitSeries.getData().clear();
        
        for (DataManager.DataEntry entry : DataManager.getRevenueData()) {
            revenueSeries.getData().add(new XYChart.Data<>(entry.label, entry.value));
        }
        
        for (DataManager.DataEntry entry : DataManager.getProfitData()) {
            profitSeries.getData().add(new XYChart.Data<>(entry.label, entry.value));
        }
    }
}