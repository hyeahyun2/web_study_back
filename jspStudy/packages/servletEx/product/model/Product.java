package servletEx.product.model;

public class Product {
	private String id;
	private String name;
	private String marker;
	private int price;
	private String date;

	// »ý¼ºÀÚ
	public Product(String id, String name, String marker, int price, String date) {
		super();
		this.id = id;
		this.name = name;
		this.marker = marker;
		this.price = price;
		this.date = date;
	}
	
	// getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarker() {
		return marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
