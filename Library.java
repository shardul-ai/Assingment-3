import java.util.ArrayList;

public class Library {

        private ArrayList<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public void displayBooks() {
            for (Book book : books) {
                System.out.println(book.toString());
            }

        }
    }

