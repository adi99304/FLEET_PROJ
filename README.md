<div align="center">

# 🚚 NexisFleet

### AI-Powered Fleet Management Platform

<p align="center">

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-green?style=for-the-badge&logo=springboot)
![React](https://img.shields.io/badge/React-Frontend-61DAFB?style=for-the-badge&logo=react)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Spring AI](https://img.shields.io/badge/Spring_AI-Ollama-purple?style=for-the-badge)

</p>

*A modern Fleet Management System that automates logistics operations using Spring Boot, React, MySQL, and Spring AI.*

</div>

---

# 📌 Overview

NexisFleet is a full-stack fleet management platform designed to streamline logistics operations by managing **customers, shipments, warehouses, vehicles, and drivers**.

The platform also integrates **Spring AI with Ollama** to generate intelligent fleet summaries, operational insights, and AI-assisted reports.

---

# ✨ Features

## 📦 Shipment Management

- Create & manage shipments
- Automatic tracking number generation
- Warehouse allocation
- Vehicle assignment
- Shipment status tracking

## 🚚 Vehicle Management

- Vehicle registration
- Capacity tracking
- Availability management
- Driver assignment

## 👨‍✈️ Driver Management

- Driver registration
- Availability tracking
- Vehicle assignment

## 🏭 Warehouse Management

- Warehouse capacity monitoring
- City-based warehouse allocation
- Automatic capacity updates

## 🤖 AI Features

- AI Fleet Reports
- Dashboard Summary
- Natural Language Queries
- Logistics Recommendations

---



# 🛠 Tech Stack

| Category | Technology |
|----------|------------|
| Backend | Spring Boot |
| Language | Java 21 |
| Frontend | React + Vite |
| Database | MySQL |
| ORM | Hibernate / JPA |
| AI | Spring AI |
| LLM | Ollama (Qwen) |
| Build Tool | Maven |

---

# 🗄 Database Design

The application follows a normalized relational database design to efficiently manage customers, shipments, warehouses, vehicles, and drivers while maintaining scalable relationships between logistics entities.

<div align="center">

### Entity Relationship Diagram (ERD)

<p align="center">
  <a href="https://drawsql.app/teams/aditya-nu/diagrams/fleet-management">
    <img src="https://drawsql.app/teams/aditya-nu/diagrams/fleet-management/embed" alt="Fleet Management Database Design" width="100%">
  </a>
</p>

**Click the diagram to view it in full size.**

</div>

---

### Core Relationships

- 👥 **Customer → Shipment** (One-to-Many)
- 🏭 **Warehouse → Shipment** (One-to-Many)
- 🚚 **Vehicle → Shipment** (One-to-Many)
- 👨‍✈️ **Driver → Vehicle** (One-to-One)
- 📦 **Shipment** acts as the central entity connecting customers, warehouses, and vehicles.

The schema is designed to reduce redundancy while allowing future extensions such as route optimization, live tracking, predictive maintenance, and AI-assisted fleet planning.
# 📂 Project Structure

```text
backend
├── controller
├── service
├── repository
├── model
├── dto
├── enums
└── config

frontend
├── components
├── pages
├── services
└── assets
```

---

# 🚀 Getting Started

## Backend

```bash
git clone <repository-url>

cd backend

mvn spring-boot:run
```

## Frontend

```bash
cd frontend

npm install

npm run dev
```

---

# 🤖 AI Integration

The AI module is powered by **Spring AI** and **Ollama (Qwen)**.

It can generate:

- Fleet summaries
- Shipment reports
- Operational insights
- AI recommendations

---

# 📅 Roadmap

- ✅ Customer Module
- ✅ Warehouse Module
- ✅ Vehicle Module
- ✅ Driver Module
- ✅ Shipment Module
- ✅ Dashboard
- ✅ Spring AI Integration

### Upcoming

- Live GPS Tracking
- Route Optimization
- JWT Authentication
- Kafka
- Docker
- Kubernetes
- Predictive Maintenance

---

# 👨‍💻 Author

**Aditya Hegde**

Final Year B.Tech Project

---

<div align="center">

⭐ If you found this project interesting, consider giving it a star!

</div>
