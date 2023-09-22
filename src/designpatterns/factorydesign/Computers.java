package designpatterns.factorydesign;

public abstract class Computers {
	
	//3 abstract methods declared; which have to be implemented in subclasses
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		
		return "RAM ="+this.getRam()+"HDD = "+this.getHDD()+"CPU="+this.getCPU();
	}

}
