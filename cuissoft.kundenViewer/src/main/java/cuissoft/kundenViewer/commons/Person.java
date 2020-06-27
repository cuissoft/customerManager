package cuissoft.kundenViewer.commons;

import java.util.List;

public class Person {

	private String nName;
	
	private String vName;
	private List<Telefon> pTelefon;
	private Adresse pAdresse;
	private String pEmail;
	private String pGebrustag;
	
	
	public Person(String nName, String vName, List<Telefon> pTelefon, Adresse pAdresse, String pEmail, String pGebrustag ) {
		this.nName = nName;
		this.vName = vName;
		this.pTelefon = pTelefon;
		this.pAdresse = pAdresse;
		this.pEmail = pEmail;
		this.pGebrustag = pGebrustag;
	}
	
	public String getnName() {
		return nName;
	}


	public void setnName(String nName) {
		this.nName = nName;
	}


	public String getvName() {
		return vName;
	}


	public void setvName(String vName) {
		this.vName = vName;
	}


	public List<Telefon> getpTelefon() {
		return pTelefon;
	}


	public void setpTelefon(List<Telefon> pTelefon) {
		this.pTelefon = pTelefon;
	}


	public Adresse getpAdresse() {
		return pAdresse;
	}


	public void setpAdresse(Adresse pAdresse) {
		this.pAdresse = pAdresse;
	}


	public String getpEmail() {
		return pEmail;
	}


	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}


	public String getpGebrustag() {
		return pGebrustag;
	}


	public void setpGebrustag(String pGebrustag) {
		this.pGebrustag = pGebrustag;
	}
	
}
