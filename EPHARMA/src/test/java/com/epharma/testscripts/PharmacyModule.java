package com.epharma.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PharmacyModule {
	
	@Test
	public void orderMedicin()
	{
		Reporter.log("Medicines has been ordered",true);
	}

}
