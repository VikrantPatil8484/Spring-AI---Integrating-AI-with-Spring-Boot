# 🧠 InsightMate - Research Assistant Chrome Extension using Spring Boot + Gemini API

This project is an **AI-powered Research Assistant** Chrome Extension built using **Spring Boot** as the backend and **Google's Gemini API** for summarizing web content. It helps users summarize long web articles and take notes right from their browser.

---

## ✨ Features

- 📄 Summarize selected text from any webpage using Gemini AI.
- 📝 Take and store notes directly in the browser using local storage.
- 🔐 Secure, modular backend using Spring Boot with WebClient.
- 🔌 Real-time communication between Chrome Extension and backend API.
- 🚀 Built-in validations to ensure smooth user experience.
- 🌍 Designed for researchers, developers, and content readers.

---

## 📂 Tech Stack

| Layer          | Tech Used                                |
|----------------|--------------------------------------------|
| Frontend       | JavaScript, HTML, Chrome Extension        |
| Backend        | Java Spring Boot, WebFlux, WebClient      |
| AI Integration | Google Gemini API                         |
| Dev Tools      | IntelliJ, Postman, Spring Initializr      |
| Storage        | Local Storage (in browser)                |

---

## 🧑‍💻 How the Project Works (Workflow)

```mermaid
graph LR
A[User visits webpage] --> B[User selects text]
B --> C[Extension captures text]
C --> D[Send text to Spring Boot backend via fetch]
D --> E[Spring Boot controller receives request]
E --> F[Call Gemini API using WebClient]
F --> G[Gemini returns summary]
G --> H[Backend sends summary to extension]
H --> I[Extension displays summary and stores note in localStorage]
