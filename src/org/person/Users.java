package person;

public class Users {

	private String sFirstName;
	private String sLastName;
	private String sAddress;
	private String sCity;
	private String sState;
	private String sZip;
	private String sUserName;
	private String sPassword;
	private String sEmail;
	private String lSSN;
	private String sSecurity_Question;
	
	public Users(String sFirstName, String sLastName, String sAddress,
			String sCity,  String sState,String sZip, String sUserName,
			String sPassword, String sEmail, String lSSN,
			String sSecurity_Question) {
		this.sFirstName = "";
		this.sLastName = "";
		this.sAddress = "";
		this.sZip = "";
		this.sCity = "";
		this.sState = "";
		this.sUserName = "";
		this.sPassword = "";
		this.sEmail = "";
		this.lSSN = "";
		this.sSecurity_Question = "";
	}
	public String getsFirstName() {
		return sFirstName;
	}
	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}
	public String getsLastName() {
		return sLastName;
	}
	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsState() {
		return sState;
	}
	public void setsState(String sState) {
		this.sState = sState;
	}

	public String getsZip() {
		return sZip;
	}
	public void setsZip(String sZip) {
		this.sZip = sZip;
	}
		public String getsUserName() {
		return sUserName;
	}
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getlSSN() {
		return lSSN;
	}
	public void setlSSN(String lSSN) {
		this.lSSN = lSSN;
	}
	public String getsSecurity_Question() {
		return sSecurity_Question;
	}
	
	public void setsSecurity_Question(String sSecurity_Question) {
		this.sSecurity_Question = sSecurity_Question;
	}
	@Override
	public String toString() {
		return "Name: "+ sFirstName + " " + sLastName + 
			 "\nAddress: " + sAddress + " " + sCity + " " + sState + " "+ sZip+
		     "\nEmail: " + sEmail;
	}
}
