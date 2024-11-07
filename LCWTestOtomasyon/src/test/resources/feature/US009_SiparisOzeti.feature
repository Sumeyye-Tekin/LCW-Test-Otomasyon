Feature: LCW sipariş ozeti goruntuleme testi

  @Senaryo9 @All
    Scenario: TC01 kullanici sepet sayfasında siparis ozetini goruntuler
    Given kullanici LCW sayfasina gider
    Then "gömlek" kelimesini aratir
    Then ilk siradaki urunde hizli ekle kismina tiklar
    Then acilan bolumde ilk bedeni secer ve sepete ekle kismina tiklar
    Then geri tusuna basar
    Then altinci siradaki urundeki hizli ekle kismina tiklar
    Then acilan bolumde ilk bedeni secer ve sepete ekle kismina tiklar
    Then geri tusuna basar ve sepete gider
    Then sepete eklenen urunler kontrol eder
    Then siparis ozetinin gorundugunu dogrular
    Then sepetteki urunlerin fiyatini toplar
    Then toplamin siparis ozetiyle ayni oldugunu dogrular
    And sayfayi kapatir