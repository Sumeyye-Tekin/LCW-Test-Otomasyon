Feature:LCW giris test


  @Senaryo2 @All
  Scenario: TC01 kullanici LCW'a giris yapmayı test eder
    Given kullanici LCW sayfasina gider
    Then giris yap yazisi uzerine tiklar
    Then ilk kutucuga uygun olmayan bir adres yazar
    Then devam et butonuna tiklar
    Then HataBir mesajini gorur
    And sayfayi kapatir

  @Senaryo2 @All
  Scenario: TC01 kullanici LCW'a giris yapmayı test eder
    Given kullanici LCW sayfasina gider
    Then  giris yap yazisi uzerine tiklar
    Then kutucuga uygun olmayan bir telefon numarasini yazar
    Then "Lütfen telefon numaranızı başında 0 olmadan 10 karakter olarak giriniz." mesajini gorur
    And sayfayi kapatir


