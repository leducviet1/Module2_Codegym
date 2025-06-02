package itcompany;

public abstract class Employee {
    protected String id;
    protected String name;
    protected String email;
    protected double baseSalary;
    public Employee(String id, String name, String email, double baseSalary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
    }
    public String getId() {
        return id;
    }
    public abstract double calculateSalary();
    public abstract void displayInformation();
}
