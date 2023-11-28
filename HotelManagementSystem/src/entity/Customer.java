package entity;

public class Customer {
	private int cid;
	private String cname;
	private int cage;
	private long cphno;
	private String cemail;
	private double camt;
	private Address caddress;
	public Customer(int cid, String cname, int cage, long cphno, String cemail, double camt,Address caddress) {
		
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.cphno = cphno;
		this.cemail = cemail;
		this.camt=camt;
		this.caddress = caddress;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public Address getCaddress() {
		return caddress;
	}
	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}
	public double getCamt() {
		return camt;
	}
	public void setCamt(double camt) {
		this.camt = camt;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cage=" + cage + ", cphno=" + cphno + ", cemail="
				+ cemail + ", caddress=" + caddress + "]";
	}

}
