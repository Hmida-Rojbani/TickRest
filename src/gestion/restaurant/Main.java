package gestion.restaurant;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Client c = new Client("Doe", "john", LocalDate.of(2022, 11, 31), "john.doe@gmail.com", "12345677");
		Table t = new Table(1,4,"OverSea",5.5);
	}

}
