# Lab: 02 - Arrays, for loops, testing

## Featured Tasks

### Rolling Dice

- Write a method called `roll` that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.
- IN: `roll(4)`
- OUT: [3, 2, 1, 5]


### Contains Duplicates

- Write a method called `containsDuplicates` that returns true or false depending on whether the array contains duplicate values.
- IN: `containsDuplicates(ArrayList<> arr)`
- OUT: boolean

### Calculating Averages

- Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.
- IN: `averages(int[] arr)` or `averages(ArrayList<Integer> arr)`
- OUT: int (value of averages)

### Arrays of Arrays

- Given an array of arrays calculate the average value for each array and return the array with the lowest average.
- IN: lowestAverages(int[][] arr)
- OUT: String

## Classes and Methods Used

### Classes Used

- ArrayList
    - `.add()`
    - Adds a piece of data to the created array list.

- Random
    - `.nextInt() + 1`
    - Selects a random number from a range of numbers dictated by the bound + 1.

### Other Methods Used

- `Double.POISITIVE_INIFITY`;
  - Creates the highest positive value possible.

## Skills Exercised

- Create a new library using gradle init --type java-library
- Creating / Using methods
- Importing class packages
- Looking at documentation Via [Java Docs](https://docs.oracle.com/javase/8/docs/api/)
- JUnit Jupiter Testing
- ArrayLists with a specified data type
- Regular array syntax
  - Initializing the length
  - Hardcoding values and length
- Array of arrays `int[][]`

## Reflection / Notes

- To create a basic project, you can use `gradle init --type java-library` which will create a default files needed to create a gradle project.
- You can import prebuilt Java packages and utilize the contents and logic immediately.
1. `import java.util.Random`
2. Declare the appropriate object `Random randomVariable = new Random`.
3. Go on oracle or type `randomVariable.` the `.` shows methods that the object has.
- Different types of loops in Java (Links to an external site.)
> "looping is a feature which facilitates the execution of a set of instructions until the controlling Boolean-expression evaluates to false."
- for loop 
  - Typically used when we have a finite range of numbers.
- while loop
  - Repeats while boolean expression is true.
  - Used when size of array or expression is unknown.
- do-while loop
  - Same as while, but runs at least 1 iteration even if the boolean expression is false.

### Testing
- Testing is fairly simple
- Default settings are initialized with `gradle init`
1. Import test packages
   - `import org.junit.jupiter.api.Test;`
   - `import static org.junit.jupiter.api.Assertions.*;`
2. Create main test class `class LibraryTest {`
3. `@Test void testName(){}` make a test for each part of the application
4. Always `Library sut = new Library();` this allows you access to the methods within the methods of your library class
5. Access methods by using `sut.methodName()`
6. Create arguments to put into the methods
7. Assert a return value by `assertEquals / assert` that the method should return or not return
   - It is good to assert an expected and unexpected values for each test