package gestion.restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
	
	private int numero;
	private LocalDateTime date;
	private int nbCouvert;
	private double addition;
	
	private Client client;
	private Table table;
	private ArrayList<Food> foods;
	public Ticket(int numero, int nbCouvert, Client client, Table table, ArrayList<Food> foods) {
		super();
		this.numero = numero;
		this.nbCouvert = nbCouvert;
		this.client = client;
		this.table = table;
		this.foods = foods;
		this.date = LocalDateTime.now();
		this.addition = table.getSupplment();
		for (Food food : foods) {
			this.addition+=food.getPrix();
		}
	}
	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", date=" + date + ", nbCouvert=" + nbCouvert + ", addition=" + addition
				+ ", client=" + client + ", table=" + table + ", foods=" + foods + "]";
	}
	
	

}
