package utils;

import javafx.scene.chart.XYChart;
import java.util.ArrayList;
import java.util.List;

/**
 * DataManager - Manages all the data for the dashboard
 * This is like a shared notebook where everyone writes and reads data
 */
public class DataManager {
    
    // Storage for chart data
    private static List<DataEntry> salesData = new ArrayList<>();
    private static List<DataEntry> marketShareData = new ArrayList<>();
    private static List<DataEntry> revenueData = new ArrayList<>();
    private static List<DataEntry> profitData = new ArrayList<>();
    
    // Listeners - these get notified when data changes
    private static List<DataChangeListener> listeners = new ArrayList<>();
    
    // Initialize with default data
    static {
        // Sales data
        salesData.add(new DataEntry("Q1", 45));
        salesData.add(new DataEntry("Q1", 55));
        salesData.add(new DataEntry("Q2", 65));
        salesData.add(new DataEntry("Q2", 85));
        salesData.add(new DataEntry("Q4", 60));
        salesData.add(new DataEntry("Q4", 70));
        salesData.add(new DataEntry("Q4", 90));
        
        // Market share data
        marketShareData.add(new DataEntry("Product A", 40));
        marketShareData.add(new DataEntry("Product B", 20));
        marketShareData.add(new DataEntry("Product C", 15));
        marketShareData.add(new DataEntry("Product D", 25));
        
        // Revenue data
        revenueData.add(new DataEntry("Jan", 40));
        revenueData.add(new DataEntry("Feb", 55));
        revenueData.add(new DataEntry("Mar", 45));
        revenueData.add(new DataEntry("Apr", 35));
        revenueData.add(new DataEntry("May", 75));
        revenueData.add(new DataEntry("Jun", 80));
        
        // Profit data
        profitData.add(new DataEntry("Jan", 20));
        profitData.add(new DataEntry("Feb", 15));
        profitData.add(new DataEntry("Mar", 30));
        profitData.add(new DataEntry("Apr", 35));
        profitData.add(new DataEntry("May", 25));
        profitData.add(new DataEntry("Jun", 40));
    }
    
    // Add data to sales chart
    public static void addSalesData(String label, double value) {
        salesData.add(new DataEntry(label, value));
        notifyListeners();
    }
    
    // Add data to market share chart
    public static void addMarketShareData(String label, double value) {
        marketShareData.add(new DataEntry(label, value));
        notifyListeners();
    }
    
    // Add data to revenue chart
    public static void addRevenueData(String label, double value) {
        revenueData.add(new DataEntry(label, value));
        notifyListeners();
    }
    
    // Add data to profit chart
    public static void addProfitData(String label, double value) {
        profitData.add(new DataEntry(label, value));
        notifyListeners();
    }
    
    // Get all sales data
    public static List<DataEntry> getSalesData() {
        return new ArrayList<>(salesData);
    }
    
    // Get all market share data
    public static List<DataEntry> getMarketShareData() {
        return new ArrayList<>(marketShareData);
    }
    
    // Get all revenue data
    public static List<DataEntry> getRevenueData() {
        return new ArrayList<>(revenueData);
    }
    
    // Get all profit data
    public static List<DataEntry> getProfitData() {
        return new ArrayList<>(profitData);
    }
    
    // Register a listener (a chart that wants to know when data changes)
    public static void addListener(DataChangeListener listener) {
        listeners.add(listener);
    }
    
    // Notify all listeners that data changed
    private static void notifyListeners() {
        for (DataChangeListener listener : listeners) {
            listener.onDataChanged();
        }
    }
    
    // Inner class to hold one piece of data
    public static class DataEntry {
        public String label;
        public double value;
        
        public DataEntry(String label, double value) {
            this.label = label;
            this.value = value;
        }
    }
    
    // Interface for listeners
    public interface DataChangeListener {
        void onDataChanged();
    }
}