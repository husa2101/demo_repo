package java1.media;

public class Book extends Media {
    protected String author;

    public Book(String title, int lenght,String author) {

        super(title, lenght);
        this.author = author;
    }

    public Book() {
        this("unknown", -1,"unknown");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("authors name is  " + author);

    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    public String getLenghtAsString(){
        int page = lenght;
      return " the book has a "+page+ " page";

    }

    @Override
    public String toString() {
        return String.format(author);
    }
}
