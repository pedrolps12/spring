package project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name",  nullable=false , length= 255)
	private String name;	
	private String description;
	private int quantityPerUnit;
	private double unitPrice;
	private double unitWeight;
	private int unitInStock;
	private double disccount;
	private String picture;
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(int quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getUnitWeight() {
		return unitWeight;
	}
	public void setUnitWeight(double unitWeight) {
		this.unitWeight = unitWeight;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public double getDisccount() {
		return disccount;
	}
	public void setDisccount(double disccount) {
		this.disccount = disccount;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Product(int id, String name, String description, int quantityPerUnit, double unitPrice, double unitWeight,
			int unitInStock, double disccount, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantityPerUnit = quantityPerUnit;
		this.unitPrice = unitPrice;
		this.unitWeight = unitWeight;
		this.unitInStock = unitInStock;
		this.disccount = disccount;
		this.picture = picture;
	}
	public Product() {
		super();
	}
	
	

}
