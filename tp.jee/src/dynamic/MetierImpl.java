package dynamic;

public class MetierImpl implements IMetier{
	private IDao dao;
	
	@Override
	public double calcul() {
		double temp =dao.getData();
		double res =temp*10;
		return res;
	}
	
	public void SetDao(IDao dao) {
		this.dao=dao;
	}

}
