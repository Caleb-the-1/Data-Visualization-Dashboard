package panels;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import utils.DataManager;

public class InputPanel {
    
    public static HBox create() {
        HBox panel = new HBox(15);
        panel.setAlignment(Pos.CENTER);
        panel.setPadding(new Insets(15, 20, 15, 20));
        panel.setStyle("-fx-background-color: white; -fx-background-radius: 10;");
        
        // Chart selector
        Label chartLabel = new Label("Chart:");
        chartLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        ComboBox<String> chartSelector = new ComboBox<>();
        chartSelector.getItems().addAll("Sales", "Market Share", "Revenue", "Profit");
        chartSelector.setValue("Sales");
        chartSelector.setPrefWidth(150);
        
        // Label input
        Label labelLabel = new Label("Label:");
        labelLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        TextField labelInput = new TextField();
        labelInput.setPromptText("e.g., Q5");
        labelInput.setPrefWidth(150);
        
        // Value input
        Label valueLabel = new Label("Value:");
        valueLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        TextField valueInput = new TextField();
        valueInput.setPromptText("e.g., 100");
        valueInput.setPrefWidth(150);
        
        // Submit button
        Button submitButton = new Button("Add Data");
        submitButton.setStyle(
            "-fx-background-color: #4CAF50; " +
            "-fx-text-fill: white; " +
            "-fx-font-weight: bold; " +
            "-fx-font-size: 14px; " +
            "-fx-padding: 10 30 10 30; " +
            "-fx-background-radius: 5;"
        );
        
        // Result label
        Label resultLabel = new Label("");
        resultLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        resultLabel.setPrefWidth(250);
        
        // Button action
        submitButton.setOnAction(e -> {
            String chart = chartSelector.getValue();
            String label = labelInput.getText();
            String value = valueInput.getText();
            
            if (label.isEmpty() || value.isEmpty()) {
                resultLabel.setText("❌ Fill all fields!");
                resultLabel.setStyle("-fx-text-fill: red;");
            } else {
                try {
                    double numValue = Double.parseDouble(value);
                    
                    // Add to the selected chart
                    switch (chart) {
                        case "Sales":
                            DataManager.addSalesData(label, numValue);
                            break;
                        case "Market Share":
                            DataManager.addMarketShareData(label, numValue);
                            break;
                        case "Revenue":
                            DataManager.addRevenueData(label, numValue);
                            break;
                        case "Profit":
                            DataManager.addProfitData(label, numValue);
                            break;
                    }
                    
                    resultLabel.setText("✅ Added to " + chart + ": " + label + " = " + numValue);
                    resultLabel.setStyle("-fx-text-fill: green;");
                    labelInput.clear();
                    valueInput.clear();
                    
                } catch (NumberFormatException ex) {
                    resultLabel.setText("❌ Value must be a number!");
                    resultLabel.setStyle("-fx-text-fill: red;");
                }
            }
        });
        
        panel.getChildren().addAll(
            chartLabel, chartSelector,
            labelLabel, labelInput, 
            valueLabel, valueInput, 
            submitButton, resultLabel
        );
        
        return panel;
    }
}