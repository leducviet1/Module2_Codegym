import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService {
    private List<Contact> contactLists = new ArrayList<>();
    public List<Contact> getAllContacts(){
        return  contactLists;
    }
    public void addNewContact(Contact contact){
        contactLists.add(contact);
    }
    public Contact findByPhone(String phone){
        for(Contact search: contactLists){
            if(search.getPhoneNumber().equals(phone)){
                return search;
            }
        }
        return null;
    }
    public void deleteContact(Contact contact){
        contactLists.remove(contact);
    }
}
