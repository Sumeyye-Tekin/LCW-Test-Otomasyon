Feature: LCW sayfa kontrolleri

  @Senaryo1 @All
  Scenario: TC01 kullanici sitenin kontrollerini yapar
    Given kullanici LCW sayfasina gider
    Then sayfanin başliginin "LCW" icerdigini dogrular
    Then sayfanin URL sinin "lcw" icerdigini dogrular
    Then sayfada LCW logosunun gozuktugunu dogrular
    And sayfayi kapatir
