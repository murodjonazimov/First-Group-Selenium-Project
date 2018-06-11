package com.weborder;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/murodjon/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		List<String> names = new ArrayList<>(100);
		BufferedReader bf = new BufferedReader(new FileReader("MOCK_DATA.csv"));
		for (int i = 0; i < 100; i++) {
			names.add(bf.readLine());
		}

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Tester");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);

		// second page
		driver.findElement(By.linkText("Order")).click();
		String randomName = "";
		int k = (int) Math.floor(Math.random() * 101);
		for (int i = 0; i < names.size(); i++) {
			if (k == i)
				randomName = names.get(i);
		}
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"))
				.sendKeys("" + (int) Math.floor(Math.random() * 101));
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + randomName + " Smith");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		Thread.sleep(1000);

		// random zip codes

		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"))
				.sendKeys("" + (int) Math.floor(Math.random() * 100000));
		Thread.sleep(1000);
		// VISA
		WebElement Visa = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
		Visa.click();
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("4522232334421144");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("02/23");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Process")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();

		// MasterCard
		driver.findElement(By.linkText("Order")).click();
		randomName = "";
		k = (int) Math.floor(Math.random() * 101);
		for (int i = 0; i < names.size(); i++) {
			if (k == i)
				randomName = names.get(i);
		}
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"))
				.sendKeys("" + (int) Math.floor(Math.random() * 101));
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + randomName + " Smith");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		Thread.sleep(1000);

		// random zip codes

		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"))
				.sendKeys("" + (int) Math.floor(Math.random() * 100000));
		Thread.sleep(1000);
		WebElement MasterCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
		MasterCard.click();
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("5322732336421144");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("12/24");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Process")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();

		// AmericanExpress

		driver.findElement(By.linkText("Order")).click();
		randomName = "";
		k = (int) Math.floor(Math.random() * 101);
		for (int i = 0; i < names.size(); i++) {
			if (k == i)
				randomName = names.get(i);
		}
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"))
				.sendKeys("" + (int) Math.floor(Math.random() * 101));
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + randomName + " Smith");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		Thread.sleep(1000);

		// random zip codes

		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5"))
				.sendKeys("" + (int) Math.floor(Math.random() * 100000));
		Thread.sleep(1000);
		WebElement AmericanExpress = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"));
		AmericanExpress.click();
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("318692339641144");
		Thread.sleep(1000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("09/19");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Process")).click();
		Thread.sleep(2000);
	}

}
