package problem1;

import java.util.Objects;

public abstract class LibraryItem {
    protected String title;
    protected String author;
    protected int publicationYear;

    public LibraryItem(){

    }

    public LibraryItem(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public String toString(){
        return title + " " + author + " " + publicationYear;
    }

    public int hashCode(){
        return Objects.hash(title, author, publicationYear);
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(this.getClass() != o.getClass()) return false;
        LibraryItem i = (LibraryItem)o;
        return this.title.equals(i.title) && this.author.equals(i.author) && this.publicationYear == i.publicationYear;
    }



}
