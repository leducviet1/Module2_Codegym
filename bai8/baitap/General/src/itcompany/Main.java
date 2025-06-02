package itcompany;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee e1 = new FullTimeEmployee("1","Nguyễn B","abc@gmail.com",1500,200);
        Employee e2 = new Intern("22","VC","vcd@gmail.com",200,"Anh Bá");
        Employee e3 = new Contractor("3","DD","d@gmail.com",100,15);
        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);

        Project p1 = new Project("1","NHAA");
        Project p2 = new Project("3","ÂNHADDA");
        company.addProject(p1);
        company.addProject(p2);

        company.assignToProject("1","1");
        company.assignToProject("3","3");
        company.assignToProject("3","22");

        System.out.println("All employees:");
        company.displayAllEmployees();
        System.out.println("\nAll projects:");
        company.displayAllProjects();
    }
}
