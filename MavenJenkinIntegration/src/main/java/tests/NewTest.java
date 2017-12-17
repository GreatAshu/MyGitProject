package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
	  @Test
	  public void openMyBlog() {
		driver.get("http://www.softwaretestingmaterial.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\WorkSpaceSHM\\Miscellaneous Projects\\2_33_Chrome\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  //This will Maximize Browser
		  driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
