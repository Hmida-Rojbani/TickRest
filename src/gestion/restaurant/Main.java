package gestion.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Client c = new Client("Doe", "john", LocalDate.of(2022, 11, 30), "john.doe@gmail.com", "12345677");
		Table t = new Table(1,4,"OverSea",5.5);
		ArrayList<Food> foodsMenu = new ArrayList<>();
		foodsMenu.add(new Plat("Pizza", 12));
 		foodsMenu.add(new Plat("Pasta", 11));
		foodsMenu.add(new Plat("sushi", 25)); 
		foodsMenu.add(new Entree("Soupe", 6));
		foodsMenu.add(new Entree("Salde", 7));
		foodsMenu.add(new Dessert("Glace Chocolat", 5));
		foodsMenu.add(new Dessert("Cake", 8));
		Ticket tic = new Ticket(1, 2, c, t, foodsMenu);
		System.out.println(tic);
	}

}
