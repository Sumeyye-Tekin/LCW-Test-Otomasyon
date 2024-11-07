package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class LCWSepetSayfa {
    public LCWSepetSayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='row mb-5']")
    public List<WebElement> urunBox;

    @FindBy(xpath = "//*[@class='col-md-12 cart-header mb-20']")
    public WebElement sepetBaslik;

    @FindBy(xpath = "//*[@class='oq-up plus']")
    public List<WebElement> arttir;

    @FindBy(xpath = "oq-down minus")
    public List<WebElement> azalt;

    @FindBy(xpath = "//*[@class='item-quantity-input ignored']")
    public List<WebElement> urunSayi;

    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement urunSil;
    @FindBy(xpath = "//*[@style='cursor: pointer;']")
    public WebElement secilenleriSil;

    @FindBy(xpath = "//*[@id='Cart_ProductDelete']")
    public WebElement alertSil;

    @FindBy(xpath = "//*[@class='cart-empty-title']")
    public WebElement urunBulunmuyor;

    @FindBy(xpath = "//*[@class='price-info-area']")
    public WebElement siparisOzetBox;

    @FindBy(xpath = "//*[@class='rd-cart-item-price mb-15']")
    public List<WebElement> urunFiyatList;

    @FindBy(xpath = "//*[@id=\"ShoppingCartContent\"]/div[1]/div[3]/div[2]/div[4]/div/span[2]")
    public WebElement araToplam;
}
