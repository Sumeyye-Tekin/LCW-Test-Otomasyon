package StepDefinition;

import Pages.LCWIlkSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CokluUrunAramaStep {
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();

    @Then("kullanici {string} aratir")
    public void kullaniciAratir(String arananKelime) {
        lcwIlkSayfa.aramaButonu.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("sonucların {string} icerdigini dogrular")
    public void sonuclarınIcerdiginiDogrular(String dogrulananKelime) {
        Assert.assertTrue(lcwUrunAramaSayfasi.sonucWE.getText().contains(dogrulananKelime));

    }
}
