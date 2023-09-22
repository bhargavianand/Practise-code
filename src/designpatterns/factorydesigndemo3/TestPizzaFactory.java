package designpatterns.factorydesigndemo3;

public class TestPizzaFactory {
	
	public static void main(String[] args) {
		
		Pizza pizza = PizzaFactory.createPizzaFactory("Pepperoni");
		pizza.prepare();		
		
	}

}
