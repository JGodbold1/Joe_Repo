public class BookstoreTest {
    public static void main(String [] args){
        //creation of books
        Book sb1 = new Book("software");
        Book sb2 = new Book("software");
        Book sb3 = new Book("software");
        Book tb1 = new Book("thriller");
        Book tb2 = new Book("thriller");
        Book tb3 = new Book("thriller");
        Book nb1 = new Book("novel");
        Book nb2 = new Book("novel");
        Book nb3 = new Book("novel");

        //create bookcases
        Bookcase software = new Bookcase("software");
        Bookcase software2 = new Bookcase("software"); // dup to test
        Bookcase thriller = new Bookcase("thriller");
        Bookcase novel = new Bookcase("novel");

        // additon of books to each case
        software.addBook(sb1);
        software.addBook(sb2);
        software.addBook(sb3);

        software.addBook(tb1);  //test of adding wrong book

        software2.addBook(sb1); //test of dup book case
        software2.addBook(sb2);
        software2.addBook(sb3);

        thriller.addBook(tb1);
        thriller.addBook(tb2);
        thriller.addBook(tb3);

        novel.addBook(nb1);
        novel.addBook(nb2);
        novel.addBook(nb3);

        // creation of book store
        BookStore booksrus = new BookStore();

        //addition of book cases to store
        booksrus.addBookCase(software);
        booksrus.addBookCase(software2);
        booksrus.addBookCase(thriller);
        booksrus.addBookCase(novel);

        //print of all books and case in store
        for(Bookcase bc : booksrus.bookCases){
            System.out.println(bc.bookcaseGenre + ":");
            for (Book bk : bc.contents){
                System.out.println(bk.genre);

            }
            System.out.println();
        }





    }
}
