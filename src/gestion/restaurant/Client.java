package gestion.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {

	private String nom;
	private String prenom;
	private LocalDate date;
	private String email;
	private String telephone;
	
	
	private ArrayList<Ticket> tickets;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", email=" + email + ", telephone="
				+ telephone  + "]";
	}
	public Client(String nom, String prenom, LocalDate date, String email, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.email = email;
		this.telephone = telephone;
	}
	
	
}
