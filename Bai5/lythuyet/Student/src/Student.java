public class Student {
    private String name;
    private int id;
    private static int nextId = 1000;

    public Student(String name){
        this.name = name;
        this.id = nextId;
        nextId++;
    }
    public void display(){
        System.out.println("Name: " + name + " ID: " + id);
    }
}
