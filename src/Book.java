import java.util.Objects;

public class Book {


     private String nameOfBook;
     private int publicationYear;
     private Author author;



     public Book(Author author, String name, int yearOfPublication) {
          this.author = author;
          this.nameOfBook = name;
          this.publicationYear = yearOfPublication;
     }

     public String getName(){return this.nameOfBook;}
     public int getAge() {return this.publicationYear;}
     public void setPublicationYear(int age) {this.publicationYear = age;}

     public String toString() {
          return "Author: " + author + ", Book: " + nameOfBook + ", Year Publication: " + publicationYear;
     }
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Book book = (Book) o;
          return Objects.equals(author, book.author) && Objects.equals(nameOfBook, book.nameOfBook) && publicationYear == book.publicationYear;
     }

     public int hashcode() {return Objects.hash(nameOfBook, publicationYear, author);}

}
