package StepDefinition;

import Pages.LCWGirisSayfa;
import Pages.LCWIlkSayfa;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class HataliGirisStep {
    LCWIlkSayfa lcwIlkSayfa = new LCWIlkSayfa();
    LCWGirisSayfa lcwGirisSayfa = new LCWGirisSayfa();
    Actions actions = new Actions(Driver.getDriver());

    @Then("giris yap yazisi uzerine tiklar")
    public void girisYapYazisiUzerineTiklar() {
        ReusableMethods.waitForClickablility(lcwIlkSayfa.girisYap, 3).click();
        lcwIlkSayfa.girisYap.click();
    }

    @Then("ilk kutucuga uygun olmayan bir adres yazar")
    public void ilkKutucugaUygunOlmayanBirAdresYazar() {
        ReusableMethods.waitForVisibility(lcwGirisSayfa.girisBaslik, 2);

        lcwGirisSayfa.girisTextBox.click();
        lcwGirisSayfa.girisTextBox.sendKeys(ConfigReader.getProperty("H.eposta"));

    }


    @Then("devam et butonuna tiklar")
    public void devamEtButonunaTiklar() {
        lcwGirisSayfa.devamEt.click();
    }


    @Then("HataBir mesajini gorur")
    public void hataBirMesajiniGorur() {

        Assert.assertTrue(lcwGirisSayfa.hataMesaji.isDisplayed());
        Assert.assertTrue(lcwGirisSayfa.hataMesaji.getText().contains(ConfigReader.getProperty("Hata1")));
    }


    @Then("kutucuga uygun olmayan bir telefon numarasini yazar")
    public void kutucugaUygunOlmayanBirTelefonNumarasiniYazar() {
        ReusableMethods.waitForVisibility(lcwGirisSayfa.girisBaslik, 2);
        lcwGirisSayfa.girisTextBox.click();
        lcwGirisSayfa.girisTextBox.sendKeys(ConfigReader.getProperty("H.telefon"), Keys.ENTER);
    }


    @Then("{string} mesajini gorur")
    public void mesajiniGorur(String Hata2) {

        Assert.assertTrue(lcwGirisSayfa.hataMesaji.getText().contains(Hata2));
    }


}


