import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("1984", "George Orwell", "Dystopian");
        book2 = new Book("Neuromancer", "William Gibson", "Cyberpunk");
        book3 = new Book("The Stainless Steel Rat", "Harry Harrison", "Sci-Fi Comedy");
    }

    @Test
    public void checkLibraryBookStock() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void addBookToLibrary() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void cannotAddBookToLibraryIfCapacityReached() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }



}
