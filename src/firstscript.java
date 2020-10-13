import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstscript {
	
	private WebDriver driver ;  
	private String baseUrl ; 
	 
    
	
	@Test(priority = 0)
	public void setUp() throws Exception {  
		
	
	WebDriverManager.chromedriver().setup(); 
	
	this.driver = new ChromeDriver(); 
	
	this.baseUrl = "http://localhost:3000/login";  
	driver.get(baseUrl); 
	
	
	    
	//wait is too important in automating test scripts ,  it helps to relsove some issues related to lag time of web elements
	driver.manage().timeouts().implicitlyWait(70000, TimeUnit.SECONDS);  
	
	
	driver.manage().window().maximize();
	
	}
	
	@Test(priority = 1)
	public void A_TEST() throws Exception {   
		
		 driver.findElement(By.id("username")).sendKeys("supervisor");   
		 
		 Thread.sleep(2000); 
		 
		 driver.findElement(By.id("password")).sendKeys("admin");  
		 
		 driver.findElement(By.id("login")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);  
		 
		 
		 	}  
	
	@Test(priority = 2) 
	public void SendMeeting() throws Exception {  
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[7]/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"adddescription\"]")).sendKeys("description");   
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"addplace\"]")).sendKeys("ENSIAS");  
		
		Thread.sleep(3000);
		
		WebElement dateBox = driver.findElement(By.xpath("//*[@id=\"adddate\"]")) ; 
		
		dateBox.sendKeys("15022020"); 
		
		dateBox.sendKeys(Keys.TAB);
		
		dateBox.sendKeys("0459");   
		
		Thread.sleep(2000);
		
		//send demand 
		
		driver.findElement(By.xpath("//*[@id=\"send\"]")).click();  
		
		Thread.sleep(5000);
		
		//go to meetings component
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/ul/li[2]/a")).click(); 
		
		Thread.sleep(3000);
		
	
		
	}
	
	@Test(priority = 3) 
	public void Meetings() throws Exception {  
		
		driver.findElement(By.xpath("//*[@id=\"delete0\"]")).click();   
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"justdoit\"]")).click(); 
		
		Thread.sleep(1000);  
		
		//go to posts component
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/ul/li[3]/a")).click();
		
	} 
	
	@Test(priority = 4) 
	public void Posts() throws Exception { 
		
		driver.findElement(By.xpath("//*[@id=\"share\"]")).click();  
		
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Description");  
		
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("//*[@id=\"content\"]")).sendKeys("Content");   
		
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("//*[@id=\"uploadfile\"]")).sendKeys("E:\\talhi_cv.pdf");   
		
		Thread.sleep(1000); 
		
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();  
		
	
		
	}
	
	
 
	
	


 
	
	
	   
	
}
