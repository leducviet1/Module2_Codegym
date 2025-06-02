package itcompany;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private List<Project> projects;
    public Company() {
        employees = new ArrayList<>();
        projects = new ArrayList<>();
    }
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public void addProject(Project p) {
        projects.add(p);
    }
    public void assignToProject(String projectId, String emId) {
        Project project = null;
        Employee employee = null;
        for (Project p : projects) {
            if (p.getProjectId().equals(projectId)) {
                project = p;
                break;
            }
        }
        for (Employee e : employees) {
            if (e.getId().equals(emId)) {
                employee = e;
                break;
            }
        }
        if (project != null && employee != null) {
            project.addEmployee(employee);
        } else {
            System.out.println("No employee or project found");
        }
    }
    public void displayAllEmployees(){
        for (Employee e : employees) {
            e.displayInformation();
            System.out.println("-----");
        }
    }
    public void displayAllProjects(){
        for (Project p : projects) {
            p.ProjectMembers();
            System.out.println("-----");
        }
    }
}
