package StepDefinition;

import Pages.LCWHizliInceleSayfa;
import Pages.LCWSepetSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SiparisOzetiGoruntulemeStep {
    LCWHizliInceleSayfa lcwHizliInceleSayfa = new LCWHizliInceleSayfa();
    LCWSepetSayfa lcwSepetSayfa = new LCWSepetSayfa();
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    Double toplamFiyat;

    @Then("altinci siradaki urundeki hizli ekle kismina tiklar")
    public void altinciSiradakiUrundekiHizliEkleKisminaTiklar() {
        ReusableMethods.hover(lcwUrunAramaSayfasi.urunResimleri.get(5));
        ReusableMethods.waitForVisibility(lcwUrunAramaSayfasi.hizliIncele,2);
        lcwUrunAramaSayfasi.hizliIncele.click();
        ReusableMethods.waitFor(2);
    }

    @Then("geri tusuna basar")
    public void geriTusunaBasar() {
        lcwHizliInceleSayfa.geriTusu.click();
    }

    @Then("siparis ozetinin gorundugunu dogrular")
    public void siparisOzetininGorundugunuDogrular() {
        ReusableMethods.waitForVisibility(lcwSepetSayfa.siparisOzetBox,2);
        Assert.assertTrue(lcwSepetSayfa.siparisOzetBox.isDisplayed());
    }

    @Then("sepetteki urunlerin fiyatini toplar")
    public void sepettekiUrunlerinFiyatiniToplar() {
        String urunFiyatIki = lcwSepetSayfa.urunFiyatList.get(0).getText().replaceAll("[^0-9,]", "").replace(",", ".");
        Double urunFiyat2 = Double.parseDouble(urunFiyatIki) ;
        System.out.println(urunFiyat2);
        String urunFiyatBir = lcwSepetSayfa.urunFiyatList.get(1).getText().replaceAll("[^0-9,]", "").replace(",", ".");
        Double urunFiyat1 = Double.parseDouble(urunFiyatBir) ;
        System.out.println(urunFiyat1);
        toplamFiyat = urunFiyat1 + urunFiyat2;
        System.out.println(toplamFiyat);
    }


    @Then("toplamin siparis ozetiyle ayni oldugunu dogrular")
    public void toplaminSiparisOzetiyleAyniOldugunuDogrular() {
        System.out.println(toplamFiyat);
        String siparisToplamText = lcwSepetSayfa.araToplam.getText()
                .replaceAll("[^0-9,]", "").replace(",", ".");
        Double siparisToplam = Double.parseDouble(siparisToplamText);
        System.out.println(siparisToplam);
        Assert.assertEquals(siparisToplam,toplamFiyat);
    }


}

