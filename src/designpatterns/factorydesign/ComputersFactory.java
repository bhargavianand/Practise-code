package designpatterns.factorydesign;

/**
 * 
 * @author bharg
 *
 *         We can keep Factory class Singleton or we can keep the method that
 *         returns the subclass as static here we are keeping method as static
 * 
 *         Notice that based on the input parameter, different subclass is
 *         created and returned. getComputer is the factory method.
 * 
 * 
 * 
 */
public class ComputersFactory {

	public static Computers getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}

}
