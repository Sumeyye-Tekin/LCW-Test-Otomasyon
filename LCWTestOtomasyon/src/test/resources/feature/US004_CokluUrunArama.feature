Feature: LCW coklu urun arama test

  @Senaryo4 @All
  Scenario Outline: TC01 kullanici urun aramayı test eder
    Given kullanici LCW sayfasina gider
    Then kullanici "<arananKelime>" aratir
    Then sonucların "<dogrulananKelime>" icerdigini dogrular
    And sayfayi kapatir
    Examples:
      | arananKelime | dogrulananKelime |
      | terlik       | terlik           |
      | pantalon     | pantalon         |
      | elbise       | elbise           |



