package ro.ase.cts.testare;

import junit.framework.TestCase;
import ro.ase.cts.Utilizator;

public class TestCaseNumeUtilizator extends TestCase {
	Utilizator utilizator;
	public TestCaseNumeUtilizator(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		utilizator=new Utilizator("admin", "aurel", 21);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		utilizator=null;
	}
	
	public void testNumeUtilizatorNull() { 
		String numePrimit=null;
		try{
		utilizator.setNume(numePrimit);
		fail("accepta nume null");
		}
		catch(Exception e){}
	}

	
	public void testNumeUtilizatorLungimeSirIntrodus() { 
		String numePrimit="edcrfededededededed";
		try{
		utilizator.setNume(numePrimit);
		fail("accepta nume cu lungime mai mare de 12 caractere");
		}
		catch(Exception e){
			
		}
	}
}
