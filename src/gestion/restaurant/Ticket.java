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

}
