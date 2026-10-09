# Selenium Maven Automation

## 📌 Project Overview

This project demonstrates web application automation testing using **Selenium WebDriver with Java** and **Maven**. It focuses on automating browser interactions, executing test scenarios, and validating web application behavior.

The project uses Microsoft Edge WebDriver to automate browser actions and verify application functionality.

## 🎯 Objectives

- Automate web application test scenarios using Selenium WebDriver.
- Perform browser interactions such as opening URLs, locating web elements, entering text, and clicking buttons.
- Validate application behavior and error messages.
- Practice writing and maintaining Java-based automation scripts.
- Manage project dependencies using Maven.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Build and Dependency Management:** Apache Maven
- **IDE:** Eclipse
- **Browser:** Microsoft Edge
- **Version Control:** Git and GitHub

## 📂 Project Structure

```text
Selenium-Maven-Automation/
├── DriverResources/
│   └── msedgedriver.exe
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Test/
│   │           └── Selenium_automation/
│   │               └── [Java test files]
│   └── test/
├── pom.xml
├── .gitignore
└── README.md
```

*Note: The Java file names and folders shown above are illustrative. Adjust this structure to match the actual files in your repository.*

## ⚙️ Prerequisites

Before running the project, ensure you have installed:

- Java JDK
- Eclipse IDE or another Java IDE
- Apache Maven
- Microsoft Edge browser
- A compatible Microsoft Edge WebDriver

## 🚀 Setup and Execution

### 1. Clone the repository

```bash
git clone https://github.com/chintamani27/Selenium-Maven-Automation.git
```

### 2. Open the project

Import the cloned project into Eclipse as an existing Maven project.

### 3. Verify the configuration

Ensure Java and Maven are configured correctly and that the Selenium dependencies are available in `pom.xml`.

### 4. Configure WebDriver

Configure the path to the Microsoft Edge WebDriver executable in your Java code, or use Selenium Manager where supported.

Ensure the WebDriver version is compatible with your installed browser.

### 5. Run the automation script

Run the relevant Java class from Eclipse.

If your project is configured for Maven test execution, you can also run:

```bash
mvn test
```

## 🧪 Testing Activities

The project provides hands-on practice with:

- Browser initialization and navigation
- Locating web elements using Selenium locators
- Entering test data into form fields
- Clicking buttons and interacting with web pages
- Handling explicit waits for dynamic elements
- Validating error messages and application responses

## 📚 Key Learnings

- Fundamentals of Selenium WebDriver automation
- Java-based browser automation
- Web element identification and interaction
- Synchronization using waits
- Maven project and dependency management
- Git and GitHub version control workflow

## 🔮 Future Enhancements

- Add TestNG or JUnit for structured test execution.
- Implement assertions for automated validation.
- Use the Page Object Model (POM) design pattern.
- Generate test execution reports.
- Integrate automation tests into a CI/CD pipeline.

## 👨‍💻 Author

**Chintamani Adak**

GitHub: [chintamani27](https://github.com/chintamani27)

---

*This project is part of my hands-on learning journey in Selenium automation testing using Java and Maven.*
