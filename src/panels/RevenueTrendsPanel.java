package panels;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import utils.Style;

/**
 * RevenueTrendsPanel - Creates the line chart showing revenue and profit over time
 * This is the BOTTOM-LEFT panel in the dashboard
 */
public class RevenueTrendsPanel {
    
    /**
     * Create the revenue trends panel with line chart
     */
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Revenue Trends");
        
        // Create axes for the line chart
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setPrefHeight(250);
        
        // Revenue line (blue line)
        XYChart.Series<String, Number> revenueSeries = new XYChart.Series<>();
        revenueSeries.setName("Revenue");
        revenueSeries.getData().add(new XYChart.Data<>("Jan", 40));
        revenueSeries.getData().add(new XYChart.Data<>("Feb", 55));
        revenueSeries.getData().add(new XYChart.Data<>("Mar", 45));
        revenueSeries.getData().add(new XYChart.Data<>("Apr", 35));
        revenueSeries.getData().add(new XYChart.Data<>("May", 75));
        revenueSeries.getData().add(new XYChart.Data<>("Jun", 80));
        
        // Profit line (orange line)
        XYChart.Series<String, Number> profitSeries = new XYChart.Series<>();
        profitSeries.setName("Profit");
        profitSeries.getData().add(new XYChart.Data<>("Jan", 20));
        profitSeries.getData().add(new XYChart.Data<>("Feb", 15));
        profitSeries.getData().add(new XYChart.Data<>("Mar", 30));
        profitSeries.getData().add(new XYChart.Data<>("Apr", 35));
        profitSeries.getData().add(new XYChart.Data<>("May", 25));
        profitSeries.getData().add(new XYChart.Data<>("Jun", 40));
        
        // Add both lines to the chart
        lineChart.getData().addAll(revenueSeries, profitSeries);
        
        panel.getChildren().add(lineChart);
        return panel;
    }
}