package Calculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator_Op {
    WebDriver dr;
    @Test(priority=1)
	void open() {
		System.setProperty("webdriver.chrome.driver","E:\\Automation Java\\chromedriver.exe");
		dr =new ChromeDriver();
		dr.get("https://www.calculator.net/");
		dr.manage().window().fullscreen();
	}
    @Test(priority=2)
	void Multiplication() throws InterruptedException {
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'×')]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(2000);
	}
    @Test(priority=3)
	void Division() throws InterruptedException {
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();

		
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(2000);

	}
    @Test(priority=4)
	void Addition() throws InterruptedException {
		dr.findElement(By.xpath("//span[contains(text(),'–')]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(2000);

	}
    @Test(priority=5)
	void Substraction() throws InterruptedException {
		
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		
		dr.findElement(By.xpath("//span[contains(text(),'(')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'–')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'9')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),')')]")).click();

		dr.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		dr.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		Thread.sleep(2000);
		dr.close();
	}
	public static void main(String[] args) throws InterruptedException{
		Calculator_Op obj = new Calculator_Op();
		obj.open();
		obj.Multiplication();
		obj.Division();
		obj.Addition();
		obj.Substraction();
	}
}
