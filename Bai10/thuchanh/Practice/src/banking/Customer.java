package banking;

public class Customer {
    private String name;
    private int id;
    public Customer(String name, int number) {
        this.name = name;
        this.id = number;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return id;
    }
    @Override
    public String toString() {
        return "STT: " + id + ", Tên: " + name;
    }
}
