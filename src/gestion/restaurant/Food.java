package gestion.restaurant;

import java.util.ArrayList;

public abstract class Food {

	private String nom;
	private double prix;
	
	private ArrayList<Ticket> tickets;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
