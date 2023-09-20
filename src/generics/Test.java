/** 
 * generics method example
 */
package generics;

public class Test {

	//create generic method for getting the classname of 
	// the parameter
	
	static <T> String display(T element) {
	
	return element.getClass().getName();	
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(display("stringmethod"));
		System.out.println(display(true));
		System.out.println(display(1.4));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}