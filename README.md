#  Week 5 – File Data Handling in Java

This module focuses on handling structured data formats such as **CSV** and **JSON** using Java. It covers reading, writing, parsing, validation, and real-world data processing tasks.

---

##  Learning Schedule

| Day | Topic |
|-----|-------|
| Day 1 | Working with CSV Files in Java |
| Day 2 | Working with JSON Data in Java |

---

#  Day 1 – Working with CSV Files in Java
**Date:** 23 January 2026

##  Topics Covered

- Introduction to CSV
- Reading CSV Files
- Writing CSV Files
- Parsing CSV Data
- Data Validation

---

##  Introduction to CSV

CSV (Comma-Separated Values) is a lightweight file format used to store tabular data.

Each line represents a record, and values are separated by commas.

Example:

```
id,name,marks
101,Ravi,85
102,Aman,90
```

---

##  Reading CSV Files

CSV files are processed line by line using I/O streams such as:

- FileReader
- BufferedReader

Headers can be skipped when needed, and buffering helps handle large files efficiently.

---

##  Writing CSV Files

CSV data is written using:

- FileWriter
- BufferedWriter

Each record is formatted in comma-separated form with proper line breaks.

---

## Parsing CSV Data

Parsing involves splitting each line into fields using delimiters like commas.

Extra care is needed to manage:

- Missing values
- Incorrect formats
- Extra spaces

---

##  Data Validation

Validation ensures data accuracy and consistency.

Common checks include:

- Column count verification
- Data type validation
- Range checks
- Regex-based pattern validation

---

##  Practice Problems on CSV Data Handling

###  Basic Problems

- Read a CSV File and Print Data
- Write Data to a CSV File
- Read and Count Rows in a CSV File

###  Intermediate Problems

- Filter Records from CSV
- Search for a Record in CSV
- Modify a CSV File (Update a Value)
- Sort CSV Records by a Column

###  Advanced Problems

- Validate CSV Data Before Processing
- Convert CSV Data into Java Objects
- Merge Two CSV Files
- Read Large CSV File Efficiently
- Detect Duplicates in a CSV File
- Generate a CSV Report from Database
- Convert JSON to CSV and Vice Versa
- Encrypt and Decrypt CSV Data


## Code Links
- Working with CSV Files in Java:  
   [CSV Code Link](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-iostreams-practice/java-iostreams-practice/gcr-codebase/JavaIostreamsPractice/src/main/java/com/csvdata)

---

#  Day 2 – Working with JSON Data in Java
**Date:** 24 January 2026

##  Topics Covered

- Introduction to JSON
- Reading JSON Data
- Writing JSON Data
- Parsing JSON Data
- JSON Schema Validation

---

##  Introduction to JSON

JSON is a lightweight data format using key–value pairs.

Example:

```json
{
  "id": 101,
  "name": "Ravi",
  "marks": 85
}
```

---

##  Reading JSON Data

JSON can be read using:

- File I/O Streams
- Libraries like Jackson or Gson

---

##  Writing JSON Data

Convert Java objects into JSON format and save to files.

---

##  Parsing JSON Data

Tasks include:

- Extracting values
- Iterating arrays
- Handling nested objects

---

##  JSON Schema Validation

Ensures:

- Correct fields
- Data types
- Constraints

---

##  Practice Problems on JSON

- Create JSON Object
- Convert Java Object to JSON
- Read JSON and Extract Fields
- Merge JSON Objects
- Validate JSON
- Convert List to JSON Array
- Filter JSON Records

---

##  Hands-on Practice Problems

- Print All JSON Keys
- Filter Users > 25
- Validate Email Field
- Merge JSON Files
- Convert JSON ↔ XML
- Convert CSV → JSON
- Generate JSON Report

---

##  Technologies Used

- Java
- File I/O (BufferedReader, FileWriter, etc.)
- Gson / Jackson Libraries

---

##  Project Structure (Example)

```
Week5-FileHandling/
│── csv/
│   ├── ReadCSV.java
│   ├── WriteCSV.java
│   └── ParseCSV.java
│
│── json/
│   ├── ReadJSON.java
│   ├── WriteJSON.java
│   └── ParseJSON.java
│
└── README.md
```

---

##  Learning Outcomes

After completing this module, you will be able to:

✔ Read and write CSV files in Java  
✔ Parse structured data efficiently  
✔ Validate data before processing  
✔ Work with JSON using Java libraries  
✔ Convert data between formats (CSV ↔ JSON)  
✔ Build real-world data processing applications  

## Code Links
- Working with JSON Data in Java:
   [JSON Code Link](https://github.com/vikashkrsingh1003/BridgeLabz-Training/tree/java-iostreams-practice/java-iostreams-practice/gcr-codebase/JavaIostreamsPractice/src/main/java/com/jsondata)
---

