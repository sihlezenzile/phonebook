package repository.Imp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter extends SQLiteOpenHelper{
	
	public static final String TABLE_CONTACT = "contact";
	
	public static final String FIRST_NAME = "name";
	public static final String LAST_NAME = "surname";
	public static final String EMAIL = "email";
	public static final String PHONE_NUMBER = "phone";
	public static final String ADDRESS = "address";
	
	private  static final String DATABASE_NAME = "contact.db";
	private  static final int DATABASE_version = 1;
	
	private static final String CREATE_CONTACT = "create table if not exists "
			+ TABLE_CONTACT +"("
			+ FIRST_NAME +" text not null, "
			+ LAST_NAME +" text not null, "
			+ EMAIL +" text not null, "
			+ PHONE_NUMBER + " text primary key, "
			+ ADDRESS + " text not null);";

	public DBAdapter(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_CONTACT);		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(DBAdapter.class.getName(), "Upgrade version "+ oldVersion + " to "+ newVersion
				+" wchich will be destroyed.");	
		db.execSQL(" DROP IF EXISTS "+ CREATE_CONTACT);
		onCreate(db);
	}
	
	

}
