package nop.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterClass {

	public void extentClass() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/index.html");
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("LetShop Web");
		extent.attachReporter(spark);

	}
}
