package sample;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Test5SuiteListener implements ISuiteListener {

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("TestNG suite default output directory = "+ arg0.getOutputDirectory());
	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		System.out.println("TestNG invoked methods = " +arg0.getAllInvokedMethods());
		
	}

}
