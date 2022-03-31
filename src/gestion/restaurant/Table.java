package gestion.restaurant;

import java.util.ArrayList;

public class Table {

	private int numero;
	private int nbCouvert;
	private String type;
	private double supplment;
	
	private ArrayList<Ticket> tickets;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNbCouvert() {
		return nbCouvert;
	}
	public void setNbCouvert(int nbCouvert) {
		this.nbCouvert = nbCouvert;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSupplment() {
		return supplment;
	}
	public void setSupplment(double supplment) {
		this.supplment = supplment;
	}
	@Override
	public String toString() {
		return "Table [numero=" + numero + ", nbCouvert=" + nbCouvert + ", type=" + type + ", supplment=" + supplment
				+ "]";
	}
	public Table(int numero, int nbCouvert, String type, double supplment) {
		super();
		this.numero = numero;
		this.nbCouvert = nbCouvert;
		this.type = type;
		this.supplment = supplment;
	}
	
	
}
