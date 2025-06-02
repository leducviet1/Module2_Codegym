package itcompany;

public class Intern extends Employee{
    private String mentor;
    public Intern(String id, String name, String email, double baseSalary, String mentor) {
        super(id, name, email, baseSalary);
        this.mentor = mentor;
    }
    @Override
    public  double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void displayInformation() {
        System.out.println("Intern");
        System.out.println("ID: "+ id + ", Name: "+ name + ", Email: "+ email + ", Mentor: "+ mentor);
        System.out.println("Total Salary: "+ calculateSalary());
    }
}
