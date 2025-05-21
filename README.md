# 🧒 Kids Monitoring App - Java GUI Project

A simple Java application implementing the **Observer Design Pattern** to simulate a kids monitoring system using **Swing GUI**. It notifies a parent and emergency service when dangerous activity is detected by a sensor.

---

## 📌 Project Overview

This application demonstrates the use of:
- **Observer Pattern** (for event-based notification)
- **Java Swing GUI** (for user interaction and alerts)

The app provides a button to simulate dangerous activity. Once clicked, two alert popups notify the registered observers: the parent and emergency services.

---

## 🚀 Features

- Simple & interactive Java GUI
- Simulates real-world sensor alerts
- Uses `JOptionPane` dialogs for notifications
- Follows **SOLID design principles**

---

## 🧱 Class Structure

| Class Name             | Purpose                                  |
|------------------------|------------------------------------------|
| `Observer`             | Interface for all observers              |
| `Sensor`               | Detects activity and notifies observers  |
| `ParentApp`            | Observer - receives alert notifications  |
| `EmergencyService`     | Observer - receives alert notifications  |
| `KidsMonitoringGUIApp` | GUI + Main class                         |

---

## 🛠️ Technologies Used

- Java 8+
- Java Swing (GUI)
- NetBeans IDE (Recommended)
- OOP + Design Patterns

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
git clone https://github.com/Hamadkhan122/SDA-MIDLAB.git

