import java.util.ArrayList;

public class Store {
	private String name;
	private ArrayList<Product> products;
	public Store(){
		name = "New Wave Store";
		products = new ArrayList<>();
		
		products.add(new Product("NWPC", 9999.99, 1000));
		products.add(new Product("NewPhone", 9999.99, 1000));
		products.add(new Product("newPen", 9999.99, 1000));
		products.add(new Product("software", 9999.99, 1000));
		
		
	
	}
	public Store(String name, Product[] arr) {
		this.name = name;
		this.products = new ArrayList<Product>();
		
		for(int i = 0; i < arr.length; i++) {
			this.products.add(arr[i]);
		}
	}
	
	public void addProduct(Product product) {
		boolean found = false;
		for(int p = 0; p < products.size(); p++) {
			if (product.getName() == this.products.get(p).getName()) {
				found = true;
				products.get(p).setQuantity(product.getQuantity());
			}
		}
		
		if (!found)
			this.products.add(product);
		
			
	}
	
	public double total() {
		double sum = 0;
		for(int i = 0; i < products.size(); i++) {
			sum += products.get(i).getCost() * products.get(i).getQuantity();
			
		}
		return sum;
		
	}
	
	public void sale(String name, double percent) {
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getName().equals(name)) {
				products.get(i).setCost(products.get(i).getCost()* (1 - percent));
			}
			
		}
	}
	
	public void sellItem(String name, int quantity) {
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getName().equals(name)) {
				products.get(i).setQuantity((quantity > products.get(i).getQuantity()) ? 0 : products.get(i).getQuantity() - quantity);
			}
			
		}
	}
	
	public void soldOut() {
		for(int i = 0; i < products.size(); i++) {
			if (products.get(i).getQuantity() <= 0)
				products.remove(i);
		}
	}
	
	@Override
	public String toString() {
		String products = " ";
		
		for(int i = 0; i < this.products.size(); i++) {
			products += this.products.get(i).toString();
		}
		
		return "Store name = " + this.name + "products = " + products;
	}
	

}
