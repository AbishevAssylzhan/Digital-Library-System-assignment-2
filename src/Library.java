public class Library {
    private String name;
    private String address;

    public Library() {
        this.name = "Qazaqstan Respublikasynyn kitapxan";
        this.address = "ul.Dostyk 11, Astana";
    }

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

}