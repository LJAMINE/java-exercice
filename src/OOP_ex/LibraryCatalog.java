package OOP_ex;


import exe.Strings;

import java.util.HashMap;

class Book25 {
    public String isbn;
    public String title;
    public String author;

    public Book25(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
}

class Library25 {
    HashMap<String, Book25> storeBooks25 = new HashMap<>();

    public Library25() {
        this.storeBooks25 = new HashMap<>();
    }

    public void addBook25(String isbn, Book25 book25) {
        storeBooks25.put(isbn, book25);
    }

    public void removeBookByIsbn(String isbn) {
        storeBooks25.remove(isbn);
    }

    public  void findByIsbn(String isbn){
        Book25 book =storeBooks25.get(isbn);
        if (book==null){
            System.out.println("not found ");
        }else {
            System.out.println("  found "+book.title);
        }
    }

    public  void ListAllUsingAuthor(String author){

        boolean found =false;
        for (Book25 book25 : storeBooks25.values()){
            if (book25.author.equals(author)){
                System.out.println(book25);
            found =true;
            }
        }
        if (!found){
            System.out.println("no book found ");
        }
    }
}

public class LibraryCatalog {


}


