package test.java.auxiliar.junit.categories.pPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( {
	XTest.class, 
	YTest.class, 
	ZTest.class })
public class AllTests {

}
