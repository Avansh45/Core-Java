# 🚌 Bus Booking Management System

A console-based **Bus Booking Management System** developed using **Core Java**, **JDBC**, and **MySQL**. The application allows users to manage buses, passengers, and bookings while ensuring data consistency using JDBC transactions.

---

## 📌 Features

- 🚌 Add New Bus
- 📋 View All Buses
- 🔍 Search Bus (Source → Destination)
- 👤 Register Passenger
- 📄 View All Passengers
- 🎟️ Book Ticket
- 📚 View All Bookings
- ❌ Cancel Booking
- 💺 Automatic Seat Availability Management
- 🔄 Transaction Management (Commit & Rollback)

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- OOP (Object-Oriented Programming)
- DAO (Data Access Object) Pattern

---

## 📂 Project Structure

```
BusBookingSystem
│
├── dao
│   ├── BusDAO.java
│   ├── PassengerDAO.java
│   └── BookingDAO.java
│
├── database
│   └── DBConnection.java
│
├── model
│   ├── Bus.java
│   ├── Passenger.java
│   ├── Booking.java
│   ├── Gender.java
│   └── BookingStatus.java
│
└── Main.java
```

---

## 🗄️ Database Tables

### Bus
- Bus ID
- Bus Name
- Source
- Destination
- Departure Time
- Arrival Time
- Total Seats
- Available Seats
- Ticket Price
- Bus Type

### Passenger
- Passenger ID
- Passenger Name
- Age
- Gender
- Phone Number

### Booking
- Booking ID
- Bus ID
- Passenger ID
- Seat Number
- Booking Status
- Booking Date & Time

---

## ⚙️ How to Run

1. Clone the repository

```bash
git clone https://github.com/Avansh45/Core-Java.git
```

2. Open the project in IntelliJ IDEA or Eclipse.

3. Create a MySQL database named:

```
BusBookingDB
```

4. Execute the SQL script to create the required tables.

5. Update the database credentials in:

```
DBConnection.java
```

```java
private static String URL = "jdbc:mysql://localhost:3306/BusBookingDB";
private static String USERNAME = "root";
private static String PASSWORD = "your_password";
```

6. Run:

```
Main.java
```

---

## 🎯 Concepts Covered

- Core Java
- JDBC
- MySQL
- CRUD Operations
- DAO Design Pattern
- Transactions (Commit & Rollback)
- Exception Handling
- Collections
- Enum
- Object-Oriented Programming

---

## 🚀 Future Improvements

- Login Authentication
- Admin & User Roles
- Online Payment Integration
- Bus Seat Layout
- Spring Boot REST API
- React Frontend

---

## 👨‍💻 Author

**Avansh Chadgal**

GitHub: https://github.com/Avansh45