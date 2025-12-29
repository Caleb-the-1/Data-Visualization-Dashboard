package panels;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import utils.Style;

/**
 * TopProductsPanel - Creates the ranking list showing top 3 products
 * This is the BOTTOM-RIGHT panel in the dashboard
 */
public class TopProductsPanel {
    
    /**
     * Create the top products panel with rankings
     */
    public static VBox create() {
        VBox panel = Style.createStyledPanel("Top Products");
        panel.setSpacing(15);
        panel.setPadding(new Insets(25));
        
        // Add three product entries (like a podium: 1st, 2nd, 3rd place!)
        panel.getChildren().addAll(
            Style.createProductEntry("1", "Product X", "30K Units", "#8bc34a"),
            Style.createProductEntry("2", "Product Y", "25K Units", "#ff9800"),
            Style.createProductEntry("3", "Product Z", "18K Units", "#42a5f5")
        );
        
        return panel;
    }
}