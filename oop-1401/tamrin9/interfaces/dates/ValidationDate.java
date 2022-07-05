package interfaces.dates;

import exceptions.PersianDateException;

public interface ValidationDate{
	void validatePersianDate(String date) throws PersianDateException;
}
