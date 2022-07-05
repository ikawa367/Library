package utility;

import exceptions.PersianDateException;
import interfaces.dates.ValidationDate;

public class PersianDate implements ValidationDate {

	private int year;
	private int month;
	private int day;
	
	{
		year = 1400;
		month = 1;
		day = 1;
	}
	
	public PersianDate() {}
	public PersianDate(String date) throws PersianDateException{
		detachPersianDate(date);
	}
	
	public int getYear() {return year;}
	private void setYear(int year) throws PersianDateException{
		if (year<1200 || year>1700)
			throw new PersianDateException("Sal Namotabar Ast!!!"+"\n(Sal Ra Beyne 1200 Ta 1700 Vared Konid");
		else
			this.year = year;
	}
	
	public int getMonth() {return month;}
	private void setMonth(int month) throws PersianDateException{
		if (month<1 || month>12)
			throw new PersianDateException("Mah Namotabar Ast!!!"+"\n(Mah Ra Beyne 01 Ta 12 Vared Konid)");			
		else
			this.month = month;
	}
	
	public int getDay() {return day;}
	private void setDay(int day) throws PersianDateException{
		if (day<1 || day>31)
			throw new PersianDateException("Rooz Namotabar Ast!!!"+"\n(Rooz Ra Beyne 01 Ta 31 Vared Konid)");				
		else
			this.day = day;
	}
	
	private void setPersianDate(int y, int m, int d) throws PersianDateException{
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	
	public void resetPersianDate() throws PersianDateException{
		setYear(1200);
		setMonth(1);
		setDay(1);
	}
	
	public void showPersianDate() {
		System.out.format("Tarikh: %d-%d-%d",getYear(),getMonth(),getDay());
	}
	
	@Override
	public void validatePersianDate(String date) throws PersianDateException{
		if (date.length()!=10)
			throw new PersianDateException("Tedad Charachterha Gheyre Mojaz Ast!!!");
		if (!date.substring(0,4).matches("[\\d]+"))
			throw new PersianDateException("Sal Bayad Adad Bashad!!!");
		if (!date.substring(4,5).matches("-"))
			throw new PersianDateException("JodaKonande Aval Namotabar Ast!!!");
		if (!date.substring(5,7).matches("[\\d]+"))
			throw new PersianDateException("Mah Bayad Adad Bashad!!!");
		if (!date.substring(7,8).matches("-"))
			throw new PersianDateException("JodaKonande Dovom Namotabar Ast!!!");
		if (!date.substring(8,10).matches("[\\d]+"))
			throw new PersianDateException("Rooz Bayad Adad Bashad!!!");
	}
	
	private void detachPersianDate (String date) throws PersianDateException{
		validatePersianDate(date);
		int year = Integer.parseInt(date.substring(0,4));
		int month = Integer.parseInt(date.substring(5,7));;
		int day = Integer.parseInt(date.substring(8,10));;
		setPersianDate(year, month, day);
	}

}
