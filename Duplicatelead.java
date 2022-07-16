package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Duplicatelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LAUNCH THE URL
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/controls/main");
				// MAXIMIZE THE PAGE
				driver.manage().window();

				// ENTER USERNAME AND PWD USING ID LOCATOR
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// CLICK ON LOGIN BUTTON USING CLASS LOCATOR
				driver.findElement(By.className("decorativeSubmit")).click();

				// CLICK ON CRM/SFA LINK
				driver.findElement(By.linkText("CRM/SFA")).click();
				// CLICK ON LEADS BUTTON
				driver.findElement(By.linkText("Leads")).click();
				// CLICK ON CREATE LEAD
				driver.findElement(By.linkText("Create Lead")).click();

		// ENTER COMPANY NAME FIELD USING ID LOCATOR
				driver.findElement(By.id(" createLeadForm_companyName")).sendKeys("selenium");
				// ENTER FIRST NAME FIELD USING ID LOCATOR
				driver.findElement(By.id(" createLeadForm_firstName")).sendKeys("nithya");
				// ENTER LASTNAMEFIELD USING ID LOCATOR

				driver.findElement(By.id("createLeadForm_lastName ")).sendKeys("chidambaram");
				// ENTER FIRSTNAME LOCAL FIELD USING ID LOCATOR

				driver.findElement(By.id("createLeadForm_firstNameLocal ")).sendKeys("Elsa");
				// ENTER DEPARTMENT NAMEFIELD USING ID LOCATOR

				driver.findElement(By.id("createLeadForm_departmentName ")).sendKeys("Computer");
				// ENTER DESCRIPTION FIELD USING ID LOCATOR

				driver.findElement(By.id("createLeadForm_description ")).sendKeys("this is a useful department");
				// ENTER EMAIL FIELD USING ID LOCATOR

				driver.findElement(By.id("createLeadForm_primaryEmail ")).sendKeys("smile @gmail.com");

				// SELECT STATE/PROVINCE USING VISIBLE TEXT
				WebElement statedropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select state = new Select(statedropdown);
				state.selectByVisibleText("Alabama");
				// CLICK ON THE CREATE BUTTON
				driver.findElement(By.className("smallSubmit")).click();
				// GET THE TITLE OF RESULTING PAGE
				String title = driver.getTitle();
				System.out.println(title);
				// CLICK ON DUPLICATE BUTTON
				driver.findElement(By.className("subMenuButton")).click();
				
				// ENTER COMPANY NAME FIELD USING ID LOCATOR
				driver.findElement(By.id(" createLeadForm_companyName")).clear();
				driver.findElement(By.id(" createLeadForm_companyName")).sendKeys("dexa");
				// ENTER FIRST NAME FIELD USING ID LOCATOR
				driver.findElement(By.id(" createLeadForm_firstName")).clear();
				driver.findElement(By.id(" createLeadForm_firstName")).sendKeys("rahul");
				// CLICK ON THE CREATE BUTTON
				driver.findElement(By.className("smallSubmit")).click();
				// GET THE TITLE OF RESULTING PAGE
				String title1 = driver.getTitle();
				System.out.println(title1);
//
				
//
				


	}

}
