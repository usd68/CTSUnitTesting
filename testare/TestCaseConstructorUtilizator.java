package ro.ase.cts.testare;

import junit.framework.TestCase;
import ro.ase.cts.Utilizator;

public class TestCaseConstructorUtilizator extends TestCase {
	
	Utilizator utilizator;

	public TestCaseConstructorUtilizator(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();

	}

	protected void tearDown() throws Exception {
		super.tearDown();
		utilizator=null;
	}

	public void testConstructorUtilizatorValoriNormale() {
		String tip="admin";
		String nume="Aurel";
		int varsta=23;
		utilizator=new Utilizator(tip, nume, varsta);
		assertEquals("Verificare constructor tip utilizator ", tip,utilizator.getTip());
		assertEquals("Verificare constructor nume utilizator ", nume,utilizator.getNume());
		assertEquals("Verificare constructor varsta utilizator ", varsta,utilizator.getVarsta());
		
	}
	
	
	public void testareConstructorUtilizatorTipNull() {
		String tip=null;
		String nume="Aurel";
		int varsta=24;
		
		try {
			utilizator=new Utilizator(tip, nume, varsta);
			fail("Lipsa exceptie tip=null");
		} 
		catch (Exception e) {
			
		}
	
	}
	
	public void testareConstructorUtilizatorNumeNull() {
		String tip="admin";
		String nume=null;
		int varsta=24;
		
		try {
			utilizator=new Utilizator(tip, nume, varsta);
			fail("Lipsa exceptie nume=null");
		} 
		catch (Exception e) {
			
		}
	
	}
	
	public void testareConstructorUtilizatorVarstaMinima() {
		String tip="admin";
		String nume="aurel";
		int varsta=14;
		
		try {
			utilizator=new Utilizator(tip, nume, varsta);
			fail("Lipsa exceptie varsta minima");
		} 
		catch (Exception e) {
			
		}
	
	}
	
	public void testareConstructorUtilizatorVarstaMaxima() {
		String tip="admin";
		String nume="aurel";
		int varsta=75;
		
		try {
			utilizator=new Utilizator(tip, nume, varsta);
			fail("Lipsa exceptie varsta maxima");
		} 
		catch (Exception e) {
			
		}
	
	}
	
	public void testareConstructorUtilizatorTipValoriAberante() {
		String tip="adefedcvfrasdasdas";
		String nume="aurel";
		int varsta=75;
		
		try {
			utilizator=new Utilizator(tip, nume, varsta);
			fail("Lipsa exceptie tip valori aberante");
		} 
		catch (Exception e) {
			
		}
	
	}
	
	public void testareConstructorUtilizatorNumeValoriAberante() {
		String tip = "aurel";
		String nume = "efrvgrtgtgyhtgyhhyfrverevrgbtygrfed";
		int varsta = 75;
		
		try {
			utilizator=new Utilizator(tip, nume, varsta);
			fail("Lipsa exceptie nume valori aberante");
		} 
		catch (Exception e) {
			
		}
	
	}
	
}
