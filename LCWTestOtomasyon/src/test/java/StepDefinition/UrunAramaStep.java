package StepDefinition;

import Pages.LCWIlkSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class UrunAramaStep {
    Actions actions = new Actions(Driver.getDriver());
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();
    SoftAssert softAssert = new SoftAssert();

    @Then("{string} kelimesini aratir")
    public void kelimesiniAratir(String arananKelime) {
        actions.click(lcwIlkSayfa.aramaButonu).perform();
        lcwIlkSayfa.aramaButonu.clear();
        lcwIlkSayfa.aramaButonu.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String dogrulananKelime) {
        Assert.assertTrue(lcwUrunAramaSayfasi.sonucWE.getText().contains(dogrulananKelime));
        softAssert.assertTrue(lcwUrunAramaSayfasi.sonucWE.getText().contains("listelendi"),"aranan ürün bulunamadı");
        ReusableMethods.waitFor(1);
    }
}
