package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LCWFavoriSayfa {
    public LCWFavoriSayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='product-card__title']")
    public List<WebElement> favoriUrunler;

    @FindBy(xpath = "(//*[@href=\"/favorilerim\"])[2]")
    public WebElement favoriTitle;
}
