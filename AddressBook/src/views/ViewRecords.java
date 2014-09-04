package views;

import repository.DatasourceDAO;
import repository.Imp.DatasourceDAOImpl;

import com.sihle.addressbook.R;

//import domain.Contact;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewRecords extends Activity{
    final DatasourceDAO dao = new DatasourceDAOImpl(this);
    ListView listcont;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_contacts);
		
		listcont = (ListView)findViewById(R.id.contactList);
		
		String[] arrayColumns = new String[]{
				"firstname","lastname", "emaail", "phone", "address"};
		
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
        		android.R.layout.simple_list_item_1, arrayColumns);
        
        
        listcont.setAdapter(adapter);
		
	}
}
