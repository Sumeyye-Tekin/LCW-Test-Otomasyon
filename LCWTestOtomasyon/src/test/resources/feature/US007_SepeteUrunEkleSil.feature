Feature: LCW sepet testi

  @Senaryo7 @All
  Scenario: TC01 kullanici sepete urun ekler ve sepetten ürün siler
    Given kullanici LCW sayfasina gider
    Then kullanici "elbise" kelimesini aratir
    Then ilk siradaki urunde hizli ekle kismina tiklar
    Then acilan bolumde ilk bedeni secer ve sepete ekle kismina tiklar
    Then geri tusuna basar ve sepete gider
    Then sepete eklenen urunler kontrol eder
    Then sepetteki urun sayisini 2 arttirir
    Then sepetteki urunleri kaldirir
    Then urunlerin sepetten kaldirildigini dogrular
    And sayfayi kapatir