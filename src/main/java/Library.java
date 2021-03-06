import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stockList;


    public Library(int capacity) {
        this.capacity = capacity;
        this.stockList = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.stockList.size();
    }

    public int addBook(Book book) {
        if (getBookCount() < this.capacity)
        this.stockList.add(book);
        return getBookCount();
    }
}
