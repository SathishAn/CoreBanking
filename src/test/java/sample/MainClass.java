package sample;

import org.testng.TestNG;

import techM.TechMRunnerClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] {TechMRunnerClass.class });
		testSuite.addListener(new Test5SuiteListener());
		testSuite.setDefaultSuiteName("My Test Suite");
		testSuite.setDefaultTestName("My Test");
		//testSuite.setOutputDirectory("/Users/pankaj/temp/testng-output");
		testSuite.run();
	}

}
