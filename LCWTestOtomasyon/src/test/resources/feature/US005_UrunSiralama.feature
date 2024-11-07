Feature: LCW aranan urun sıralama testi

  @Senaryo5 @All

  @Senaryo5 @All
  Scenario: Tc02 kullanici arattigi urunu en cok degerlendirilene gore siralar
    Given kullanici LCW sayfasina gider
    Then kullanici "etek" kelimesini aratir
    Then siralama kutucugundan en cok degerlendirilen secenegini secer
    Then birinci ve onuncu urunun degerlendirme sayisini karsilastirarak siralamayi dogrular
    And sayfayi kapatir

  Scenario: TC01 kullanici arattigi urunu en dusuk fiyata gore siralar
    Given kullanici LCW sayfasina gider
    Then kullanici "elbise" kelimesini aratir
    Then siralama kutucugundan en dusuk fiyat secenegini secer
    Then birinci ve onuncu urunun fiyatlarini karsilastirarak siralamayi dogrular
    And sayfayi kapatir

