public class Book {
    private String name;
    private String author;
    private int year;


    public Book() {
        this.name = "Abai Zholy";
        this.author = "Mukhtar Auezov";
        this.year = 1942;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {

        return name;
    }

    public String getAuthor() {

        return author;
    }

    public int getYear() {

        return year;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Book Name: " + name);
        System.out.println("author: " + author);
        System.out.println("year: " + year);
    }
}
