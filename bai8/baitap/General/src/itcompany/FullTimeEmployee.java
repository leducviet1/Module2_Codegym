package itcompany;

public class FullTimeEmployee extends Employee {
    private  double bonus;
    public FullTimeEmployee(String id, String name, String email, double baseSalary, double bonus) {
        super(id,name,email,baseSalary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    @Override
    public void displayInformation() {
        System.out.println("Full Time Employee");
        System.out.println("ID: "+ id + ", Name: "+ name + ", Email: "+ email);
        System.out.println("Base Salary: "+ baseSalary + ", Bonus: "+ bonus);
        System.out.println("Total Salary: "+ calculateSalary());
    }
}
