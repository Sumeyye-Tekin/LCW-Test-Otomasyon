package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LCWHizliInceleSayfa {
    public LCWHizliInceleSayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='size-height-value-box size-height-value-box__stripped size-height-value-box__desktop']")
    public List<WebElement> bedenler;

    @FindBy(xpath = "//*[@class='product-add-to-cart ']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//*[@class='product-add-to-cart product-add-to-cart__added']")
    public WebElement sepeteEklendi;

    @FindBy(xpath = "//*[@class='desktop-quick-look__title-icon']")
    public WebElement geriTusu;

}
