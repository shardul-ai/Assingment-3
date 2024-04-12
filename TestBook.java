public class TestBook {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Chawa", "Shivaji Sawant");
        Book book2 = new Book("Yayati", "V.S.khandekar");
        Book book3 = new Book("Raja Shiv Chattrapati", "BabaSaheb Purandare");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books:");
        library.displayBooks();

        library.removeBook(book2);

        System.out.println("\nLibrary books after removing Yayati:");
        System.out.println("============================================");
        library.displayBooks();
    }
}
