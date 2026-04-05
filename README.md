# 🚀 AI-Powered Test Automation Framework with CI/CD

This project is a complete end-to-end **Test Automation Framework** built using Selenium, TestNG, and Maven, enhanced with **AI-based failure analysis** and integrated with Jenkins for **CI/CD execution**.

---

## 📌 🔍 Project Overview

This framework demonstrates how modern QA automation can be enhanced using AI and DevOps practices.

It includes:
- Automated test execution
- Intelligent failure analysis
- Screenshot capture on failure
- Detailed HTML reporting
- CI/CD pipeline using Jenkins

---

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Jenkins
- GitHub
- Extent Reports

---

## 📁 Project Structure
src
├── main
│ └── java
│ ├── pages # Page Object Model classes
│ ├── utils # Utility classes (Driver, Screenshot, Report)
│ └── ai # AI-based bug analyzer
│
└── test
└── java
├── base # Base test setup
└── tests # Test cases


---

## ✨ Key Features

- 🔹 Selenium + TestNG automation framework  
- 🔹 Page Object Model (POM) design pattern  
- 🔹 AI-based failure analysis  
- 🔹 Automatic screenshot capture on failure  
- 🔹 Extent HTML reporting  
- 🔹 Maven build management  
- 🔹 GitHub version control  
- 🔹 Jenkins CI/CD integration  

---

## 🤖 AI-Based Failure Analysis

When a test fails:
- The error message is captured
- It is passed to a custom AI analyzer
- AI provides the possible root cause

Example:
Error: NoSuchElementException
AI Suggestion: Locator might be incorrect or changed

## 📸 Screenshot on Failure

- Automatically captures screenshot when test fails
- Attached in Extent Report

---

## 📊 Reporting

- Uses Extent Reports for detailed HTML reports
- Includes:
  - Pass/Fail status
  - Logs
  - Screenshots
  - AI analysis

 ## ⚙️ How to Run (Locally)

1. Clone the repository:
git clone https://github.com/Rushi1719/AI-QA-Automation-Framework.git
2. Navigate to project:
3. Run tests:
4. Open report:
/reports/index.html

## 🔁 CI/CD Integration (Jenkins)

- Jenkins pulls code from GitHub
- Executes:
mvn clean test

- Generates report
- Publishes HTML report in Jenkins UI

---

## 🎯 Use Case

This framework is useful for:
- QA Engineers learning automation
- Demonstrating CI/CD integration
- Showcasing AI in testing
- Real-world automation project

---

## 🚀 Future Enhancements

- 🔹 Self-healing locators  
- 🔹 Retry mechanism  
- 🔹 Parallel execution  
- 🔹 Email notifications  
- 🔹 Docker integration  

---

## 👨‍💻 Author

**Rushikesh Kulkarni**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and share your feedback!

---
