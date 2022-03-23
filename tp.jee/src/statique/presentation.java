package statique;

public class presentation {

	public static void main(String[] args) {
		//IDao dao=new DaoImpl();
		IDao dao=new DaoImpl2();
		MetierImpl metier =new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());
	}

}
