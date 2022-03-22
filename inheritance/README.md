# Lab: 03 - Inheritance and Interfaces

## Problem Domain

### Assignment 1

1. Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).

- Implement a Restaurant constructor.
- Test that your Restaurant constructor is behaving reasonably.
- Implement a reasonable toString method for Restaurants.
- Write a test to create an instance of Restaurant and ensure that its toString is working properly.

2. Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.

- Write a Review constructor.
- Test that your constructor is working reasonably.
- Implement a reasonable toString method for Reviews.
- Write a test to create an instance of Review and ensure that its toString is working properly.

3. A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:

- Should a Review know which Restaurant it is about?
- Should a Restaurant know which Reviews are about it?
- Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
- Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.

4. Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.

- Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.

5. When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

### Assignment 2

1. The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.

- Implement a constructor for a Shop.
- Implement a reasonable toString method for Shops.
- Add tests for the basics of your Shop class.

2. The users also want to review shops!

- It would be great if a Review could be about either a Shop or a Restaurant. Choose an implementation, and make this possible.
- Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.
- Write tests for this functionality.

3. The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

- Implement a constructor for a Theater.
- Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown.
- Implement a reasonable toString method for Theaters.
- Test your Theater functionality.

4. Review all the things!

- Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
- Test this functionality.

5. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.

- Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.
- Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!
- It’s also okay if someone doesn’t want to include the movie they saw when they’re reviewing a theater (maybe they just went in for the popcorn).
- Add testing for any new functionality you’ve created.

## Created Classes and Methods

### (Class) Establishment

- `@Override .toString()`
    - Returns the a string and displays the contents of the instantiated class in a readable manner

- `.addReview(Review)`
    - Accepts a `Review` object as an argument
    - The review is then added to the `ArrayList<Review>` where it is stored with other reviews
    - Increments the `totalReview` count by 1
    - Recalculates the total star rating of the restaurant by taking the `stars` property from the submitted review and diving by the `totalReviews`
    - Adds movie title if given

### (Sub Classes of Establishment) Theater, Shop, Restaurant

#### Theater

- `.addMovie(String)`
    - Adds a movie title to the listOfMovies ArrayList

- `.removeMovie(String)`
    - Removes a movie title from the listOfMovies ArrayList

### Review Class

- `@Override .toString()`
    - Returns the a string and displays the contents of the instantiated class in a readable manner

### Collaborators

- I had the pleasure of working and talking about the code with:
    - Matthew Cho
        - We were able to read through the prompt and discuss the through process on designing the architecture
