# 🏨 Reto QA Leader

This repository contains the test automation for the **SampleApp** uitesting playground platform. It uses **SerenityBDD**, **selenium** with **Cucumber** and the **POM** design pattern to ensure robust and maintainable tests.

## 📌 Technologies Used

- **Java 21**
- **SerenityBDD**
- **CucumberBDD**
- **POM Pattern**
- **Gradle 8.6**
- **Selenium WebDriver**

## 📁 Project Structure

```
📦 RetoQALeader-automation
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java/com/certificacion/HansJ/app
|   |   |   ├── 📂 controller
│   │   │   ├── 📂 helpers
│   │   │   ├── 📂 page
│   ├── 📂 test
│   │   ├── 📂 java/com/certificacion/HansJ/app/runners
│   │   ├── 📂 resources/features
├── 📜 build.gradle
├── 📜 serenity.conf
├── 📜 README.md
```

## 🚀 Instalación y Configuración

### 1️⃣ Clone the repository
```sh
git clone git@github.com:hgomezcoron/Reto_QA_Leader.git
main: CI/CD logic
```

### 2️⃣ Configure dependencies with Gradle
```sh
gradle clean build
```

### 3️⃣ Run the tests

To execute the tests from the terminal:
```sh
gradle clean test
```
To generate the Serenity report:
```sh
gradle aggregate
```

## 🧪 Running Tests by Tags
You can run specific tests using tags:
```sh
gradle test -Dcucumber.options="--tags @SampleApp"
```

## 📜  Implemented Scenarios
- **Successful Login** 
- **Login with Invalid Password** 
- **Login with Empty Fields**
- **Login with Only Username**
- **Login with Only Password**
- **Logout After Successful Login**

##Once the tests are executed, Serenity automatically generates a detailed test report. To view it, open:
```sh
target/site/serenity/index.html
```

## 🛠 Maintenance and Contribution
1. **Create a new branch for your improvement**: `git checkout -b feature/nueva-mejora`
2. **Make changes and commit:shCopiarEditar**: `git commit -m 'Añadir nueva funcionalidad'`
3. **Push the changes**: `git push origin feature/nueva-mejora`
4. **Open a Pull Request** 🛠

---

📌 **Contact:** For inquiries, reach out to[hgomezcoron@gmail.com](mailto:tu.email@example.com)
