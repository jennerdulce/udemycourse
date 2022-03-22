package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int totalStars;
    int totalReviews;
    float averageStarRating;
    String price;
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int price) {
        this.name = name;
        this.price = "$".repeat(price);
    }

    public Review addReview(Review review){
        reviews.add(review);
        totalStars+= review.stars;
        totalReviews++;
        averageStarRating = this.totalStars / (float) totalReviews;
        return review;
    }

    @Override
    public String toString(){
        String info = "";
        info += "Name: " + name + "\n";
        info += "Price: " + price + "\n";
        info += "Average Stars: " + averageStarRating + "\n";
        return info;
    }
}
