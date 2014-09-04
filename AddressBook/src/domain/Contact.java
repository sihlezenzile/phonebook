package domain;

public class Contact {
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	private String address;
	
	private Contact()
	{
		
	}
	
	private Contact(Builder in)
	{
		this.firstname = in.firstname;
		this.lastname = in.lastname;
		this.email = in.email;
		this.phonenumber = in.phonenumber;
		this.address = in.address;
	}

	public static class Builder
	{
		private String firstname;
		private String lastname;
		private String email;
		private String phonenumber;
		private String address;
		
		public Builder(String mail)
		{
			this.email = mail;
		}
		public Builder firstname(String f)
		{
			this.firstname = f; return this;
		}
		public Builder lastname(String l)
		{
			this.lastname = l; return this;
		}
		public Builder email(String em)
		{
			this.email = em; return this;
		}
		public Builder phonenumber(String p)
		{
			this.phonenumber = p; return this;
		}
		public Builder address(String ad)
		{
			this.address = ad; return this;
		}
		public Builder contact(Contact c)
		{
			this.firstname = c.getFirstname();
			this.lastname = c.getLastname();
			this.email = c.getEmail();
			this.phonenumber = c.getPhonenumber();
			this.address = c.getAddress();
			return this;
		}
		public Contact builder()
		{
			return new Contact(this);
		}
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getAddress() {
		return address;
	}
	
}
