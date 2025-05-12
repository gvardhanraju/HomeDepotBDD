package stepdefinition;

import java.awt.FlowLayout;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;
import utils.TriggerReport;

public class Hooks extends Base {
	private static JProgressBar progressBar;
    private static JFrame frame;
    private static int testCount = 0;
    private static final int totalTests = 17;
	static ExtentReports reports;
	static String timestamp;
	
    /*
     * a. Method Name: openReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To generate the report
     * d. Return Type: void
     * e. Parameters: none
     */
	@BeforeAll
	public static void openReport() {
		frame = new JFrame("Test Execution Progress");
        progressBar = new JProgressBar(0, totalTests);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
 
        frame.setLayout(new FlowLayout());
        frame.add(progressBar);
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		reports = Reporter.generateExtentReports("HOMEDEPOT_Report", timestamp);
	}
	
    /*
     * a. Method Name: open
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To open the browser
     * d. Return Type: void
     * e. Parameters: none
     */
	@Before
	public void open() {
		openBrowser();
	}
	
    /*
     * a. Method Name: close
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: To close the browser
     * d. Return Type: void
     * e. Parameters: none
     */
	@After
	public void close() {
		driver.quit();
		testCount++;
        progressBar.setValue(testCount);
        progressBar.setString("Executed: " + testCount + "/" + totalTests);
	}
	
    /*
     * a. Method Name: closeReport
     * b. Author Name: Jaya vardhan Raju G
     * c. Description: Finalizes and flushes the report data to the report file
     * d. Return Type: void
     * e. Parameters: none
     */
	@AfterAll
	public static void closeReport() {
		reports.flush();
        try {
            TriggerReport.sendEmailWithAttachment(timestamp);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
