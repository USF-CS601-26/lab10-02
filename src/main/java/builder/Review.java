package builder;

/**
 * This class stores information of a Review object.
 * TODO: Rewrite using the Builder pattern
 */
public class Review {
    private String hotelId;
    private String reviewId;
    private int ratingOverall;
    private String title;
    private String reviewText;
    private String userNickname;
    private String reviewDate;

    /**
     * Constructor for a Review object, stores all relevant information
     * @param hotelId a String representing the hotel id that the review is for
     * @param reviewId a String representing this review's id
     * @param ratingOverall an integer representing the overall rating for the review
     * @param title a String representing the title of the review
     * @param reviewText a String representing the body of the review
     * @param userNickname a String representing the username of the individual who left the review
     * @param reviewDate a String representing the date of the review submission
     */
    public Review(String hotelId, String reviewId, int ratingOverall, String title, String reviewText, String userNickname, String reviewDate) {
        this.hotelId = hotelId;
        this.reviewId = reviewId;
        this.ratingOverall = ratingOverall;
        this.title = title;
        this.reviewText = reviewText;
        this.userNickname = userNickname;
        this.reviewDate = reviewDate;
    }

    /**
     * Returns the String representation of the review
     * @return a String that shows the hotel id, review id, average rating, title, body, username, and submission date of the review
     */
    @Override
    public String toString(){
        return "hotelId = " + this.hotelId + '\n' +
                "reviewId = " + this.reviewId + '\n' +
                "averageRating = " + Float.parseFloat(String.valueOf(this.ratingOverall)) + '\n' +
                "title = " + this.title + '\n' +
                "reviewText = " + this.reviewText + '\n' +
                "userNickname = " + this.userNickname + '\n' +
                "submissionDate = " + this.reviewDate;
    }

    /**
     * Returns the hotel id that the review is for
     * @return a String representing the hotel id
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public String getReviewId() {
        return this.reviewId;
    }

    /**
     * Returns the body of the review
     * @return a String representing the main body of the review
     */
    public String getReviewText(){
        return this.reviewText;
    }

}
