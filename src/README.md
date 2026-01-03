# Java Data Visualization Dashboard

A professional data visualization dashboard built with JavaFX featuring interactive charts and real-time data display.

## Features

- Sales Overview - Bar chart showing quarterly sales data
- Market Share Analysis - Pie chart with product distribution
- Revenue Trends - Line chart tracking revenue and profit over time
- Top Products Ranking - Visual ranking of best-selling products
- Real-time Status Bar - System status, user activity, and live clock

## Prerequisites

- Java JDK 11 or higher
- JavaFX SDK 21 or higher

## Installation
```bash
git clone https://github.com/Caleb-the-1/JavaDashboard.git
cd JavaDashboard/src
```

## Compile
```bash
javac --module-path "C:\path\to\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml DashboardApp.java components/*.java panels/*.java utils/*.java
```

## Run
```bash
java --module-path "C:\path\to\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml DashboardApp
```

## Project Structure
```
JavaDashboard/
├── src/
│   ├── DashboardApp.java
│   ├── components/
│   │   ├── HeaderBar.java
│   │   └── StatusBar.java
│   ├── panels/
│   │   ├── SalesOverviewPanel.java
│   │   ├── MarketSharePanel.java
│   │   ├── RevenueTrendsPanel.java
│   │   └── TopProductsPanel.java
│   └── utils/
│       └── Style.java
└── lib/
```

## License

MIT License

## Author

Caleb-the-1