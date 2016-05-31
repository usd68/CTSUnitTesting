package ro.ase.cts.testare;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteUtilizator extends TestCase {
	
	public static Test suite() {
		TestSuite colectie=new TestSuite();
		colectie.addTestSuite(TestCaseConstructorUtilizator.class);
		colectie.addTestSuite(TestCaseVarsta.class);
		colectie.addTestSuite(TestCaseTipUtilizator.class);
		colectie.addTestSuite(TestCaseNumeUtilizator.class);
		return colectie;
	}

}
