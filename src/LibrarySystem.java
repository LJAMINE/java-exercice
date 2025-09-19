import java.util.ArrayList;
import java.util.HashMap;

class Books{
    public String isbn;
    public String title;
    public String author;

    public Books(String isbn,String title,String author){
        this.author=author;
        this.isbn=isbn;
        this.title=title;
    }
}

class Library{
    ArrayList<Books> storeallBooks;
    HashMap<String,Books> findIsbn;

    public Library(){
        this.storeallBooks=new ArrayList<>();
        this.findIsbn=new HashMap<>();
    }

    public void addBook(Books book){
        storeallBooks.add(book);
    }

    public  void findByIsbn(String isbn){
//        System.out.println("kkskksks");

        for (Books books : storeallBooks){

            if (books.isbn.equals(isbn)){
                System.out.println(books.title);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);

    }


    public  void removeBookByisbn(String isbn){
        for (Books books : storeallBooks){
            if (books.isbn.equals(isbn)){
                storeallBooks.remove(books);
            }
        }
    }


    public  void ListAllbooks(){
        for (Books books : storeallBooks){
            System.out.println(books.title+books.author+books.isbn);
        }
    }
}


public class LibrarySystem {
    public static void main(String[] args) {

        Books b1=new Books("1","azer","amne");
        Books b2=new Books("2","asc","alal");
        Books b3=new Books("3","ghll","okkk");

Library library=new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

library.findByIsbn("2");

library.ListAllbooks();
        System.out.println("aaaaaaaaaaaaa");

library.removeBookByisbn("2");

        System.out.println("bbbbbbbbbbbb");

        library.ListAllbooks();

    }
}
