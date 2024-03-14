package first;

public class Product {
	// Product attributes
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	// Private constructor to force use of the Builder
	private Product(Builder builder) {
	this.name = builder.name;
	this.price = builder.price;
	this.category = builder.category;
	this.inStock = builder.inStock;
	}
	// Getters (No setters to maintain immutability)
	public String getName() { return name; }
	public double getPrice() { return price; }
	public String getCategory() { return category; }
	public boolean isInStock() { return inStock; }
	// Static Builder class
	public static class Builder {
	private String name;
	private double price;
	private String category;
	private boolean inStock;

	public Builder setName(String name) {
	this.name = name;
	return this;
	}
	public Builder setPrice(double price) {
	this.price = price;
	return this;
	}
	public Builder setCategory(String category) {
	this.category = category;
	return this;
	}
	public Builder setInStock(boolean inStock) {
	this.inStock = inStock;
	return this;
	}
	public Product build() {
	return new Product(this);
	}
	}
	}