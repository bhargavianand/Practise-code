package generics;

public class GenMethod {
	
	public static <T> T getValue(T[] array,int index) {
		
		 return array[index];
	}

	
	//below generic method can print any type of array elements.
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	}
	
	
	//below non generic method is converted above into generic method
	public static void printArray1(Integer[] array)
	{
		for(Integer element : array) {
			System.out.println(element);
		}
	}
	
	
	// template method can search any type product 
	public static <T> T searchProduct(T search) {
		
		System.out.println("product searched is");
		return search;
	}
	
	public static void main(String[] args) {
	
		String[] array = {"apple","banana","Orange"};
		Integer[] array1 = {99,33,55,22};
		String value =  getValue(array,1);	
//		System.out.println(value);
//		GenMethod.printArray(array);
//		GenMethod.printArray(array1);
          
		printArray1(array1);
		
		System.out.println(searchProduct(4));
		
		System.out.println(searchProduct("goggles"));
		
		System.out.println(searchProduct(4343));

	}
	
	
	
	
}
