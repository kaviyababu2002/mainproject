package testbase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

	public class Baseclass {
		public static WebDriver driver;
		public static Logger logger;
		public static Properties p;
		
		@Parameters({"os","browser"})
		@BeforeTest
	  public void openbrowser(String os, String br) throws IOException {
			FileReader file = new FileReader(".//src//test//resources//config.properties");
			p = new Properties();
			p.load(file);
		    logger = LogManager.getLogger(this.getClass());
			if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				if(os.equalsIgnoreCase("windows")) {
					capabilities.setPlatform(Platform.WIN11);
				}
				else if(os.equalsIgnoreCase("mac")) {
					capabilities.setPlatform(Platform.MAC);
				}
				else {
					System.out.println("No Matching os");
				}
				switch(br.toLowerCase()) {
				case  "chrome":
					capabilities.setBrowserName("chrome");
					break;
				case  "edge":
					capabilities.setBrowserName("MicrosoftEdge");
					break;
				default:
					System.out.println("No matching browser");
				}
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
			}
			else if (p.getProperty("execution_env").equalsIgnoreCase("local")) {
				switch(br.toLowerCase()) {
				case "chrome":
					driver = new ChromeDriver();
					break;
				case "edge":
					driver=new EdgeDriver();
					break;
				default:
					System.out.println("No Matching Browser");
					return;
				}
			}
				driver.get(p.getProperty("appURL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
		}

		public String captureScreen(String name) {
			// TODO Auto-generated method stub
		
			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\" + name + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;
		}
	}

