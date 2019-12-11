package designpatten.decorator_21.test2;

public abstract class Decorator implements GoodsSaleEbi{

	protected GoodsSaleEbi ebi;
	
	public Decorator(GoodsSaleEbi ebi){
		this.ebi = ebi;
	}


}
