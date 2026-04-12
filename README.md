# Java DSA Roadmap Repository

This repository is organized as a Java-first DSA workspace for structured learning, revision, and problem-solving practice.
The current implementation lives inside `DSA-Java/`, with topic-wise source folders under `src/`.

## Why Java for DSA?

- Clean and readable syntax for interviews
- Strong OOP foundation
- Rich collections framework
- Great support on coding platforms
- Widely used in product-based company interviews

## Java DSA Quick Start

Compile all current examples from the `DSA-Java` folder:

```powershell
javac src\basics\*.java src\arrays\*.java src\sorting\*.java
```

Run any class with its package name, for example:

```powershell
java -cp src sorting.BubbleSort
```

Minimal Java example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java DSA!");
    }
}
```

## DSA Learning Roadmap (Java)

### Phase 0: Java Basics for DSA

- Input/output (Scanner, BufferedReader)
- Data types and operators
- Conditions and loops
- Functions and recursion basics
- Arrays and strings basics
- Time and space complexity basics

### Phase 1: Beginner DSA

- Arrays (traversal, prefix sum, two pointers)
- Strings (palindrome, anagram, substring patterns)
- Sorting (bubble, selection, insertion, merge, quick)
- Binary search patterns
- Basic hashing (HashMap, HashSet)

### Phase 2: Core DSA

- Linked list (singly, doubly, circular)
- Stack and queue
- Recursion and backtracking
- Bit manipulation
- Sliding window
- Greedy basics

### Phase 3: Intermediate DSA

- Trees (traversals, height, diameter, LCA)
- Binary search tree
- Heap and priority queue
- Tries
- Graphs (BFS, DFS, shortest path, MST)

### Phase 4: Advanced DSA

- Dynamic programming (1D, 2D, subsequence, knapsack)
- Advanced graph algorithms (Dijkstra, Bellman-Ford, Floyd-Warshall, DSU)
- Segment tree and Fenwick tree
- Monotonic stack/queue
- String algorithms (KMP, Rabin-Karp, Z algorithm)

### Phase 5: Interview Preparation

- Topic-wise revision sheets
- 150-300 curated interview questions
- Timed mock contests
- Company-wise question practice

## Problem Solving Strategy

- First solve brute force
- Optimize step by step
- Write clean Java code
- Dry run on custom test cases
- Maintain notes for patterns and mistakes

## Suggested Weekly Plan

- Week 1-2: Java basics + arrays + strings
- Week 3-4: Linked list, stack, queue, recursion
- Week 5-6: Trees, BST, heap, hashing
- Week 7-8: Graphs + dynamic programming
- Week 9+: Mixed problem solving + mock interviews

## Practice Platforms

- LeetCode
- GeeksforGeeks
- CodeStudio / Naukri
- Codeforces (for speed and contests)

## Current Workspace Structure

```text
Full-DSA/
|-- DSA-Java/
|   `-- src/
|       |-- basics/
|       |   |-- PrintArray.java
|       |   |-- FindMin.java
|       |   `-- FindMax.java
|       |-- arrays/
|       |   |-- LinearSearch.java
|       |   |-- ReverseArray.java
|       |   `-- Duplicates.java
|       |-- sorting/
|       |   |-- BubbleSort.java
|       |   `-- SelectionSort.java
|       `-- future/
|           |-- linkedlist/
|           |-- stack/
|           `-- tree/
`-- README.md
```

## Topic Progress

- `basics`: basic array traversal and min/max operations
- `arrays`: linear search, reverse array, duplicate detection
- `sorting`: bubble sort and selection sort
- `future`: placeholders for linked list, stack, and tree implementations

## Next Expansion Plan

- Add `strings`, `binarysearch`, and `hashing` packages
- Add `linkedlist`, `stack`, and `tree` implementations under `future/`
- Add one driver or notes file per topic with common patterns and edge cases

## Final Tips

- Daily 2-4 problems solve karo with consistency.
- Har topic ke baad revision problems mandatory rakho.
- Ek mistakes notebook maintain karo.
- Code quality pe focus karo: naming, dry-run comments, edge cases.
