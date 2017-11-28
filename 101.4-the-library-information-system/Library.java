import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    /**
     * Add to the class Library the methods public ArrayList<Book> searchByTitle(String title), public ArrayList<Book>
     * searchByPublisher(String publisher) and public ArrayList<Book> searchByYear(int year). The methods return the
     * list of books that match the given title, publisher or year.
     */
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<Book>();

        for (Book b : books) {
            if (StringUtils.included(b.title(), title)) {
                results.add(b);
            }
        }

        return results;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> results = new ArrayList<Book>();

        for (Book b : books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                results.add(b);
            }
        }

        return results;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> results = new ArrayList<Book>();

        for (Book b : books) {
            if (b.year() == year) {
                results.add(b);
            }
        }

        return results;
    }
}
