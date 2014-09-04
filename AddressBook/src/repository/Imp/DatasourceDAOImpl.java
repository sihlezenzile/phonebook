package repository.Imp;

import java.util.List;

import repository.DatasourceDAO;
import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
//import databasess.DBAdapter;
import domain.Contact;

public class DatasourceDAOImpl implements DatasourceDAO {
	
    private SQLiteDatabase database;
    private DBAdapter dbHelper;

    public DatasourceDAOImpl(Context context) {
        dbHelper = new DBAdapter(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }
    
	@Override
	public void createContact(Contact contact) {
		// TODO Auto-generated method stub
		open();
		ContentValues values = new ContentValues();
		
		values.put(DBAdapter.FIRST_NAME, contact.getFirstname());
		values.put(DBAdapter.LAST_NAME, contact.getLastname());
		values.put(DBAdapter.EMAIL, contact.getEmail());
		values.put(DBAdapter.PHONE_NUMBER, contact.getEmail());
		values.put(DBAdapter.ADDRESS, contact.getAddress());
		
		database.insert(DBAdapter.TABLE_CONTACT, null, values);
		
		close();
		
	}
	
	

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact findContactByNumber(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
