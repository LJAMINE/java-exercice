import java.util.ArrayList;

class Book22 {
    public String title;
    public String author;
    public String isbn;

    public Book22(String title, String author, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

}

class Library22 {
    ArrayList<Book22> storeBooks;

    public Library22() {
        this.storeBooks = new ArrayList<>();
    }

    public void addBook(Book22 book22) {
        storeBooks.add(book22);
    }

    public void removeBook(String isbn) {
//        for (Book22 book22 : storeBooks) {
//            if (book22.isbn.equals(isbn)) {
//                storeBooks.remove(book22);
//            } else {
//                System.out.println("not found ");
//            }
//        }
       boolean found =false;

        for (int i = 0; i < storeBooks.size(); i++) {
                if (storeBooks.get(i).isbn.equals(isbn)){
                    storeBooks.remove(i);
                    found=true;
                    System.out.println("removed successfully");
                    break;
                }
        }

        if (!found){
            System.out.println("not found ");
        }

    }

    public void ListAllBooks(String author) {

        for (Book22 book22 : storeBooks) {
            if (book22.author.equals(author)) {
                System.out.println(book22.title);
            }
        }
    }


}


public class LibrarySystemImportant {
    public static void main(String[] args) {

        Book22 b1=new Book22("book1","said","123");
        Book22 b2=new Book22("book2","said","111");
        Book22 b3=new Book22("book3","BRO","2333");


        Library22 library22=new Library22();
        library22.addBook(b1);
        library22.addBook(b2);
        library22.addBook(b3);

        library22.ListAllBooks("said");

        library22.removeBook("123");
        library22.ListAllBooks("said");

    }
}
