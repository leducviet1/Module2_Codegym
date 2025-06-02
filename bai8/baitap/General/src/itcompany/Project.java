package itcompany;
import java.util.List;
import java.util.ArrayList;
public class Project {
    private String projectName;
    private String projectId;
    private List<Employee> members;
    public Project(String projectId,String projectName) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.members = new ArrayList<>();
    }
    public String getProjectId() {
        return projectId;
    }
    public void addEmployee(Employee e){
        members.add(e);
    }
    public void ProjectMembers(){
        System.out.println("Project: " + projectName );
        for(Employee e: members){
            e.displayInformation();
            System.out.println("-----------");
        }
    }
}
