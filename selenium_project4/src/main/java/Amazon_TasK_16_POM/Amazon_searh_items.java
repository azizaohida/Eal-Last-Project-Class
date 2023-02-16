package Amazon_TasK_16_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_searh_items {
WebDriver driver;
@FindBy(id = "twotabsearchtextbox")WebElement searchfield;


public    void     searchfieldbutton(String   searchitem) throws InterruptedException {
	
	searchfield.click();
	
searchfield.clear();
searchfield.sendKeys(searchitem);
Thread.sleep(2000);

}


public     Amazon_searh_items(WebDriver driver) { 
  this.driver = driver;
PageFactory.initElements(driver, this);
}




}
