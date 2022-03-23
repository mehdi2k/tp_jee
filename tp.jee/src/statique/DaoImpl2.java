package statique;

public class DaoImpl2 implements IDao{

	@Override
	public double getData() {
		double temp =50;
		System.out.println("version 2 ");
		return temp;
	}

}