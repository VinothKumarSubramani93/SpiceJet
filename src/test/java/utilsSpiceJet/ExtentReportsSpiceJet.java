 package utilsSpiceJet;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsSpiceJet {
	
	public static ExtentReports getReportObject() {
		String path= System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Spice Jet Automation Project");
		reporter.config().setDocumentTitle("Spice Jet Reports");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Performed By : ", "S.Vinothkumar JAT-5");
		return extent;
	}
}
