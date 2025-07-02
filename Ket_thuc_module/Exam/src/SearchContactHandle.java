import java.util.List;
import java.util.Scanner;

public class SearchContactHandle {
    private  final ContactService service;

    public SearchContactHandle(ContactService service) {
        this.service = service;
    }
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Your number phone or your full name which you want to search");
        String key = sc.nextLine().toLowerCase();
        List<Contact> list = service.getAllContacts();
        boolean found = false;
        for(Contact c: list){
            if(c.getPhoneNumber().contains(key) || c.getFullName().toLowerCase().contains(key)){
                c.displayContact();
                found = true;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
