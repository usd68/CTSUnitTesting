package ro.ase.cts.testare;

import junit.framework.TestCase;
import ro.ase.cts.Utilizator;

public class TestCaseVarsta extends TestCase {
	Utilizator utilizator;

	public TestCaseVarsta(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		utilizator=new Utilizator("admin", "Aurel", 21);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		utilizator=null;
	}
	
	public void testareValoriNormale() {
		int varstaPrimita=18;
		utilizator.setVarsta(varstaPrimita);
		assertEquals("Set cu valori normale", varstaPrimita,utilizator.getVarsta());
	}
	
	public void testVarstaMinima(){
		int varstaMinima = 1;
		try{
		utilizator.setVarsta(varstaMinima);
		fail("accepta varsta minimca");
		}
		catch (Exception e){
			
		}
	
	}
	
	public void testVarstaMaxima(){
		int varstaMaxima = 80;
		try{
		utilizator.setVarsta(varstaMaxima);
		fail("accepta varsta mai mare de 75");
		}
		catch(Exception e){}
	
	}
	
	
	public void testSubVarstaMinima(){
		int varstaNoua = 14;
		try{
		utilizator.setVarsta(varstaNoua);
		fail("Accepta varsta < 14");
		}
		catch(Exception e){
			
		}
	
	}
}
