# Bank_Ease

A simple **Java Swing-based Banking System** that demonstrates user account signup and ATM login functionality. The application simulates GUI operations for banking workflows with form-based user input, database connectivity, and a clean interface.

### Features

- **ATM Login** with Card Number & PIN fields (GUI-based authentication)
- **Account Signup Form** with personal details (Name, DOB, Gender, Email, Address, etc.)
- **Form Validation** for required fields during signup
- **Integration with MySQL database** using JDBC
- Modern GUI with **Swing, AWT**, and **external date picker (JDateChooser)**

### Technologies Used

- Java 8+
- Swing (`javax.swing.*`)
- AWT (`java.awt.*`)
- MySQL with JDBC (`java.sql.*`)
- External Library: [toedter JCalendar](https://toedter.com/jcalendar/) (`JDateChooser`)

### How It Works

1. **Signup Form (`SignupOne.java`)**

   - Collects user details like name, father’s name, date of birth, gender, email, marital status, address, city, state, and pincode.
   - Generates a unique **Application Form Number** for each user.
   - Validates mandatory fields (e.g., Name).
   - Stores all data in a MySQL database table (`signup`).

2. **Database Connection (`Conn.java`)**

   - Provides JDBC connectivity using `DriverManager.getConnection()`.
   - Encapsulates SQL query execution through `Statement`.

3. **ATM Login (`Login.java`)**
   - GUI for card number and PIN entry.
   - Buttons for **Sign In**, **Clear**, and **Sign Up**.
   - Placeholder for future authentication logic with database.

### Getting Started

#### Clone the Repository

git clone https://github.com/your-username/bank-ease-atm-login.git

### Navigate to the project directory and compile:

javac bank/ease/SignupOne.java bank/ease/Conn.java bank/ease/Login.java

### Run the application:

java bank.ease.SignupOne

(or)

java bank.ease.Login

## Folder Structure

```
/bank/ease/
│-- Login.java
│-- SignupOne.java
│-- Conn.java
/icons/
└── logo.jpg
/lib/
└── jcalendar-x.x.x.jar (or JDateChooser.jar)
```

### External Libraries

This project requires the following external JARs:

- **JDateChooser** (part of [JCalendar](https://toedter.com/jcalendar/))

#### Adding External JARs in VS Code

1. Download the `JDateChooser.jar`.
2. Create a folder named `lib` in your project root.
3. Place the JAR inside `lib`.
4. Add it to your classpath:
   - Open VS Code
   - Go to **Java Projects** → **Referenced Libraries** → Click **+** → Select the JAR
5. If using Maven/Gradle, add the proper dependency instead.

### Future Enhancements

- Implement Login authentication by verifying card number & PIN from the database.
- Add multi-page signup for additional banking details.
- Integrate transaction features (Deposit, Withdraw, Balance Enquiry, Mini Statement).

If you're using Maven/Gradle, add the dependency in `pom.xml` or `build.gradle` instead.
