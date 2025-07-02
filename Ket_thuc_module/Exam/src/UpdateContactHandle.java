import java.util.Scanner;

public class UpdateContactHandle {
    private final ContactService service;
    public UpdateContactHandle(ContactService service){
        this.service = service;
    }
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your number which you want to update");
        String phoneNumber= sc.nextLine();
        Contact contact = service.findByPhone(phoneNumber);
        if(contact == null){
            System.out.println("Not found");
            return;
        }
        System.out.println("New group:");
        contact.setGroupContact(sc.nextLine());
        System.out.println("New full name:");
        contact.setFullName(sc.nextLine());
        System.out.println("New gender:");
        contact.setFullName(sc.nextLine());
        System.out.println("New address:");
        contact.setAddress(sc.nextLine());
        System.out.println("New birthday:");
        contact.setBirthday(sc.nextLine());
        String email;
        while (true){
            System.out.println("New email:");
            email = sc.nextLine();
            if(Validate.isValidEmail(email)) break;
            System.out.println("Your email is not valid!");
        }
        contact.setEmail(email);
        System.out.println("Update contact successfull");
    }
}
