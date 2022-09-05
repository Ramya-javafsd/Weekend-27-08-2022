package Encapsulation;

public class Demo {

	
	public static void main(String[] args) {
		
		
		Product p = new Product();
		
		p.setId(1);
		p.setName("Ramya");
		p.setPrice(2000.878);
		p.setDesc("easy to use");
		
		System.out.println(" ID : " +p.getId());
		System.out.println(" NAME: " +p.getName());
		System.out.println(" PRICE: " +p.getPrice());
		System.out.println(" DESC: " +p.getDesc());
		
	}
}
