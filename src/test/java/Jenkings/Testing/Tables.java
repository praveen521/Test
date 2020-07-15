package Jenkings.Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {
	
	
	public static WebDriver driver;
	@Test
	public static void Table() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//p[@class='intro']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr[1]/th"));
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
		String before_xpath="//table[@id='customers']//tbody/tr[";
		String after_xpath = "]/td[";
		
		int rowcount = row.size();
		int colcount = col.size();
		for(int i=2; i<=rowcount;i++) {
			for(int j=1; j<=colcount;j++) {
				String actualxpath = before_xpath+i+after_xpath+j+"]";
				String text2=driver.findElement(By.xpath(actualxpath)).getText();
				if(text2.contains("Roland")){
					System.out.println("text is found in row number" +i +j);
					break;
				}
			}
			
			
			
		}
	}

}
