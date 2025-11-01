# Assignment 4 – Automated Test Generation Comparison

# Course: CS 3354 – Software Engineering

## Project Summary
This repository explores three different approaches to automated unit test generation for Java programs.  
The goal is to understand how each tool performs in terms of test coverage, efficiency, and readability.

### Tools Compared
| Tool | Type | Key Feature |
|------|------|--------------|
| **EvoSuite** | Search-based | Evolutionary algorithm generates optimized tests |
| **Randoop** | Randomized | Quick test creation using random input sequences |
| **ChatGPT** | AI-based | Human-readable, logic-aware test suggestions |

---

## 🧱 Project Layout

```text
assignment4-testing/
│
├── pom.xml
├── README.md
│
├── src/
│   └── Stack.java
│
└── test/
    ├── chatgpt/
    │   └── ChatGPTTest.java
    ├── randoop/
    │   ├── RegressionTest0.java
    │   └── ErrorTest0.java
    └── evosuite/
        ├── EvoSuiteTest.java
        └── EvoSuiteRegressionTest.java



## Note:  
Each folder contains automatically generated test cases for the same `Stack.java` class.

## Environment Setup
- **Java 8+**
- **Maven**
- **Testing Tools:** EvoSuite, Randoop, ChatGPT  
- **Coverage Tools:** JaCoCo / IntelliJ Coverage Report

