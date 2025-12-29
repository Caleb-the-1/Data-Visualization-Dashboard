# Java Data Visualization Dashboard 📊

A professional data visualization dashboard built with JavaFX featuring interactive charts and real-time data display.

![Dashboard Preview](screenshot.png)

## 🌟 Features

- **Sales Overview** - Interactive bar chart showing quarterly sales data
- **Market Share Analysis** - Pie chart with product distribution
- **Revenue Trends** - Line chart tracking revenue and profit over time
- **Top Products Ranking** - Visual ranking of best-selling products
- **Real-time Status Bar** - System status, user activity, and live clock

## 🛠️ Technologies Used

- **Java** - Core programming language
- **JavaFX** - GUI framework for creating the user interface
- **JavaFX Charts** - Built-in charting library

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **Java JDK 11 or higher** - [Download here](https://www.oracle.com/java/technologies/downloads/)
- **JavaFX SDK 21 or higher** - [Download here](https://gluonhq.com/products/javafx/)

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/YOUR_USERNAME/JavaDashboard.git
cd JavaDashboard
```

### 2. Download JavaFX

1. Download JavaFX SDK from [Gluon](https://gluonhq.com/products/javafx/)
2. Extract it to a location on your computer (e.g., `C:\javafx-sdk-25.0.1`)

### 3. Compile the Project

Navigate to the `src` folder and compile:

**Windows:**
```bash
cd src
javac --module-path "PATH_TO_JAVAFX\lib" --add-modules javafx.controls,javafx.fxml DashboardApp.java components/*.java panels/*.java utils/*.java
```

**Mac/Linux:**
```bash
cd src
javac --module-path "PATH_TO_JAVAFX/lib" --add-modules javafx.controls,javafx.fxml DashboardApp.java components/*.java panels/*.java utils/*.java
```

Replace `PATH_TO_JAVAFX` with your actual JavaFX location.

### 4. Run the Application

**Windows:**
```bash
java --module-path "PATH_TO_JAVAFX\lib" --add-modules javafx.controls,javafx.fxml DashboardApp
```

**Mac/Linux:**
```bash
java --module-path "PATH_TO_JAVAFX/lib" --add-modules javafx.controls,javafx.fxml DashboardApp
```

## 📁 Project Structure
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
│   │   └── TopProductsPanel.java      # Rankings panel
│   └── utils/                      # Utility classes
│       └── Style.java             # Styling and theme utilities
├── lib/                            # External libraries (empty for now)
└── README.md                       # Project documentation
```

## 🎨 Customization

### Changing Colors

Edit `src/utils/Style.java` to modify:
- Panel backgrounds
- Text colors
- Chart colors
- Shadow effects

### Modifying Data

Edit the individual panel files in `src/panels/` to change:
- Chart data values
- Labels and titles
- Data ranges

### Adjusting Layout

Edit `src/DashboardApp.java` to modify:
- Window size (default: 1400x900)
- Panel arrangement
- Spacing between components

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Your Name**
- GitHub: [@YOUR_USERNAME](https://github.com/YOUR_USERNAME)

## 🙏 Acknowledgments

- JavaFX community for excellent documentation
- Gluon for maintaining JavaFX
- All contributors who help improve this project

## 📸 Screenshots

### Full Dashboard
![Full Dashboard](screenshot.png)

### Individual Components
- Sales Overview (Bar Chart)
- Market Share (Pie Chart)
- Revenue Trends (Line Chart)
- Top Products (Rankings)

## 🐛 Known Issues

None at the moment! If you find a bug, please open an issue.

## 📧 Contact

For questions or feedback, please open an issue on GitHub.

---

⭐ If you found this project helpful, please consider giving it a star!
```

5. **Save the file** (Ctrl + S)

---

## 📄 FILE 2: .gitignore (Tells Git What NOT to Upload)

### What to do:

1. **Right-click** on the `JavaDashboard` folder
2. Click **"New File"**
3. Name it: `.gitignore`
4. **Copy and paste** this code:
```
# Compiled class files
*.class

# Package Files
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# Virtual machine crash logs
hs_err_pid*

# IDE specific files
.vscode/
.idea/
*.iml
*.iws
*.ipr

# Mac specific
.DS_Store

# Windows specific
Thumbs.db
desktop.ini

# Build directories
/target/
/build/
/bin/
/out/

# JavaFX specific (don't upload JavaFX SDK)
javafx-sdk*/
```

5. **Save the file** (Ctrl + S)

---

## 📄 FILE 3: LICENSE (MIT License - Open Source)

### What to do:

1. **Right-click** on the `JavaDashboard` folder
2. Click **"New File"**
3. Name it: `LICENSE`
4. **Copy and paste** this code:
```
MIT License

Copyright (c) 2025 [Your Name]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

5. **Save the file** (Ctrl + S)

---

## ✅ Have you created these 3 files?

Your project should now look like:
```
JavaDashboard/
├── src/
├── lib/
├── README.md      ✅
├── .gitignore     ✅
└── LICENSE        ✅