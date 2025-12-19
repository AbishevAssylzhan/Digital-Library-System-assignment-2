//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Ushkan uya", "Baurzhan Momyshuly", 1956);


        Library_User user1 = new Library_User();
        Library_User user2 = new Library_User("Aruzhan", 2);


        Library library1 = new Library(); // без параметров
        Library library2 = new Library("QR Ulttyk Kitaphanasy", "ABAI 14, Almaty");

        book1.displayInfo();
        System.out.println();

        book2.displayInfo();
        System.out.println();

        user1.displayInfo();
        System.out.println();

        user2.displayInfo();
        System.out.println();

        library1.displayInfo();
        System.out.println();

        library2.displayInfo();
    }
}