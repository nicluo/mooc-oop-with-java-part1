import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("101.1");

            Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
            System.out.println(cheese.title());
            System.out.println(cheese.publisher());
            System.out.println(cheese.year());

            System.out.println(cheese);
        }
        {
            System.out.println("101.2");

            Library Library = new Library();

            Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
            Library.addBook(cheese);

            Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
            Library.addBook(nhl);

            Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

            Library.printBooks();
        }
        {
            System.out.println("101.3");

            Library Library = new Library();

            Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
            Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
            Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
            Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

            ArrayList<Book> result = Library.searchByTitle("Cheese");
            for (Book book: result) {
                System.out.println(book);
            }

            System.out.println("---");
            for (Book book: Library.searchByPublisher("Penguin Group  ")) {
                System.out.println(book);
            }

            System.out.println("---");
            for (Book book: Library.searchByYear(1851)) {
                System.out.println(book);
            }
        }
    }
}