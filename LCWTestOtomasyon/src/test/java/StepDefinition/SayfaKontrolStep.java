package StepDefinition;

import Pages.LCWIlkSayfa;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SayfaKontrolStep {
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();

    @Given("kullanici LCW sayfasina gider")
    public void kullaniciLCWSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("lcwURL"));
        lcwIlkSayfa.cerezReddet.click();

    }

    @Then("sayfanin başliginin {string} icerdigini dogrular")
    public void sayfaninBasligininIcerdiginiDogrular(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
        System.out.println("Sayfa başlığı: "+ Driver.getDriver().getTitle());
    }

    @Then("sayfanin URL sinin {string} icerdigini dogrular")
    public void sayfaninURLSininIcerdiginiDogrular(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
        System.out.println("Sayfa URL'Sİ: "+ Driver.getDriver().getCurrentUrl());
    }

    @Then("sayfada LCW logosunun gozuktugunu dogrular")
    public void sayfadaLCWLogosununGozuktugunuDogrular() {
        Assert.assertTrue(lcwIlkSayfa.LCWLogo.isDisplayed());
        System.out.println("Logo görünüyor.");
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
