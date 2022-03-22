package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String author, int stars, String body) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString(){
        String reviewInfo = "";
        reviewInfo += author + "\n";
        reviewInfo += stars + "\n";
        reviewInfo += body + "\n";
        return reviewInfo;
    }
}
