# Builder Pattern Exercise

In this exercise, you will refactor the `Review` class to use the **Builder design pattern**.

The current `Review` constructor has many parameters:

```java
public Review(String hotelId, String reviewId, int ratingOverall,
              String title, String reviewText,
              String userNickname, String reviewDate)
```

Constructors with many parameters can be difficult to read and use correctly. In particular, several parameters have the same type, so it is easy to accidentally pass values in the wrong order.

## Your Task

### 1. Modify `Review.java`

Rewrite the `Review` class using the Builder pattern.

Your implementation should:

- Add a static nested `Builder` class inside `Review`.
- Add fields to the Builder for the values needed to create a Review.
- Provide builder methods for setting those values.
- Have each "setter" method in the Builder class return the Builder object so that method calls can be chained.
- Add a `build()` method that creates and returns a `Review`. Run some validity checks before creating a Review:
    - ratingOverall should be in a valid range from 0 to 5. 
    - hotelId and reviewId should not be null/empty. 
    - reviewTitle and reviewText cannot both be empty.
- Change the private `Review` constructor so that it receives a `Builder` object instead of seven separate parameters. 


### 2. Complete `ReviewExample.java`

Use your builder to create a `Review` object.

For example, your code should follow this general style:

```java
Review review = new Review.Builder()
        // set fields here
        // ...
        .build();
```

## Goal

After completing the exercise, you should be able to explain:

- why a Builder can be easier to use than a constructor with many parameters,
- how a static nested Builder class constructs an object, and why the nested class must be static, not inner,
- why builder "setter" methods return `this`,
- how method chaining works when creating an object,
- why the constructor  of Review is private.