package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Baseclass;
import generic.Generic_Excel;
import pomscript.Pomclass;

public class Test_script extends Baseclass {

	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		 String firstname = Generic_Excel.getData("Sheet1", 0, 0);
		 String lastname = Generic_Excel.getData("Sheet1", 1, 0);
		 String email = Generic_Excel.getData("Sheet1", 2, 0);
		 String number = Generic_Excel.getData("Sheet1", 3, 0);
		 
		 Pomclass pmc= new Pomclass(driver);
				pmc.first(firstname);
				pmc.last(lastname);
				pmc.mail(email);
				pmc.phone(number);
	}
}
