package StepDefinition;
import Pages.LCWGirisSayfa;
import Pages.LCWIlkSayfa;
import Utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import Pages.LCWUrunAramaSayfasi;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UrunFıltrelemStep {
    String secimText;
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));

    @Then("kullanici cinsiyet bolumunden kadın secenegini secer")
    public void kullaniciCinsiyetBolumundenKadınSeceneginiSecer() {
        lcwUrunAramaSayfasi.filtreKadin.click();
        ReusableMethods.waitFor(1);
    }


    @Then("secilen filtrelerin isaretlendigini dogrular")
    public void secilenFiltrelerinIsaretlendiginiDogrular() {
        List<WebElement> secimler = Driver.getDriver().findElements(By.xpath("//*[@class='filter-option filter-option--selected']"));
        System.out.println(secimler.size());

        for (WebElement a : secimler) {
            System.out.println(a.getText());
            secimText = a.getText();
        }
        Assert.assertTrue(secimText.contains("Kadın") );
    }

    @Then("filtrelenen urunleri listeler ve urunlerin {string} icerdigini dogrular")
    public void filtrelenenUrunleriListelerVeUrunlerinIcerdiginiDogrular(String arananKelime) {
        List<WebElement> urunler = Driver.getDriver().findElements(By.xpath("//*[@class='product-card__title']"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        System.out.println(urunler.size());
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(urunler.get(i).getText());
        }
        for (WebElement eleman : urunler) {
            assert (eleman.getText().contains(arananKelime)) : eleman + " " + arananKelime + " kelimesini içermiyor.";
        }
    }
}




