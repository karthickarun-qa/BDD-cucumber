package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how=How.XPATH,using=".//*[@id='makes']")
	public WebElement carMakerDropDown;
	
	@FindBy(how=How.XPATH,using=".//*[@id='models']")
	public WebElement selectModelDropDown;
	
	@FindBy(how=How.XPATH,using=".//*[@id='locations']")
	public WebElement selectLocation;
	
	@FindBy(how=How.XPATH,using=".//*[@id='priceTo']")
	public WebElement priceList;
	
	@FindBy(how=How.XPATH,using=".//*[@id='search-submit']")
	public WebElement findMyNextCarButton;

	public static String  searchContent =".//*[@id='block-system-main']/div/div/div/div/div/form";

}
