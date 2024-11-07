Feature: LCW kategori secim testi

  @Senaryo8 @All
  Scenario: TC01 kullanici tum kategorilerden secim yapar
    Given kullanici LCW sayfasina gider
    Then aksesuar yazisi üzerine gelir
    Then acilan bolumden sirt cantasi secenegini secer
    Then gelen sonucların "Sırt Çantası" icerdigini dogrular
    Then ayakkabi yazisi üzerine gelir
    Then acilan bolumden bot secenegini secer
    Then gelen sonucların "Bot" icerdigini dogrular
    And sayfayi kapatir