package repository;
import java.util.List;

import domain.Contact;
public interface DatasourceDAO {
    public void createContact(Contact contact);
    public void updateContact(Contact contact);
    public  Contact findContactByNumber(String id);
    public void deleteContact( Contact contact);
    public List<Contact> getContacts();
}
