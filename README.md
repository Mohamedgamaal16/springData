

## ⚙️ Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Lombok
- H2 
- Maven

---

## 🔁 Features

- ✅ Get employee by ID
- ✅ Get all employees
- ✅ Create new employee
- ✅ Update existing employee
- ✅ Delete employee
- 🔄 DTO <-> Entity conversion

---

## 🔌 REST API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/employee/get-emp?id={id}`       | Get employee by ID       |
| GET    | `/employee/get-allemp`            | Get all employees        |
| POST   | `/employee/save-emp`              | Create new employee      |
| PUT    | `/employee/update-emp?id={id}`    | Update employee          |
| DELETE | `/employee/delete-emp?id={id}`    | Delete employee by ID    |

---

## 🧱 DTO vs Entity

- **Entity**: Represents the database structure, mapped using JPA annotations.
- **DTO**: Used to transfer data between the API and service layers, decoupled from database details.

---

## ▶️ How to Run

1. Clone the project:

   ```bash
   git clone https://github.com/your-username/spring-data-train.git
   cd spring-data-train
