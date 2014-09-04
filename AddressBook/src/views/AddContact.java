package views;

import repository.DatasourceDAO;
import repository.Imp.DatasourceDAOImpl;

import com.sihle.addressbook.R;

import domain.Contact;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AddContact extends Activity{

    final DatasourceDAO dao = new DatasourceDAOImpl(this);
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_contact);
		
		final Button save = (Button)findViewById(R.id.btnSave);
		
		final Editable fname = (Editable)findViewById(R.id.fistnameTx);
		final Editable lname = (Editable)findViewById(R.id.lastNameTxt);
		final Editable email = (Editable)findViewById(R.id.emailTxt);
		final Editable phone = (Editable)findViewById(R.id.phonenumberTxt);
		final Editable address = (Editable)findViewById(R.id.homeAddressTxt);
		
		
		final Contact contact = new Contact.Builder(email.toString())
		.firstname(fname.toString())
		.lastname(lname.toString())
		.address(address.toString())
		.phonenumber(phone.toString())
		.builder();
		
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dao.createContact(contact);
                startActivity(new Intent(AddContact.this, ViewRecords.class));
            }
        });
	}
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
