import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookStore{
    List<Bookcase> bookCases = new ArrayList<>(); //list of bookcases in store

    public void addBookCase(Bookcase args){
        for (Bookcase n : bookCases){                                       //loops through all bookcases in store
            if (Objects.equals(n.bookcaseGenre, args.bookcaseGenre)){          // compares genre
                return;                                                         // return if same genre
            }

        }
        bookCases.add(args);
    }




}
