import java.util.Scanner;

public class DeleteContactHandle {
    private final ContactService service;

    public DeleteContactHandle(ContactService service) {
        this.service = service;
    }
    public void execute(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number which you want to delete");
        String phoneNumber = sc.nextLine();
        Contact contact = service.findByPhone(phoneNumber);
        if(contact == null){
            System.out.println("Not found");
            return;
        }
        System.out.println("Bạn chắc chắn chứ?(Yes/No)");
        String confirm = sc.nextLine();
        if(confirm.equalsIgnoreCase("Yes")){
            service.deleteContact(contact);
            System.out.println("Deleted successfull");
        }else{
            System.out.println("No delete");
        }
    }
}
