package ro.ase.cts.testare;

import junit.framework.TestCase;
import ro.ase.cts.Utilizator;

public class TestCaseTipUtilizator extends TestCase {

	Utilizator utilizator;
	public TestCaseTipUtilizator(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		utilizator=new Utilizator("admin", "aurel", 24);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		utilizator=null;
	}

	public void testTipUtilizatorValorNormale() {
		String tipPrimit="admin";
		utilizator.setTip(tipPrimit);
		assertEquals("", tipPrimit,utilizator.getTip());
	}
	
	public void testTipUtilizatorLungimeSirIntrodus() {
		String tipPrimit="edcrfvtbtttbttbtb";
		try{
		utilizator.setTip(tipPrimit);
		fail("accepta tip utilizator cu mai mult de 12 caractere");
		}
		catch(Exception e){}
	}
	
	
	public void testTipUtilizatorNull() {
		String tipPrimit=null;
		try{
		utilizator.setTip(tipPrimit);
		fail("accepta tip null");
		}
		catch(Exception e){}
	}
	
	
}
