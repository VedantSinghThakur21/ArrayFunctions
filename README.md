# Java Number Processing Program  

## **Table of Contents**  
- [Introduction](#introduction)  
- [Features](#features)  
- [Technologies Used](#technologies-used)  
- [Project Structure](#project-structure)  
- [How It Works](#how-it-works)  
- [Installation & Execution](#installation--execution)  
- [Code Explanation](#code-explanation)  
- [Contributors](#contributors)  

---

## **Introduction**  
This Java program processes user-input numbers through multiple tasks. It separates even and odd numbers, finds the smallest adjacent pair, and demonstrates array-to-ArrayList conversion. The project follows Object-Oriented Programming (OOP) principles for modular and efficient design.  

---

## **Features**  
✔️ Accepts an integer array from user input  
✔️ Separates even and odd numbers  
✔️ Finds the index of the smallest adjacent pair in the array  
✔️ Converts the array to an `ArrayList` and back  
✔️ Uses **object-oriented programming (OOP) principles**  

---

## **Technologies Used**  
- **Java** (JDK 8+)  
- **Object-Oriented Programming (OOP)**  
- **Scanner for User Input**  

---

## **Project Structure**  

ArrayFunctions

  ├── Main.java               # Entry point of the program
 
  ├── UserInputHandler.java   # Handles user input operations
 
  ├── EvenOddSeparator.java   # Separates even and odd numbers
 
  ├── SmallestDistanceFinder.java # Finds smallest adjacent pair index
 
  ├── ArrayConverter.java     # Converts array to ArrayList and back
 
  └── README.md               # Project documentation
 
---

## **How It Works**  
1. The program asks the user for the size of an integer array.  
2. The user inputs the array elements.  
3. It then performs the following operations:  
   - **Separates even and odd numbers** and displays them.  
   - **Finds the index of the first number** in the smallest adjacent pair based on absolute difference.  
   - **Converts the array to an `ArrayList`** and back to an array.  
4. Finally, the program outputs the results and closes the scanner.  

---

## **Installation & Execution**  

### **Step 1: Compile the Java Files**
```sh
javac Main.java UserInputHandler.java EvenOddSeparator.java SmallestDistanceFinder.java ArrayConverter.java
```
---

## **Code Explanation**

1️⃣ Main.java (Entry Point)
  - Handles user input.
  - Calls the necessary classes to process the data.
  - Displays the final results.

2️⃣ UserInputHandler.java (Handles User Input)
  - Reads an integer array from the user.
  - Uses a Scanner for input handling.
  - Closes the scanner at the end.

3️⃣ EvenOddSeparator.java (Separates Even and Odd Numbers)
  - Iterates through the array.
  - Stores even and odd numbers in separate lists.
  - Prints them to the console.

4️⃣ SmallestDistanceFinder.java (Finds Smallest Adjacent Pair)
  - Calculates the absolute difference between adjacent elements.
  - Identifies the index of the first number in the smallest adjacent pair.

5️⃣ ArrayConverter.java (Converts Array to ArrayList and Back)
  - Converts an integer array to a List<Integer>.
  - Converts the ArrayList back to an integer array.

---

## **Contributors**

Vedant Singh Thakur

Batch: AIML B3

PRN: 23070126144

---

## **License**

This Project is Open-Src and free to use for any educational purposes
