# Java Data Visualization Dashboard

A professional data visualization dashboard built with JavaFX featuring interactive charts and real-time data input.

## Features

- Sales Overview - Bar chart showing quarterly sales data
- Market Share Analysis - Pie chart with product distribution
- Revenue Trends - Line chart tracking revenue and profit over time
- Top Products Ranking - Visual ranking of best-selling products
- Real-time Status Bar - System status, user activity, and live clock
- Dynamic Data Input - Add data and watch charts update in real-time

## Prerequisites

- Java JDK 11 or higher
- JavaFX SDK 21 or higher

## Installation
```bash
git clone https://github.com/Caleb-the-1/JavaDashboard.git
cd JavaDashboard
```

## Setup JavaFX

1. Download JavaFX SDK from [Gluon](https://gluonhq.com/products/javafx/)
2. Extract it to a location on your computer
3. Remember the path to the `lib` folder (e.g., `C:\javafx-sdk-25.0.1\lib`)

## Compile and Run

Navigate to the src folder:
```bash
cd src
```

### Compile:
```bash
javac --module-path "C:\Users\USER\Desktop\javafx-sdk-25.0.1\lib" --add-modules javafx.controls,javafx.fxml DashboardApp.java components/*.java panels/*.java utils/*.java
```

**Replace `YOUR_JAVAFX_PATH` with your actual JavaFX SDK path.**

Example:
```bash
javac --module-path "C:\javafx-sdk-25.0.1\lib" --add-modules javafx.controls,javafx.fxml DashboardApp.java components/*.java panels/*.java utils/*.java
```

### Run:
```bash
java --module-path "C:\Users\USER\Desktop\javafx-sdk-25.0.1\lib" --add-modules javafx.controls,javafx.fxml DashboardApp

**Replace `YOUR_JAVAFX_PATH` with your actual JavaFX SDK path.**

Example:
```bash
java --module-path "C:\javafx-sdk-25.0.1\lib" --add-modules javafx.controls,javafx.fxml DashboardApp
```

## How to Use

1. Run the application
2. Use the input panel at the top to add data
3. Select which chart to update (Sales, Market Share, Revenue, or Profit)
4. Enter a label and value
5. Click "Add Data" button
6. Watch the selected chart update instantly

## Project Structure
```
JavaDashboard/
├── src/
│   ├── DashboardApp.java          # Main application entry point
│   ├── components/                 # Reusable UI components
│   │   ├── HeaderBar.java         # Top header with title
│   │   └── StatusBar.java         # Bottom status bar
│   ├── panels/                     # Dashboard panel components
│   │   ├── SalesOverviewPanel.java    # Bar chart panel
│   │   ├── MarketSharePanel.java      # Pie chart panel
│   │   ├── RevenueTrendsPanel.java    # Line chart panel
│   │   ├── TopProductsPanel.java      # Rankings panel
│   │   └── InputPanel.java            # Data input panel
│   └── utils/                      # Utility classes
│       ├── Style.java             # Styling utilities
│       └── DataManager.java       # Data management and updates
└── lib/
```

## Technologies Used

- Java - Core programming language
- JavaFX - GUI framework
- JavaFX Charts - Charting library

## License

MIT License

## Author

Caleb-the-1