package models;
import exceptions.PersianDateException;
import utility.PersianDate;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("\t*********START*********");
		PersianDate pd = null;
		try {
			pd = new PersianDate("1401-03-23");
			pd.showPersianDate();
		} catch (PersianDateException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			//System.out.println("\n"+pd.getDay());
		}
		//System.out.println(pd.getYear());
		
		System.out.println("\n\t**********END**********");
	}
}
