
package generics;

public class Gen_class<T> {
	
	T obj;
	
	//constructor
	
	public Gen_class(T obj) {
		
		this.obj = obj;
	}

	//return the object
	
	public T retObj() {
		return this.obj;
	}
	
	
	public static void main(String[] args) {
		
		Gen_class<String> str = new Gen_class<String>("bhargavi"); 
		
				System.out.println(str.retObj());
	}
}
