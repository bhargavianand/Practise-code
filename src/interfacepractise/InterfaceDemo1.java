package interfacepractise;

//Since Java 8, we can have default and static methods in an interface.

//Since Java 9, we can have private methods in an interface.

public interface InterfaceDemo1 {

	int MIN = 5; // this is public, static , final by default
	// interface methods

	void print1(); // abstract method

	// static method
	public static void print2() {
		System.out.println("Static method");
	}

	// private method

	private void print3() {
		System.out.println("private print3() method");
	}
	// default method

	default void print4() {
		System.out.println("print4() is a default method");
	}
}
