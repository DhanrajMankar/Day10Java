package Day10Java;

public class AddressBook {
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String address;
	private String city;
	private String state;
	private long zipcode;
	
	
	public AddressBook(String firstName, String lastName, String email, String mobileNumber, String address, String city,
			String state, long zipcode) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	public AddressBook() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "AdddressBook [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public long getZipcode() {
		return zipcode;
	}


	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
		
}
