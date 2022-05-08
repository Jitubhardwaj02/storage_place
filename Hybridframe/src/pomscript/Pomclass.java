package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.EmailableReporter;

public class Pomclass {

	@FindBy(id="firstName")
	private WebElement fname;
	
	@FindBy(id="lastName")
	private WebElement lname;
	
	@FindBy(id="userEmail")
	private WebElement uemail;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label")
	private WebElement male;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]/label")
	private WebElement female;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[3]")
	private WebElement others;
	
	@FindBy(xpath="//*[@id=\"userNumber\"]")
	private WebElement mnumber;
	
	@FindBy(xpath="//*[@id=\"dateOfBirthInput\"]")
	private WebElement dob;
	 
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]")
	 private WebElement subjects;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]/label")
	private WebElement hsports;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[2]/label")
	private WebElement hreading;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[3]/label")
	private WebElement hmusic;
	
	@FindBy(xpath="//*[@id=\"uploadPicture\"]")
	private WebElement browsebtn;
	
	@FindBy(xpath="//*[@id=\"currentAddress\"]")
	private WebElement currentadd;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[2]/div/div/div[1]/div[1]")
	private WebElement state;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[3]")
	private WebElement city;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]")
	private WebElement submit;
	
	
	public Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void first (String datafname)
	{
		fname.sendKeys(datafname);

	}
	public void last(String datalname)
	{
		lname.sendKeys(datalname);
	}
	
	public void mail(String dataemal)
	{
		uemail.sendKeys(dataemal);
}
	public void phone(String datanum)
	{
		mnumber.sendKeys(datanum);
	}
}
