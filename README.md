# Lab: 01 - Java primitives and control flow

## Featured Tasks

### pluralize (String, int)

- Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an "s" if the number is zero or greater than 1


### flipNHeads(int)

- Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

### timer()

- Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.

Zero-pad single digit numbers as strings so the timestamp is always the same number of characters.

## Classes and Methods Used

### Classes Used

- DateTimeFormatter
    - `.ofPattern()`
    - Takes the time of your computer of a certain pattern

- LocalDateTime
    - `.format(DateTimeFormatter.ofPattern("HH:mm:ss"))`
    - Sets the time format to Hours, Minutes, Seconds

- Random
    - `.nextDouble()`
        - Finds a random double from 0.0 - 1

- Timer
    - `.schedule(new TimerTask, timelong, timeshort)`
    - Creates a time interval to perfrom the timertask

- TimerTask
    - Creates a task to perform within the timer

### Created Methods

- `pluralize(String, int)`
    - Returns a string with the given arguments

- `flipNHeads(int)`
    - Returns a string that describes how many flips it took in total to achieve n consecutive flips

- `clock()`
    - Prints out the time in second intervals

## Skills Exercised

- Importing class packages
- Looking at documentation Via [Java Docs](https://docs.oracle.com/javase/8/docs/api/)

## Reflection

- To create a basic project, you can use `gradle init --type java-library` which will create a default files needed to create a gradle project
- You can import prebuilt Java packages and utilize the contents and logic immediately.
1. `import java.util.Random`
2. Declare the appropriate object `Random randomVariable = new Random`.
3. Go on oracle or type `randomVariable.` the `.` shows you methods that the object has.
