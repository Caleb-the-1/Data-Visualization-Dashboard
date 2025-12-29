package components;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * HeaderBar - Creates the top section of the dashboard
 * This shows just the title
 */
public class HeaderBar {
    
    /**
     * Create the header with title only
     */
    public static HBox create() {
        HBox header = new HBox();
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(20));
        header.setStyle("-fx-background-color: #f0f4f8;");
        
        // Title text
        Label titleLabel = new Label("Java Data Visualization Dashboard");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        titleLabel.setTextFill(Color.web("#2c5282"));
        
        header.getChildren().add(titleLabel);
        return header;
    }
}