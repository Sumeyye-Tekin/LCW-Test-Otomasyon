package StepDefinition;

import Pages.LCWIlkSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UrunSiralamaStep {
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Then("kullanici {string} kelimesini aratir")
    public void kullaniciKelimesiniAratir(String arananKelime) {
        lcwIlkSayfa.aramaButonu.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("siralama kutucugundan en cok degerlendirilen secenegini secer")
    public void siralamaKutucugundanEnCokDegerlendirilenSeceneginiSecer() {
        lcwUrunAramaSayfasi.siralaDD.click();
        ReusableMethods.waitFor(5);
        lcwUrunAramaSayfasi.siralaDDOptions.get(5).click();
        ReusableMethods.waitFor(2);
    }

    @Then("birinci ve onuncu urunun degerlendirme sayisini karsilastirarak siralamayi dogrular")
    public void birinciVeOnuncuUrununDegerlendirmeSayisiniKarsilastirarakSiralamayiDogrular() {
        String birinciUrunDegerlendirmeMetin = lcwUrunAramaSayfasi.degerlendirmeSayilari.get(0).getText();
        birinciUrunDegerlendirmeMetin = birinciUrunDegerlendirmeMetin.replaceAll("[^0-9]", "");
        int birinciUrunDegerlendirme = Integer.parseInt(birinciUrunDegerlendirmeMetin);
        System.out.println("Birinci ürün değerlendirme sayısı: " + birinciUrunDegerlendirme);

        String onuncuUrunDEgerlendirmeMetin = lcwUrunAramaSayfasi.degerlendirmeSayilari.get(9).getText();
        onuncuUrunDEgerlendirmeMetin = onuncuUrunDEgerlendirmeMetin.replaceAll("[^0-9]", "");
        int onuncuUrunDegerlendirme = Integer.parseInt(onuncuUrunDEgerlendirmeMetin);
        System.out.println("Onuncu ürün değerlendirme sayısı: " + onuncuUrunDegerlendirme);

        if (birinciUrunDegerlendirme < onuncuUrunDegerlendirme) throw new AssertionError();
        System.out.println("Birinci ürünün değerlendirilme sayısı onuncu üründen daha fazladır.");;
    }

    @Then("siralama kutucugundan en dusuk fiyat secenegini secer")
    public void siralamaKutucugundanEnDusukFiyatSeceneginiSecer() {
        lcwUrunAramaSayfasi.siralaDD.click();
        lcwUrunAramaSayfasi.siralaDDOptions.get(0).click();
        ReusableMethods.waitFor(3);
    }

    @Then("birinci ve onuncu urunun fiyatlarini karsilastirarak siralamayi dogrular")
    public void birinciVeOnuncuUrununFiyatlariniKarsilastirarakSiralamayiDogrular() {
        String birinciUrunFiyatMetin = lcwUrunAramaSayfasi.urunFiyatlari.get(0).getText();
        birinciUrunFiyatMetin = birinciUrunFiyatMetin.replaceAll("[^0-9]", "");
        Double birinciUrunFiyat = Double.parseDouble(birinciUrunFiyatMetin)/100;
        System.out.println("Birinci ürün fiyatı: " + birinciUrunFiyat);

        String onuncuUrunFiyatMetin = lcwUrunAramaSayfasi.urunFiyatlari.get(9).getText();
        onuncuUrunFiyatMetin = onuncuUrunFiyatMetin.replaceAll("[^0-9]", "");
        Double onuncuUrunFiyat = Double.parseDouble(onuncuUrunFiyatMetin)/100;
        System.out.println("Onuncu ürün fiyatı: " + onuncuUrunFiyat);

        if (birinciUrunFiyat > onuncuUrunFiyat) throw new AssertionError();
        System.out.println("Birinci ürünün fiyatı onuncu üründen daha düşüktür.");;
    }

}



