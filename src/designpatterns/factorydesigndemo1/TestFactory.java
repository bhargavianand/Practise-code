package designpatterns.factorydesigndemo1;


public class TestFactory {
	
	public static void main(String[] args) {
		
		Computers pc = ComputersFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computers server = ComputersFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
	
		Computers test123 = ComputersFactory.getComputer("test","1 GB","3 TB","2 GHz");

		System.out.println("Factory PC Config::"+pc.toString());
		System.out.println("Factory Server Config::"+server.toString());

		System.out.println("Factory test123 config:: "+test123);
		
	}

}
