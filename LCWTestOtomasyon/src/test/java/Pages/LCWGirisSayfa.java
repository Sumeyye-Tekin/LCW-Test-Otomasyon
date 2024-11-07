package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LCWGirisSayfa {
    public LCWGirisSayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='text-input']")
    public WebElement girisTextBox;

    @FindBy(xpath = "text-input input-error")
    public  WebElement hataliGirisTextBox;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement devamEt;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement girisBaslik;

    @FindBy(xpath = "//*[@class='error']")
    public WebElement hataMesaji;

    @FindBy(xpath = "//*[@class='search-form__input-field__close-wrapper']")
    public WebElement kapat;

}
