package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDay1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sarav\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("//li[@class='placeholder']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target1 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(source1, target1).perform();
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		a.dragAndDrop(source2, target2).perform();
		WebElement source3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(source3, target3).perform();
		
		WebElement source4 = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = source4.getText();
		System.out.println(text);
		
	}
		
	}
	


