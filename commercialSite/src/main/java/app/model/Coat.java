package app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import app.util.Quantity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Coat {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "coat_id")
	private String coatID;
	@Column(name = "coat_quantity")
	private int coatQuantity;
	@Column(name = "coat_brand")
	private String coatBrand;
	@Column(name = "coat_model")
	private String coatModel; // male,female,unisex
	@Column
	private String description;
	@Column(name = "in_stock")
	private boolean inStock;
	@Column
	private int size;
	@Column
	private String colour;
	@Column
	private double price;

}
