package gui;

public class Customer {
	public String firstname;
	public String lastname;
	public String streetaddress;
	public String city;
	public String state;
	public String branch;
	public double loanbalance;
	public int email;
	public int zipcode;
	public int accountnumber;
	public int aptnumber;
	public long phonenumber;
	
	public Customer() {
		
	}
	public String ToString()
	{
		return firstname + " " + lastname + " " + email + " " + streetaddress + " " + city + " " + state + " " + branch + " " + loanbalance + " " + zipcode + " " + accountnumber + " " + aptnumber + " " + phonenumber;
	}
	
	
	
}
