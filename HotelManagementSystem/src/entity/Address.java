package entity;

public class Address {

	private String doorno;
	private String street;
	private String dst;
	private String state;
	private int pincode;
	public Address(String doorno, String street, String dst, String state, int pincode) {
		this.doorno = doorno;
		this.street = street;
		this.dst = dst;
		this.state = state;
		this.pincode = pincode;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", dst=" + dst + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
}
