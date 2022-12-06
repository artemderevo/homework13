import java.util.Objects;

public class Author {
    private String nameOfAuthor;
    private String surnameOfAuthor;
    public Author(String name, String surname) {
        this.nameOfAuthor = name;
        this.surnameOfAuthor = surname;
    }

    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }
    public String getSurnameAuthor() {return this.surnameOfAuthor;}
    public void setNameOfAuthor(String nameOfAuthor) {this.nameOfAuthor = nameOfAuthor;}
    public void setSurnameOfAuthor() {this.surnameOfAuthor = surnameOfAuthor;}

    public String toString() {
        return  nameOfAuthor + " " + surnameOfAuthor;
    }

    public boolean equals(Object o) {
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameOfAuthor, author.nameOfAuthor) && Objects.equals(surnameOfAuthor, author.surnameOfAuthor);
    }
    public int hashcode() {
        return Objects.hash(nameOfAuthor, surnameOfAuthor);
    }
}
