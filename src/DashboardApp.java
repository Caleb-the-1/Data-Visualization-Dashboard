import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import components.HeaderBar;
import components.StatusBar;
import panels.SalesOverviewPanel;
import panels.MarketSharePanel;
import panels.RevenueTrendsPanel;
import panels.TopProductsPanel;

/**
 * DashboardApp - The main application
 * This is the BOSS that brings all the pieces together!
 */
public class DashboardApp extends Application {

    public static void main(String[] args) {
        launch(args);  // Start the application
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the main container
        BorderPane mainLayout = new BorderPane();
        mainLayout.setStyle("-fx-background-color: #f0f4f8;");
        
        // Create header (top section)
        HBox header = HeaderBar.create();
        mainLayout.setTop(header);
        
        // Create content grid (the 4 panels)
        GridPane contentGrid = createContentGrid();
        mainLayout.setCenter(contentGrid);
        
        // Create status bar (bottom section)
        HBox statusBar = StatusBar.create();
        mainLayout.setBottom(statusBar);
        
        // Create scene and show window
        Scene scene = new Scene(mainLayout, 1400, 900);
        primaryStage.setTitle("Java Data Visualization Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Create the 2x2 grid with all 4 chart panels
     */
    private GridPane createContentGrid() {
        GridPane grid = new GridPane();
        grid.setHgap(20);  // Horizontal spacing
        grid.setVgap(20);  // Vertical spacing
        grid.setPadding(new Insets(20));
        
        // Create all four panels
        VBox salesPanel = SalesOverviewPanel.create();
        VBox marketSharePanel = MarketSharePanel.create();
        VBox revenuePanel = RevenueTrendsPanel.create();
        VBox topProductsPanel = TopProductsPanel.create();
        
        // Add them to the grid (column, row)
        grid.add(salesPanel, 0, 0);       // Top-left
        grid.add(marketSharePanel, 1, 0);  // Top-right
        grid.add(revenuePanel, 0, 1);      // Bottom-left
        grid.add(topProductsPanel, 1, 1);  // Bottom-right
        
        return grid;
    }
}