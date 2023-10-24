package problem1;

import java.util.Objects;

public class Book extends LibraryItem{
    private String isbn;
    private int numOfPages;

    public Book(){

    }
    
    public Book(String title, String author, int publicationYear, String isbn, int numOfPages){
        super(title, author, publicationYear);
        this.isbn = isbn;
        this.numOfPages = numOfPages;
    }

    public void openBook(){
        System.out.println("You opened the book");
    }

    public int getNumOfPages(){
        return numOfPages;
    }

    public String getIsbn(){
        return isbn;
    }

    public String toString(){
        return super.toString() + " " + isbn;
    }

    public int hashCode(){
        return Objects.hash(title, author, publicationYear, isbn);
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;

        return isbn == ((Book)o).isbn;
    }

}
