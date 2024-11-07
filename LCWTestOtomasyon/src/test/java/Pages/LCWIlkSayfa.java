package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class LCWIlkSayfa {
    public LCWIlkSayfa(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='main-header-logo']")
    public WebElement LCWLogo;

    @FindBy(xpath = "(//*[@class='dropdown-label'])[1]")
    public WebElement girisYap;

    @FindBy(xpath = "//*[@id='cookieseal-banner-reject']")
    public  WebElement cerezReddet;

    @FindBy(xpath = "//*[@class='search-form__input-field__search-input']")
    public WebElement aramaButonu;

    @FindBy(xpath = "//*[@class='passive-search-bar__button']")
    public WebElement araIcon;

    @FindBy(xpath = "//*[@class='menu-header-item__title']")
    public List<WebElement> KategoriBasliklari;

    @FindBy(xpath = "//*[@class='zone-item']")
    public List<WebElement> kategoriUrunleri;
    }