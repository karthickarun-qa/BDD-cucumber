package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;
import java.util.List;

public class UsedCarsSearchPageActions {
	UsedCarSearchPageLocators usedCarSearchPageLocators=null;
	pages.locators.CarSearchPageLocators CarSearchPageLocators=null;

	public  UsedCarsSearchPageActions() {
		this.usedCarSearchPageLocators= new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

	public void selectCarMaker(String carBrand) {
		SeleniumDriver.getDriver().findElement(By.xpath(CarSearchPageLocators.searchContent)).click();
		Select selectCarMaker=new Select(usedCarSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel) {
		SeleniumDriver.getDriver().findElement(By.xpath(CarSearchPageLocators.searchContent)).click();
		Select selectCarModel=new Select(usedCarSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}

	public void selectLocation(String location){
		SeleniumDriver.getDriver().findElement(By.xpath(CarSearchPageLocators.searchContent)).click();
		Select selectLocation=new Select(usedCarSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}

	public void selectPrice(String price){
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='priceTo']")).click();
		Select selectPrice=new Select(usedCarSearchPageLocators.priceList);
		List<WebElement> list=selectPrice.getOptions();
		for(WebElement s:list){
			System.out.println("--->"+s.getText());
		}
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton() {
		SeleniumDriver.getDriver().findElement(By.xpath(CarSearchPageLocators.searchContent)).click();
		usedCarSearchPageLocators.findMyNextCarButton.click();
	}

}
