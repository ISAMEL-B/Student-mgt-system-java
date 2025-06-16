
```markdown
# 📚 Rain Ville Secondary School – Student Management System  

**Format** Drag and drop
**Package**: `bse`  
**IDE**: NetBeans 8.2 | **Build**: Maven  
**Database**: MySQL (`mydb`) via JDBC  
**GUI**: Java Swing + JDateChooser  
**PDF Reports**: iText 5  

---

## 🧩 Overview  
A comprehensive desktop app for managing student and teacher data at Rain Ville Secondary School, featuring:
- CRUD operations for students and teachers
- Recording student marks per subject
- Generating PDF reports (students, marks, gender stats)
- GUI date input via JDateChooser

---

## 💻 Features

### ✅ Student Management  
- Add/edit/delete student details: ID, name, DOB, class, gender, contact  
- Manage marks for subjects

### ✅ Teacher Management  
- CRUD operations for teachers: ID, name, DOB, gender, subject

### ✅ Report Generation (via iText)  
- PDF lists of all students and teachers  
- Summary stats (e.g. total students, male/female counts)  
- Downloadable mark sheets per student

### ✅ GUI Components  
- User-friendly Swing interface  
- Date selection powered by JDateChooser  
- File dialogs for saving/printing reports

---

## 🛠️ Technologies

- **Java** 8+  
- **Maven**  
- **iText 7** for PDF exports  
- **JDateChooser** for date picking  
- **JDBC** & **MySQL Connector/J** for DB  
- **Swing** for GUI

````

---

## ⚙️ Setup Instructions

1. **Clone the repo**  
   ```bash
   git clone https://github.com/ISAMEL-B/Student-mgt-system-java.git
````

2. **Configure `pom.xml`**
   Maven dependencies:

Download `mysql-connector-java-8.0.33.jar` from [here](https://dev.mysql.com/downloads/connector/j/) and place it in the `lib` folder.

Download `itextpdf-5.5.14.jar` from [here](https://mvnrepository.com/artifact/com.itextpdf/itextpdf/5.5.14) and place it in the `lib` folder.

3. **Create MySQL schema `mydb`**

  * `CREATE SCHEMA mydb;`

4. **Import project into NetBeans**

   * `File → Open Project → rainville-sms`

5. **Run application**

   * Locate `Main.java`, right-click → `Run File`

---

## 📄 Using the App

* **Students**: Add/edit/remove records; record marks per subject

* **Teachers**: Add/edit/remove teacher records

* **PDF Reports**:

  * All students list + total count
  * All teachers list + gender breakdown
  * Individual student mark sheet + average
    → Saved via file dialog

* **Date Fields**: Select using JDateChooser

---

## 🛡️ Developer

* **Byaruhanga Isamel**
  BSc Software Engineering, MUST – Uganda
  📧 [byaruhanga.isamel@example.com](mailto:byaruhanga.isamel@example.com)

---

## 📜 License

MIT License — free to use and modify for education and personal use. See [LICENSE](LICENSE).

---

## ✨ Next Improvements

* Export to CSV/Excel
* User authentication and roles
* Graphical charts for grade distribution
* Backup & restore database