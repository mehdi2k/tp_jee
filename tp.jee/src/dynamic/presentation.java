package dynamic;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation {

	public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		File file=new File("config.txt");
		Scanner s =new Scanner(file);
		String ClassNameDao=s.nextLine();
		Class cDao=Class.forName(ClassNameDao);
		IDao dao=(IDao) cDao.newInstance();
		
		String ClassNameMetier=s.nextLine();
		Class cMetier=Class.forName(ClassNameMetier);
		IMetier metier=(IMetier) cMetier.newInstance();
		
		Method method=cMetier.getMethod("SetDao",IDao.class);
		method.invoke(metier, dao);
		System.out.println(metier.calcul());
	
	}
}
