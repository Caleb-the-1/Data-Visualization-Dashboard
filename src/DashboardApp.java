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
import panels.InputPanel;

public class DashboardApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane mainLayout = new BorderPane();
        mainLayout.setStyle("-fx-background-color: #f0f4f8;");
        
        VBox topSection = new VBox(10);
        HBox header = HeaderBar.create();
        HBox inputPanel = InputPanel.create();
        topSection.getChildren().addAll(header, inputPanel);
        mainLayout.setTop(topSection);
        
        GridPane contentGrid = createContentGrid();
        mainLayout.setCenter(contentGrid);
        
        HBox statusBar = StatusBar.create();
        mainLayout.setBottom(statusBar);
        
        Scene scene = new Scene(mainLayout, 1400, 900);
        primaryStage.setTitle("Java Data Visualization Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createContentGrid() {
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(20));
        
        VBox salesPanel = SalesOverviewPanel.create();
        VBox marketSharePanel = MarketSharePanel.create();
        VBox revenuePanel = RevenueTrendsPanel.create();
        VBox topProductsPanel = TopProductsPanel.create();
        
        grid.add(salesPanel, 0, 0);
        grid.add(marketSharePanel, 1, 0);
        grid.add(revenuePanel, 0, 1);
        grid.add(topProductsPanel, 1, 1);
        
        return grid;
    }
}
