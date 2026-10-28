package test.Selenium_Automation.Conceptsof_Listener;

	import org.testng.IRetryAnalyzer;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class Lisiner_script implements ITestListener ,IRetryAnalyzer{
		int count=1;
		int lastentry=3;
		@Override
		public void onStart(ITestContext context) {

			System.out.println("MY Test Script Start");
		}

		@Override
		public void onTestStart(ITestResult result) {

			System.out.println("Test Excution start");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			
			System.out.println("Test case fail their is bug"+result);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test case pass successfully");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
		
			System.out.println("logout Method is Skip because login is fali");
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onFinish(context);
		}

		@Override
		public boolean retry(ITestResult result) {
			
			if(count<=lastentry)
			{
				count++;
				return true;
			}
			return false;
		}
		
		

		
		
	}

