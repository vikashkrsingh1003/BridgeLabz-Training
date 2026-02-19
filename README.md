
# Week 4 – Java Collections & Streams

---

##  Day 1: Introduction to Generics  
**Date:** 9 January 2026  

###  Topics Covered
- Introduction to Generics  
- Type Parameters  
- Generic Classes  
- Generic Methods  
- Bounded Type Parameters  
- Wildcards  

Focus was on **Java Generics**, which help in writing **reusable, type-safe, and cleaner code**.

### Why Generics?
- Prevents ClassCastException  
- Eliminates the need for explicit type casting  
- Promotes code reusability  
- Improves readability and maintainability  

###  Questions Practice
Worked on multiple problem statements based on Generics:
- Smart Warehouse Management System  
- Dynamic Online Marketplace  
- Multi-Level University Course Management System  
- Personalized Meal Plan Generator  
- AI-Driven Resume Screening System  

**Code Link:** [(https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/gcr-codebase/JavaCollections/src/com/generics)] 

---

##  Day 2: Collections Framework  
**Date:** 16 January 2026  

###  Topics Covered
- Overview of the Collections Framework  
- Architecture and hierarchy  
- List interface and its implementations  
- Set interface and its implementations  
- Queue and Deque interfaces  
- Map interface and its implementations  
- Comparison of different implementations  
- Real-world use cases and best practices  

### Questions Implemented

#### List Interface
- Reverse a List  
- Find Frequency of Elements  
- Rotate Elements in a List  
- Remove Duplicates While Preserving Order  
- Find Nth Element from End (LinkedList)

#### Set Interface
- Check if Two Sets Are Equal  
- Union and Intersection of Two Sets  
- Symmetric Difference of Two Sets  
- Convert Set to Sorted List  
- Check Subset  

#### Queue Interface & Stack Programs
- Reverse a Queue  
- Generate Binary Numbers Using Queue  
- Implement Stack Using Queues  
- Circular Buffer Simulation  
- Hospital Triage System  

#### Map Interface
- Word Frequency Counter  
- Invert a Map  
- Find Key with Highest Value  
- Merge Two Maps  
- Group Objects by Property  

### Mini Systems (Real-World Use Cases)

**Voting System**
- HashMap → vote counting  
- LinkedHashMap → vote order  
- TreeMap → sorted results  

**Shopping Cart System**
- HashMap → product prices  
- LinkedHashMap → insertion order  
- TreeMap → sorted by price  

**Banking System**
- HashMap → customer accounts  
- TreeMap → customers sorted by balance  
- Queue → withdrawal requests  

**Hospital Triage System**
- PriorityQueue → patients treated based on severity  

**Insurance Policy Management System**
- HashMap → store policies using policy numbers as keys  
- LinkedHashMap → maintain insertion order  
- TreeMap → store policies sorted by expiry date  

---

##  Day 3: Java Streams  
**Date:** 19 January 2026  

###  Topics Covered
- Java I/O Streams  
- Types of Streams: File Streams, Object Streams  
- ByteArray Streams  
- Buffered Streams  
- Reader and Writer  
- Key considerations and best practices  

### File Streams  
Used for reading from and writing to files.

**Byte-based**
- FileInputStream  
- FileOutputStream  

**Character-based**
- FileReader  
- FileWriter  

**Use Case:** Handling raw file or binary data.

### Object Streams  
Used for writing and reading Java objects.

- ObjectOutputStream  
- ObjectInputStream  

**Use Case:** Serialization and deserialization.

### ByteArray Streams  
Operate on in-memory byte data.

- ByteArrayInputStream  
- ByteArrayOutputStream  

**Use Case:** In-memory processing and image manipulation.

### Buffered Streams  
Enhance performance by minimizing I/O operations.

- BufferedInputStream  
- BufferedOutputStream  
- BufferedReader  
- BufferedWriter  

### Reader and Writer Streams  
Handle character data with encoding support.

- FileReader  
- FileWriter  
- BufferedReader  
- BufferedWriter  
- InputStreamReader  
- OutputStreamWriter  

### Questions Implemented
- File Handling – Read and Write a Text File  
- Buffered Streams – Efficient File Copy  
- Read User Input from Console  
- Serialization – Save and Retrieve an Object  
- ByteArray Stream – Convert Image to ByteArray  
- Filter Streams – Convert Uppercase to Lowercase  
- Data Streams – Store and Retrieve Primitive Data  
- Piped Streams – Inter-Thread Communication  
- Read a Large File Line by Line  
- Count Words in a File  

**Code Link:** [Java I/O & Streams](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/gcr-codebase/JavaCollections/src/com/streams)  

---

##  Day 4: Exception Handling in Java  
**Date:** 20 January 2026  

###  Topics Covered
- Exceptions and their types  
- Checked and Unchecked Exceptions  
- Custom Exceptions  
- Exception handling mechanisms  
  - try-catch  
  - try-catch-finally  
  - try-with-resources  
  - throw and throws  

### Questions Implemented
- Checked Exception  
- Unchecked Exception  
- Custom Exception  
- Multiple Catch Blocks  
- try-with-resources  
- throw vs throws  
- finally Block Execution  
- Exception Propagation  
- Nested try-catch  
- Bank Transaction System  

**Code Link:** [Exception Handling in Java](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/gcr-codebase/JavaCollections/src/com/exceptions)  

---

##  Day 5: Java Regex & JUnit Framework  
**Date:** 21 January 2026  

###  Topics Covered
**Regex**
- MetaCharacters  
- Quantifiers  
- Common patterns (Email, Password, Phone, etc.)  
- Pattern and Matcher classes  

**JUnit**
- Introduction to JUnit  
- Annotations  
- Writing test cases  
- Assertions  

### Practice Sections Included
- Regex Practice Questions  
- JUnit Practice Questions  
- Advanced JUnit Practice Questions  

**Code Links:**  
[Java Regex] () 
[JUnit Framework(Logic and test class)](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/gcr-codebase/JavaCollections/src/com/jtest)

---

##  Day 6: Annotations & Reflection in Java  
**Date:** 22 January 2026  

###  Topics Covered
- Introduction to Annotations  
- Built-in and Custom Annotations  
- Retention Policies & Targets  
- Annotation Processing Tools  
- Reflection and its usage  

Covered how annotations and reflection are used in framework development, dependency injection, ORM mapping, and testing frameworks.

Includes:
- Basic, Intermediate, and Advanced Reflection Problems  
- Practice Problems for Custom Annotations  

**Code Links:**  
[Annotation Concepts and Question](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/gcr-codebase/JavaCollections/src/com/annotations)  
[Reflection in Java and Question](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/gcr-codebase/JavaCollections/src/com/reflection)  

---

## Section B – Scenario-Based Questions

### Java Practice Projects
- TravelLog – Trip Organizer for Backpackers  
- FeedbackGuru – Smart Survey Analyzer  
- CodeRepoCleaner – Java File Scanner and Organizer  
- ExamScanner – Digital Answer Sheet Validator  
- MedInventory – Smart Hospital Inventory Tracker  
- ChatLogParser – Messaging Pattern Analyzer  
- SongVault – Personal Music Library Manager  
- ExamResultUploader – Bulk Marks Processing  
- DealTracker – E-Commerce Discount Validator  

**Code Link:**  
  
     [Scenario-Based Questions]  ( https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-collection-practice/java-collection-practice/scenario-based-codebase/CollectionScenarioBased)
---
