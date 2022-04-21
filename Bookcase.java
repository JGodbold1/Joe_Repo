import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bookcase{
    public String bookcaseGenre;
    public Bookcase(String genre){
        this.bookcaseGenre = genre;
    }
    List<Book> contents = new ArrayList<>();

    public void addBook(Book book){
        if (Objects.equals(book.bookGenre(), bookcaseGenre)) {
            contents.add(book);
        }
    };
}
