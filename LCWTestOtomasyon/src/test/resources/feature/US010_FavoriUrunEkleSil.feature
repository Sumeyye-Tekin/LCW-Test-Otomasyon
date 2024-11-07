Feature: LCW favoriler testi

  @Senaryo10 @All
  Scenario: TC01 kullanici sepete urun ekler ve sepetten ürün siler
    Given kullanici LCW sayfasina gider
    Then "pantalon" kelimesini aratir
    Then ilk siradaki urunde favori iconuna tiklar
    Then besinci siradaki urunde favorı iconuna tiklar
    Then favoriler bolumune giderek eklenen urunleri kontrol eder
    Then eklediigi urunleri favorilerden kaldirir
    Then urunlerin kaldirildigini dogrular
    And sayfayi kapatir