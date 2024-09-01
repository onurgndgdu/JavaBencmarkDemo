## JIT Optimization Demo
This project demonstrates the impact of Just-In-Time (JIT) Compiler Optimization in Java. The code performs a simple calculation inside a loop with a large number of iterations to show how the JIT compiler optimizes code during runtime.

### Project Description
The main idea behind this demo is to observe how the JIT compiler optimizes repetitive tasks during execution, speeding up the overall performance. In this case, we repeatedly call a method that computes a mathematical operation, and we measure the total execution time.

### Code Explanation:
compute() Method:
This method calculates the result of using Math.pow(). It’s a simple mathematical operation that will be called a billion times in a loop.
### Main Execution:
The loop runs 1 billion iterations (1_000_000_000), calling the compute() method in each iteration.
The execution time is measured in nanoseconds using System.nanoTime(), and the result is displayed in milliseconds.
Key Concepts:
### JIT Compiler:
Java uses the JIT compiler to optimize bytecode during runtime. The JIT compiler dynamically compiles the "hot" code (code that is executed frequently) into native machine code, optimizing for speed.
### Optimization:
This demo shows how the JIT compiler optimizes code that contains repetitive tasks, such as calling the compute() method in a loop. The JIT may inline the method or cache results to avoid redundant calculations.

### Expected Output:
The program will print the total execution time for completing 1 billion calls to the compute() method, demonstrating the impact of JIT optimization.
Execution Time: <time> ms
