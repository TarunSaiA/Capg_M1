package day4_mar10;

import java.io.Serializable;

public class CardDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private long cardno;
    private int cvv;
    private String name;
    private String expirydate;
	public CardDetails(long cardno, int cvv, String name, String expirydate) {
		super();
		this.cardno = cardno;
		this.cvv = cvv;
		this.name = name;
		this.expirydate = expirydate;
	}
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
