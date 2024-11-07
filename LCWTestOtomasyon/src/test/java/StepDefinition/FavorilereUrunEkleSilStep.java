package StepDefinition;

import Pages.LCWFavoriSayfa;
import Pages.LCWUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FavorilereUrunEkleSilStep {
    LCWUrunAramaSayfasi lcwUrunAramaSayfasi = new LCWUrunAramaSayfasi();
    LCWFavoriSayfa lcwFavoriSayfa = new LCWFavoriSayfa();
    Actions actions = new Actions(Driver.getDriver());
    String urunBir;
    String urunIki;

    @Then("ilk siradaki urunde favori iconuna tiklar")
    public void ilkSiradakiUrundeFavoriIconunaTiklar() {
        lcwUrunAramaSayfasi.favoriIcon.get(0).click();
        urunBir = lcwUrunAramaSayfasi.urunTitle.get(0).getText();
    }

    @Then("besinci siradaki urunde favorı iconuna tiklar")
    public void besinciSiradakiUrundeFavorıIconunaTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        urunIki = lcwUrunAramaSayfasi.urunResimleri.get(5).getText();
        if (lcwUrunAramaSayfasi.urunResimleri.get(6).isDisplayed()) {

        }else {actions.sendKeys(Keys.PAGE_DOWN).perform();}
        lcwUrunAramaSayfasi.favoriIcon.get(5).click();

    }

    @Then("favoriler bolumune giderek eklenen urunleri kontrol eder")
    public void favorilerBolumuneGiderekEklenenUrunleriKontrolEder() {
        lcwUrunAramaSayfasi.favorilerimIcon.click();
        ReusableMethods.waitForVisibility(lcwFavoriSayfa.favoriTitle,2);
        System.out.println(urunBir);
        System.out.println(urunIki);
        System.out.println(lcwFavoriSayfa.favoriUrunler.get(0).getText());
        System.out.println(lcwFavoriSayfa.favoriUrunler.get(1).getText());

        for (int i = 0; i < lcwFavoriSayfa.favoriUrunler.size(); i++) {
            System.out.println(lcwFavoriSayfa.favoriUrunler.get(i).getText());
        }
        for (WebElement eleman : lcwFavoriSayfa.favoriUrunler) {
            assert (eleman.getText().contains(urunBir)|| eleman.getText().contains(urunIki)) : eleman +  "Bulunamadı.";
        }
    }

    @Then("eklediigi urunleri favorilerden kaldirir")
    public void eklediigiUrunleriFavorilerdenKaldirir() {
    }

    @Then("urunlerin kaldirildigini dogrular")
    public void urunlerinKaldirildiginiDogrular() {
    }
}
