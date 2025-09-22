# Bank_Ease

Simplified banking operations

# Bank.Ease ATM Login (Java Swing)

This project is a Java Swing-based GUI application that simulates a login interface for an Automated Teller Machine (ATM) as part of a banking system. The graphical interface is implemented using Java Swing and AWT libraries.

## Features

- Card Number and PIN Input fields for authentication
- Sign In, Clear, and Sign Up buttons with event handling
- Modern and intuitive interface using Java Swing components
- Easy to understand and customize for learning purposes

## Technologies Used

- Java 8+
- Swing (`javax.swing.*`)
- AWT (`java.awt.*`)

## How It Works

- The main window allows users to input their card number and PIN.
- Clicking **Sign In** would trigger future authentication logic.
- **Clear** button resets both input fields for a new entry.
- **Sign Up** is for new user registration (future implementation).

## Getting Started

### Clone the repository:

git clone https://github.com/your-username/bank-ease-atm-login.git

### Navigate to the project directory and compile:

javac bank/ease/Login.java

### Run the application:

java bank.ease.Login

## Folder Structure

```
/bank/ease/
|-- Login.java
/icons/
|-- logo.jpg
```

## External Libraries

This project requires the following external JARs:

- JDateChooser (com.toedter.calendar.JDateChooser)

### How to Add External JARs in VS Code

1. Download the JAR (e.g., JDateChooser.jar).
2. Create a folder named `lib` in your project root (if it does not exist).
3. Place the JAR file in the `lib` folder.
4. Open the Java Dependencies panel and add the JAR using the "+" button, or update your classpath/referencedLibraries setting.

If you're using Maven/Gradle, add the dependency in `pom.xml` or `build.gradle` instead.
