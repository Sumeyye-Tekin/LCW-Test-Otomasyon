package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LCWUrunAramaSayfasi {
    public LCWUrunAramaSayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='product-list-heading__product-count']")
    public WebElement sonucWE;

    @FindBy(xpath = "//*[@class='product-list-heading__heading']")
    public WebElement sonucKategori;

    @FindBy(xpath = "//*[@class='dropdown-button__button']")
    public WebElement siralaDD;

    @FindBy(xpath = "//*[@class='dropdown-button__option']")
    public List<WebElement> siralaDDOptions;

    @FindBy(xpath = "//*[@class='product-price__price product-price__price--only']")
    public List<WebElement> urunFiyatlari;

    @FindBy(xpath = "//*[@class='product-card__review-count ']")
    public List<WebElement> degerlendirmeSayilari;

    @FindBy(xpath = "(//*[@class= 'filter-option__text'])[1]")
    public WebElement filtreKadin;

    @FindBy(xpath = "(//*[@class='filter-option__text'])[5]")
    public WebElement filtreUrunTip;

    @FindBy(xpath = "//*[@class='filter-option filter-option--selected']")
    public WebElement filtreSecili;

    @FindBy(xpath = "(//*[@class='cookieseal-banner-button'])[2]")
    public WebElement cerezReddet;

    @FindBy(xpath = "//*[@class='desktop-quick-look']")
    public WebElement hizliIncele;

    @FindBy(xpath = "//*[@class='product-image']")
    public List<WebElement> urunResimleri;

    @FindBy(xpath = "(//*[@class='header-dropdown-toggle'])[3]")
    public WebElement sepetIcon;

    @FindBy(xpath = "//*[@class='lcw-breadcrumb-home-icon']")
    public WebElement homeIcon;

    @FindBy(xpath = "//*[@id='icon-not-liked']")
    public List<WebElement> favoriIcon;

    @FindBy(xpath = "//*[@class='product-card__title']")
    public List<WebElement> urunTitle;

    @FindBy(xpath = "(//*[@class='header-dropdown-toggle'])[2]")
    public WebElement favorilerimIcon;
}
