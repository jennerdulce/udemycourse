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
- 
### Analyzing Weather Data

- Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.
- IN: weatherData(int[][] arr)
```
int[][] weeklyMonthTemperatures = {
  {66, 64, 58, 65, 71, 57, 60},
  {57, 65, 65, 70, 72, 65, 51},
  {55, 54, 60, 53, 59, 57, 61},
  {65, 56, 55, 52, 55, 62, 57}
  };
```
  
- OUT: 
```
High: 72 Low: 51
Never saw temperature: 63
Never saw temperature: 67
Never saw temperature: 68
Never saw temperature: 69
```


### Tallying Election

- Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.
- IN: 
  - `tally(ArrayList)`
```
List<String> votes = new ArrayList<>();
votes.add("Bush");
votes.add("Bush");
votes.add("Bush");
votes.add("Shrub");
votes.add("Hedge");
votes.add("Shrub");
votes.add("Bush");
votes.add("Hedge");
votes.add("Bush");
tally(votes)
```
- OUT: `"Bush received the most votes!"` (String)

## Classes and Methods Used

### Classes Used

- ArrayList
  - `.add()`
    - Adds a piece of data to the created array list.

- Random
  - `.nextInt() + 1`
    - Selects a random number from a range of numbers dictated by the bound + 1.

- HashSet<Integer>
  - `.add(Object O)`
    - Adds an object to the HashSet.
  - `.contains(Object O)`
    - Checks to see if the HashSet contains the argument object.

- HashMap<String, Integer>
    - `.put(String, Integer)`
      - Adds a key / value pair to the HashMap
    - `.containsKey(String)`
      - Checks to see if the HashMap contains the given key and returns a boolean.

### Other Methods Used

- `Double.POISITIVE_INIFITY`
  - Creates the highest double value possible.
- `Integer.MAX_VALUE`
  - Creates the highest integer value possible
- `Integer.MIN_VALUE`
  - Creates the lowest integer value possible

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
- HashMap
- HashSet
- Looping throw nested arrays

## Reflection / Notes

### General

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

### Objects vs Primitives

> "Java has a two-fold type system consisting of primitives such as int, boolean and reference types such as Integer, Boolean. Every primitive type corresponds to a reference type. Every object contains a single value of the corresponding primitive type. The wrapper classes are immutable (so that their state can't change once the object is constructed) and are final (so that we can't inherit from them)."
- Objects in java are slower and have bigger memory impact than primitives
  - Footprint for primitives is smaller
- Decision on what object you should use is mainly basedon application performance
  - How much memory
  - Default Values
  - Ignore if you have no limitations
- Performance of Java code depends very much on hardware that the code runs on


### HashSet vs HashMap

1. Implementation: HashMap implements Map interface and HashSet implements Set interface. 
2. Duplicates: HashSet doesn’t allow duplicate values. HashMap stores key, value pairs and it does not allow duplicate keys. If the key is duplicate then the old key is replaced with the new value. 
3. Number of objects during storing objects: HashMap requires two objects put(K key, V Value) to add an element to HashMap object, while HashSet requires only one object add(Object o)
4. Dummy value: In HashMap no concept of dummy value, HashSet internally uses HashMap to add elements. In HashSet, the argument passed in add(Object) method serves as key K. Java internally associates dummy value for each value passed in add(Object) method. 
5. Storing or Adding mechanism: HashMap internally uses hashing to store or add objects, HashSet internally uses HashMap object to store or add the objects. 
6. Speed: HashSet is slower than HashMap. 
7. Insertion: HashMap uses the put() method for storing data, While in HashSet use add() method for add or storing data.

#### HashSet

- `HashSet<String> = new HashSet<>()`
- Adds per object
- Returns a boolean
- `.add()` adds key value pair to HashMap
- Slower than HashMap

#### HashMap

- `HashMap<String, Integer> = new HashMap<>()`
- `HashMap <ArrayList<Integer>, ArrayList<Integer>> dailyAttendance = new HashMap<>();`
- Adds Key Value pairs
- Specify what data type these pairs are
- `.put()` adds key value pair to HashMap

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

### File I/O

- Obtain the path by
  - `Path filePath = Paths.get(".");`
  - `System.out.println(filePath.toAbsolutePath())`

- Replace path '.' with the actual path by copy and pasting path from the console
  - `Path filePath = Paths.get("actual Path");`

- Create scanner and use scanner methods to read the file
  - `Scanner scanner = new Scanner(filePath);`

- EXAMPLE
```java
public static String linter(String filePath) {
int lineCounter = 0;
String errorMessage = "";
try{
        // Create Path
        Path newPath=Paths.get(filePath);
        // Use path in scanner
        Scanner scanner=new Scanner(newPath);
        while(scanner.hasNextLine()){
            lineCounter++;
            // scanner methods
            String currentString=scanner.nextLine();
         if(currentString.isEmpty()||currentString.endsWith(";")||currentString.endsWith("{")||currentString.endsWith("}")||currentString.contains("if")||currentString.contains("else")){
            continue;
         } else {
            errorMessage+="Line "+lineCounter+": Missing semicolon.\n";
            }
        }
    }
    catch (Exception e){
         System.out.println(e + " Line: " + lineCounter);
    }
    return errorMessage;
}
```