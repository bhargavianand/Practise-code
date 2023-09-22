package designpatterns.factorydesigndemo3;

public class PizzaFactory {
	
	public static Pizza createPizzaFactory(String type) {
		
		
		if(type.equals(null) | type.isEmpty()) {
			return null;
		}
		else if(type.equalsIgnoreCase("Margherita")) {
			return new MargheritaPizza();
		}
		else if(type.equalsIgnoreCase("Pepperoni")) {
			return new PepperoniPizza();
		}
		else {
			throw new IllegalArgumentException("Invalid Pizza type");
		}
	}

}
