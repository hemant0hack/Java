# Java Practice Repository

A beginner-friendly Java practice repository with small standalone programs for core topics: conditionals, methods, arrays, and loops.

## What is in this repository

- 50+ Java practice files
- Topic-based folder structure
- Console input/output examples using `Scanner`
- Pattern and number-based problem solving exercises

## Project Structure

```text
/home/runner/work/Java/Java
├── main.java
├── int_var.java
├── Arrays/
├── Contitional/
├── Methods/
├── loops/
│   ├── for_loop/
│   ├── while_loop/
│   └── Nested_loops/pattern/
├── .vscode/
└── out/
```

## Folder Guide

### `/home/runner/work/Java/Java/Arrays`
Array basics and operations:
- `sum.java` – sum all elements
- `largest.java` / `smallest.java` – find max/min
- `evenodd.java` – even/odd checks
- `marks.java`, `cars.java` – array usage examples
- `readme.md` – short notes for arrays

### `/home/runner/work/Java/Java/Contitional`
Conditional logic exercises:
- even/odd check (`even.java`)
- leap year (`leapYear.java`)
- grade calculator (`grade.java`)
- largest number (`largestNo.java`)
- switch examples (`SwitchCase.java`, `cal.java`)
- eligibility-style checks (`vote.java`, `dl.java`)

### `/home/runner/work/Java/Java/Methods`
Method-based number logic:
- addition (`add.java`)
- factorial (`fact.java`)
- prime check (`prime.java`)
- armstrong check (`armstrong.java`)
- square/max/greater helpers (`square.java`, `max.java`, `great.java`)

### `/home/runner/work/Java/Java/loops`
Loop-focused exercises:
- `for_loop/` – counting, factorial, tables, prime/even-odd, practice questions
- `while_loop/` – reverse number, palindrome, digit count/sum, while basics
- `Nested_loops/pattern/` – star and number pattern printing programs

## Key Root Files

- `/home/runner/work/Java/Java/main.java` – basic input and output
- `/home/runner/work/Java/Java/int_var.java` – integer comparison operators
- `/home/runner/work/Java/Java/LICENSE` – project license

## How to Run Any Program

From repository root (`/home/runner/work/Java/Java`):

```bash
javac <relative-path-to-file>.java
java -cp <folder-containing-class> <ClassName>
```

### Example

```bash
javac loops/for_loop/Factorial.java
java -cp loops/for_loop Factorial
```

## Notes

- Class names are case-sensitive.
- Most files are independent learning exercises.
- `/out` contains generated build artifacts and is not source content.
