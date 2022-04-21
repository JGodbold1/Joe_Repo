//Jayden Godbold
//Exercise 2

import java.util.Objects;

public class Book {                                                                             //init of book class
    public String genre;                                                                        //init of genre string val
    public Book(String genre){
     this.genre = genre;
    }
    public String[] validGenres = {"software","novel","thriller", "essay", "manual"};           // init of valid genres
    public String bookGenre() {                                                                 //int of book genre string function
        for (String n : validGenres){                                                           // fo loop that checks if given genre is valid
            if (Objects.equals(n, genre)){
                return genre;
            }
        }
        return "not a valid genre";                                                             //returns not valid if not valid genre
    }
}
