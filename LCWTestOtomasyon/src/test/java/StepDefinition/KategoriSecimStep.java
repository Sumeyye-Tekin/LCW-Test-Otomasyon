package StepDefinition;

import Pages.LCWIlkSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class KategoriSecimStep {
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();

    @Then("aksesuar yazisi üzerine gelir")
    public void aksesuarYazisiUzerineGelir() {

        ReusableMethods.hover(lcwIlkSayfa.KategoriBasliklari.get(4));
    }

    @Then("acilan bolumden sirt cantasi secenegini secer")
    public void acilanBolumdenSirtCantasiSeceneginiSecer() {
        Driver.getDriver().findElement(By.xpath("//*[text()='Sırt Çantası']")).click();
        ReusableMethods.waitFor(1);
    }

    @Then("gelen sonucların {string} icerdigini dogrular")
    public void gelenSonuclarınIcerdiginiDogrular(String dogrulananKelime) {
        System.out.println(lcwUrunAramaSayfasi.sonucKategori.getText());
        Assert.assertTrue(lcwUrunAramaSayfasi.sonucKategori.getText().contains(dogrulananKelime));
    }

    @Then("ayakkabi yazisi üzerine gelir")
    public void ayakkabiYazisiUzerineGelir() {
        Driver.getDriver().navigate().back();
        ReusableMethods.hover(lcwIlkSayfa.KategoriBasliklari.get(3));
        Driver.getDriver().findElement(By.xpath("(//*[text()='Bot'])[2]")).click();
        ReusableMethods.waitFor(1);


    }

    @Then("acilan bolumden bot secenegini secer")
    public void acilanBolumdenBotSeceneginiSecer() {
    }
}
