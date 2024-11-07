Feature: LCW urun arama test

  @Senaryo3 @All
  Scenario: TC01 kullanici urun aratır
    Given kullanici LCW sayfasina gider
    Then "ceket" kelimesini aratir
    Then sonuclarin "ceket" icerdigini test eder
    And sayfayi kapatir

  @Senaryo3 @All
  Scenario: TC02 kullanici urun aratir
    Then kullanici LCW sayfasina gider
    Then "etek" kelimesini aratir
    Then sonuclarin "etek" icerdigini test eder
    Then "elbise" kelimesini aratir
    Then sonuclarin "elbise" icerdigini test eder
    And sayfayi kapatir