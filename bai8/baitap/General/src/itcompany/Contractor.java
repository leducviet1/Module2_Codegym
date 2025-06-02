package itcompany;

public class Contractor extends Employee {
    private int workingHours;
    private double hourlyRate;
    public Contractor(String id, String name, String email,  int workingHours, double hourlyRate) {
        super(id, name, email,0);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
    @Override
    public void displayInformation() {
        System.out.println("Contactor:");
        System.out.println("ID: "+ id + ", Name: "+ name + ", Email: "+ email );
        System.out.println("WorkingHours: "+ workingHours + ", HourlyRate: "+ hourlyRate);
        System.out.println("Total Salary: "+ calculateSalary());
    }
}
