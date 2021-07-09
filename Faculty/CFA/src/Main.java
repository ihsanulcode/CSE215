
public class Main {

	public static void main(String[] args) {
		Electronics e = new Electronics("Fridge",20000,"XYZ","3 years");
		Clothing c = new Clothing("X",2000,"ABC");
		
		System.out.println(e.toString());
		System.out.println();
		System.out.println(c.toString());
	}

}

class Product {
	String name;
	double price;

	Product() {

	}

	Product(String name,double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class Electronics extends Product{
	String model;
	String warranty;
	
	Electronics(){
		
	}
	
	Electronics(String name,double price,String model,String warranty){
		super(name,price);
		this.model = model;
		this.warranty = warranty;
	}

	public String getModel() {
		return model;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	
	public double changePrice() {
		return getPrice() - (getPrice()*(20.0/100));
	}
	
	public String toString(){
		return "Name: "+getName()+"\nPrice: "+changePrice()+"\nModel: "+model+"\nWarranry: "+warranty;
	}
}

class Clothing extends Product{
	String fabricType;
	
	Clothing(){
		
	}
	
	Clothing(String name,double price,String ftype){
		super(name,price);
		this.fabricType = ftype;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}
	
	public double changePrice() {
		return getPrice() + (getPrice()*(10.0/100));
	}
	
	public String toString(){
		return "Name: "+getName()+"\nPrice: "+changePrice()+"\nFabrics Type: "+fabricType;
	}
}