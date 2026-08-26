//aggregation means you can acess one class into another class here book class is used in library class

class Book {
    String name;
    int page;

    Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    void display() {
        System.out.println(this.name + " " + this.page);
    }
}

class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void display() {
        System.out.println("Library: " + this.name);
        System.out.println("Year: " + this.year);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}

public class aggregation {
    public static void main(String[] args) {

        Book book1 = new Book("pri", 45);
        Book book2 = new Book("prit", 405);
        Book book3 = new Book("pritam", 65);

        Book[] books = {book1, book2, book3};

        Library library = new Library("ram", 65, books);

        library.display();
    }
}