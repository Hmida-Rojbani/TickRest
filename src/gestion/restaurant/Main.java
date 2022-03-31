package gestion.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Client c = new Client("Doe", "john", LocalDate.of(2022, 11, 31), "john.doe@gmail.com", "12345677");
		Table t = new Table(1,4,"OverSea",5.5);
		ArrayList<Food> foods = new ArrayList<>();
		foods.add(new Plat("Pizza", 12));
		foods.add(new Plat("Pasta", 11));
		foods.add(new Plat("sushi", 25));
		foods.add(new Entree("Soupe", 6));
		foods.add(new Entree("Salde", 7));
		foods.add(new Dessert("Glace Chocolat", 5));
		foods.add(new Entree("Cake", 8));
	}

}
