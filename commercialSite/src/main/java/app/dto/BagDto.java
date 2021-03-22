package app.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class BagDto { // class koito ogranichava kakva informaciq da se vizualizira po izbor, zashtoto izbqvgvame da se izpolzva modela, toi moje da se 
	//zastupva ot bazite danni

	private int bagQuantity;
	private String bagBrand;
	private String bagModel; // male,female,unisex
	private String description;
	private boolean inStock;
	private double price;
	private String colour;
}
