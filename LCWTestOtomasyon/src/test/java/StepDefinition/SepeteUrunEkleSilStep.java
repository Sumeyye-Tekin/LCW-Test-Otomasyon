package StepDefinition;

import Pages.LCWHizliInceleSayfa;
import Pages.LCWSepetSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class SepeteUrunEkleSilStep {
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    LCWHizliInceleSayfa lcwHizliInceleSayfa = new LCWHizliInceleSayfa();
    LCWSepetSayfa lcwSepetSayfa = new LCWSepetSayfa();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    double urunSayisi = 0;

    @Then("ilk siradaki urunde hizli ekle kismina tiklar")
    public void ilkSiradakiUrundeHizliEkleKisminaTiklar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        if (lcwUrunAramaSayfasi.urunResimleri.get(6).isDisplayed()) {

        }else {actions.sendKeys(Keys.PAGE_DOWN).perform();}


        ReusableMethods.hover(lcwUrunAramaSayfasi.urunResimleri.get(0));
        ReusableMethods.waitForVisibility(lcwUrunAramaSayfasi.hizliIncele,2);
        lcwUrunAramaSayfasi.hizliIncele.click();
        ReusableMethods.waitFor(2);
    }

    @Then("acilan bolumde ilk bedeni secer ve sepete ekle kismina tiklar")
    public void acilanBolumdeIlkBedeniSecerVeSepeteEkleKisminaTiklar() {
        ReusableMethods.waitForClickablility(lcwHizliInceleSayfa.bedenler.get(0),2);
        lcwHizliInceleSayfa.bedenler.get(0).click();
        ReusableMethods.waitFor(1);
        lcwHizliInceleSayfa.sepeteEkle.click();
        ReusableMethods.waitForVisibility(lcwHizliInceleSayfa.sepeteEklendi,2);
        urunSayisi += 1;
    }

    @Then("geri tusuna basar ve sepete gider")
    public void geriTusunaBasarVeSepeteGider() {
        lcwHizliInceleSayfa.geriTusu.click();
        ReusableMethods.waitForClickablility(lcwUrunAramaSayfasi.sepetIcon,2);
        lcwUrunAramaSayfasi.sepetIcon.click();
    }

    @Then("sepete eklenen urunler kontrol eder")
    public void sepeteEklenenUrunlerKontrolEder() {
       ReusableMethods.waitForVisibility(lcwSepetSayfa.sepetBaslik,2);
        Assert.assertTrue(lcwSepetSayfa.urunBox.get(0).isDisplayed());
    }

    @Then("sepetteki urun sayisini {int} arttirir")
    public void sepettekiUrunSayisiniArttirir(int sayi1) {
        urunSayisi += sayi1;
        actions.click(lcwSepetSayfa.arttir.get(0)).perform();
        ReusableMethods.waitFor(1);
        actions.click(lcwSepetSayfa.arttir.get(0)).perform();
        ReusableMethods.waitFor(1);
        String value = lcwSepetSayfa.urunSayi.get(0).getAttribute("value");
        int valueSayi = Integer.parseInt(value);
        System.out.println(valueSayi);
        softAssert.assertEquals(value,urunSayisi,"Beklenen değer ile gerçek değer eşleşmiyor");
        ReusableMethods.waitFor(1);
    }


    @Then("sepetteki urunleri kaldirir")
    public void sepettekiUrunleriKaldirir() {
        lcwSepetSayfa.secilenleriSil.click();
        ReusableMethods.waitForVisibility(lcwSepetSayfa.alertSil,2);
        lcwSepetSayfa.alertSil.click();
    }

    @Then("urunlerin sepetten kaldirildigini dogrular")
    public void urunlerinSepettenKaldirildiginiDogrular() {
        ReusableMethods.waitForVisibility(lcwSepetSayfa.urunBulunmuyor,2);
        Assert.assertTrue(lcwSepetSayfa.urunBulunmuyor.getText().contains("Sepetinizde ürün bulunmamaktadır."));
    }
}
