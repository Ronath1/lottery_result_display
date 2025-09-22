# 🎰 Lottery Result Display

This project is a Spring Boot application designed to fetch and display the latest Jayoda Lottery Results. It also stores the results in a MySQL database for easy retrieval, tracking, and record keeping.

## 📌 Key Features

🌐 Fetch Live Results – Gets the latest results directly from the official lottery website.

🗄️ Database Storage – Saves results (lottery name, winning numbers, date) for future use.

⚡ Automatic Execution – Fetches and stores results as soon as the application runs.

📝 Console Output – Displays the latest results immediately for quick checks.

📊 History Tracking – Maintains past results for reference and analysis.

## 🛠️ Technology Stack

Java & Spring Boot – For backend application logic.

Spring Data JPA & Hibernate – For smooth database operations.

MySQL Database – To store and manage lottery results.

Jsoup – To parse and extract information from the official results page.

## 📖 How It Works

The application connects to the official lottery results page.

It extracts the lottery title, winning numbers, and draw date.

Results are displayed in the console for immediate viewing.

The same results are saved into a MySQL table for long-term storage.

## 🚀 Use Cases

📌 Personal Tracking – Keep a history of lottery results.

📌 Business Integration – Display results on websites or dashboards.

📌 Automation – Schedule daily updates without manual checking.

📌 Data Analysis – Store results for statistical tracking and insights.

## 🔮 Future Improvements

✅ Expose results via REST API (fetch by date, latest draw, etc.).

✅ Add a web frontend for public display.

✅ Include a daily scheduler to auto-update results.

✅ Create a visualization dashboard for trends and analytics.

## ✨ This project is a foundation for building automated lottery tracking systems. It can grow into a full-featured application with APIs, dashboards, and scheduled updates.
