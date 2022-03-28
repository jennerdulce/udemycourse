/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pokedemo;

import Models.Pokemon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        // 1. Make a URL to talk to website
        URL pokeUrl = new URL("https://pokeapi.co/api/v2/pokemon/ditto");
        // 2. Make a connection to the website
        HttpURLConnection pokeUrlConnection = (HttpURLConnection) pokeUrl.openConnection();
        // 3. Specify a method for our connection
        // GET: idempotent - Does not change anything, can do repeatedly (do many times)
        // POST: makes changes on the server
        pokeUrlConnection.setRequestMethod("GET");
        // 4. Need to read from this connection
        InputStreamReader pokeInputStreamReader = new InputStreamReader(pokeUrlConnection.getInputStream());
        BufferedReader pokeBufferedReader = new BufferedReader(pokeInputStreamReader);
        String pokeData = pokeBufferedReader.readLine();
        // 5. Convert string/json format to objects
        // 5a. Make objects for data to live in
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Pokemon ditto = gson.fromJson(pokeData, Pokemon.class);
        System.out.println(ditto);
        // Write file out to disk
//        File dittoFile = new File("./ditto.json");
//        try(FileWriter dittoFileWriter = new FileWriter(dittoFile))
//        {
//            gson.toJson(ditto, dittoFileWriter);
//        }
//    }
    }
}
