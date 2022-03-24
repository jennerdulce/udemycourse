package inheritance;

import java.util.ArrayList;

public class Theater {
 String name;
 ArrayList<String> movies = new ArrayList<>();

    public Theater(String name) {
        this.name = name;
    }

    public String addMovie(String movieName){
        movies.add(movieName);
        return movieName + " has been added to the library";
    }

    public String removeMovie(String movieName){
        if(movies.contains(movieName)){
            movies.remove(movieName);
            return movieName + " has been removed from the library";
        } else {
            return movieName + " is not in the library";
        }
    }
}
