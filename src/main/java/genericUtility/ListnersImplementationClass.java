package genericUtility;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener; 
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import io.netty.handler.codec.http.HttpContentEncoder.Result;

	public class ListnersImplementationClass implements ITestListener
	{
		ExtentReports report;
		ExtentTest test;
		public void onTestStart(ITestResult result) 
		{
			String methodName=result.getMethod().getMethodName();
		
			test=report.createTest(methodName);
			
			test.log(Status.INFO,"--"+methodName+"-->Test Execution Started<--");
			test.log(Status.INFO, "--"+methodName+"-->Test Exe Started<--");
		}

		public void onTestSuccess(ITestResult result) 
		{
			String methodName=result.getMethod().getMethodName();
			test.log(Status.PASS, "--"+methodName+"-->Test Execution Passed<--");
		}

		public void onTestFailure(ITestResult result) 
		{
			String methodName=result.getMethod().getMethodName();
			test.log(Status.FAIL, "---"+methodName+"--->Test is Failed<---");
			test.log(Status.WARNING, result.getThrowable());
		    
			//Taking ScreenShot for failed test scripts
			String screenshotName=methodName+"-"+new JavaUtility().getSystemDateInFormat();
			 
			WebDriverUtility wUtility=new WebDriverUtility();
			try 
			{
				String path = wUtility.takeScreenShot(GoldBharat_BaseClass.sDriver, screenshotName);
				test.addScreenCaptureFromPath(path);  //Attach Screen shot to the Report
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

		public void onTestSkipped(ITestResult result) 
		{
			String methodName=result.getMethod().getMethodName();
			//System.out.println("--"+methodName+"-->Test Execution Skipped<--");
			test.log(Status.SKIP, "--->"+methodName+"->Test is Skipped<-");
			test.log(Status.WARNING,result.getThrowable());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
		{
			
		}

		public void onTestFailedWithTimeout(ITestResult result) 
		{
			
		}

		public void onStart(ITestContext context) 
		{
			System.out.println("-->Suite Execution Started<--");
			
		
	    	ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\Extent Reports\\Report-"+new JavaUtility().getSystemDateInFormat()+".html");	
			htmlReport.config().setDocumentTitle("GoldBharat Execution Report");
			htmlReport.config().setReportName("GoldBharat-Automation Report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			report=new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("Base Browser:","Chrome");
			report.setSystemInfo("Base URL:", "https://goldbharat.com");
			report.setSystemInfo("Base Platform:", "Windows 11");
			report.setSystemInfo("Reporter Name:", "Pavani.K");
			
		}

		public void onFinish(ITestContext context) 
		{
			System.out.println("-->Suite Execution Finished<--");
		
			report.flush();
			
			
		}
	   

	}

