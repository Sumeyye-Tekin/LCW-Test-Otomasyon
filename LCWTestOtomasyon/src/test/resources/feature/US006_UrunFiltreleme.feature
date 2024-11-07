Feature: LCW aranan urun filtreleme testi

  @Senaryo6 @All
  Scenario: TC01 kullanici aradigi urun icin filtreleme uygular
    Given kullanici LCW sayfasina gider
    Then kullanici "etek" kelimesini aratir
    Then kullanici cinsiyet bolumunden kadın secenegini secer
    Then secilen filtrelerin isaretlendigini dogrular
    Then filtrelenen urunleri listeler ve urunlerin "Etek" icerdigini dogrular
    And sayfayi kapatir

