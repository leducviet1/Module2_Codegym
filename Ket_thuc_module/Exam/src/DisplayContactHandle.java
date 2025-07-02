import java.util.List;

public class DisplayContactHandle {
    private final ContactService service;
    public DisplayContactHandle(ContactService service){
        this.service = service;
    }
    public void execute(){
        List<Contact> contactList = service.getAllContacts();
        if(contactList.isEmpty()){
            System.out.println("Contact is empty");
            return;
        }
        for(int i=0;i<contactList.size();i++){
            contactList.get(i).displayContact();
        }
    }
}
