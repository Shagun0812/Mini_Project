package StepDef;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	@When("^User is on Application Home Page$")
	public void user_is_on_Application_Home_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/home/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^User clicks on the My_Account Button$")
	public void user_clicks_on_the_My_Account_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(
				By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[2]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Then("^User enters the First Name, Last Name, Mobile Number, Email, Password and Confirm Password and click SignUp button$")
	public void user_enters_the_First_Name_Last_Name_Mobile_Number_Email_Password_and_Confirm_Password_and_click_SignUp_button(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		for (Map<String, String> dataMap : arg1.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(dataMap.get("First Name"));
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(dataMap.get("Last Name"));
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(dataMap.get("Mobile Number"));
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(dataMap.get("Email"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataMap.get("Password"));
			driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys(dataMap.get("Conform Password"));
			
			WebElement element = driver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[8]/button[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				
				e1.printStackTrace();
			} 
			
			driver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[8]/button[1]")).click();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}

	@When("^User navigate to UserProfile Page$")
	public void user_navigate_to_UserProfile_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("My Account")){
			System.out.println("SignUpsuccessful");
		}
		else{
			System.out.println("Error in provided data");
		}
        driver.quit();
	}

}
