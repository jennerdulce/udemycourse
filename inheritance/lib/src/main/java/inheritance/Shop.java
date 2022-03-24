package inheritance;

import java.util.ArrayList;

public class Shop<T> {
    String name;
    T description;
    String cost;
    ArrayList reviews = new ArrayList<>();

    public Shop(String name, T description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = "$".repeat(cost);
    }

    public Review addReview(Review review){
        reviews.add(review);
        return review;
    }

    @Override
    public String toString(){
        String info = "";
        info += name + "\n";
        info += cost + "\n";
        info += description + "\n";
        info += "Reviews: (" + reviews.size() + ")";
        return info;
    }
}
