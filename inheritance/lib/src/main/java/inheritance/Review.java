package inheritance;

public class Review {
    String body;
    String author;
    String movie = null;
    int stars;

    // You can make multiple constructors to leave or add information for more dynamic usage
    public Review(String author, int stars, String body) {
        this.body = body;
        this.author = author;
        if (stars < 0 || stars > 5){
            throw new IllegalArgumentException("Number is less than 0 or greater than 5");
        }
        this.stars = stars;
    }

    public Review(String author, int stars, String body, String movie) {
        this.body = body;
        this.author = author;
        if (stars < 0 || stars > 5){
            throw new IllegalArgumentException("Number is less than 0 or greater than 5");
        }
        this.stars = stars;
        this.movie = movie;
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
