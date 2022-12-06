public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("John Ronald", "Reuel Tolkien");
        Author author2 = new Author("Joanne", "Rowling");
        Book TheLordOfTheRings = new Book(new Author("John Ronald", "Reuel Tolkien"),"The Fellowship of the Ring",1954 );
        Book HarryPotter = new Book(author2,"Harry Potter and the Philosopher's Stone",1997 );
        System.out.println(TheLordOfTheRings);
        System.out.println(HarryPotter);
        TheLordOfTheRings.setPublicationYear(1955);
        HarryPotter.setPublicationYear(1998);
        System.out.println(TheLordOfTheRings);
        System.out.println(HarryPotter);


    }
}