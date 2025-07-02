import java.sql.SQLOutput;
import java.util.Scanner;

public class AddContactHandle {
    private final ContactService service;
    public AddContactHandle(ContactService service){
        this.service= service;
    }
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Add new contact");
        String phoneNumber;
        while (true) {
            System.out.println("Please enter your phone number:");
            phoneNumber = sc.nextLine();
            if (Validate.isValidPhone(phoneNumber)) break;
                System.out.println("Your number is not valid");

        }
            System.out.println("Group Contact:");
            String group = sc.nextLine();
            System.out.println("Full name:");
            String name = sc.nextLine();
            System.out.println("Your gender:");
            String gender = sc.nextLine();
            System.out.println("Your address:");
            String address = sc.nextLine();
            System.out.println("Your birthday:");
            String birthday = sc.nextLine();
        String email;
        while (true){
            System.out.println("Your email:");
             email = sc.nextLine();
             if(Validate.isValidEmail(email)) break;
                 System.out.println("Email is not valid");
        }
        Contact newContact = new Contact(phoneNumber,group,name,gender,address,birthday,email);
        service.addNewContact(newContact);
        System.out.println("Add new contact succesfull");
    }
}
