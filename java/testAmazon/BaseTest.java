package testAmazon;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class BaseTest {
		
		public static WebDriver driver;
		public static FileReader fr;
		public static FileReader mainTest;
		public static Properties prop = new Properties();
		public static Properties mt_loc = new Properties();
		
		
		@BeforeTest
		public void setup() {
			if (driver == null) {
				try {
				fr = new FileReader(System.getProperty("user.dir") + "/src/test/resources/configfiles/config.properties");
				mainTest = new FileReader(System.getProperty("user.dir")
						+ "/src/test/resources/configfiles/main_test.properties");
				try {
					prop.load(fr);
				mt_loc.load(mainTest);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}


			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("testurl"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("testurl"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("testurl"));
			}
		}
		}

	@AfterTest

		public void tearDown() {
			driver.close();
			
	
}
	

}